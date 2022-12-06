package cu.uci.cesim.hce_back.estadisticas.model.repository;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Repository
@Transactional
public class CamasRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public int totalDiasCamaActualEntidad(Long idEntidad) {
        int totalDiasCama = 0;
        totalDiasCama = ((Long) entityManager.createQuery("select sum(hc.cantidad) from CamasHistorico_estadisticas hc " +
                        "where hc.estadoCama.id <> 0 and hc.estadoCama.id <> 4 and hc.estadoCama.id <> 1001000000000000006 " +
                        "and hc.fecha = (select max(hc2.fecha) from CamasHistorico_estadisticas hc2 where hc2.entidad.id = :idEntidad) " +
                        "and hc.entidad.id = :idEntidad")
                .setParameter("idEntidad", idEntidad).getSingleResult()).intValue();
        return totalDiasCama;
    }

    public int totalDiasCamaActualServicio(Long idEntidad, Long idServicio) {
        int totalDiasCama = 0;
        totalDiasCama = ((Long) entityManager.createQuery("select sum(hc.cantidad) from CamasHistorico_estadisticas hc " +
                        "where hc.estadoCama.id <> 0 and hc.estadoCama.id <> 4 and hc.estadoCama.id <> 1001000000000000006 " +
                        "and hc.fecha = (select max(hc2.fecha) from CamasHistorico_estadisticas hc2 where hc2.entidad.id = :idEntidad and hc2.servicio.id = :idServicio) " +
                        "and hc.entidad.id = :idEntidad and hc.servicio.id = :idServicio")
                .setParameter("idEntidad", idEntidad)
                .setParameter("idServicio", idServicio).getSingleResult()).intValue();
        return totalDiasCama;
    }


}
