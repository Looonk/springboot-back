package cu.uci.cesim.hce_back.estadisticas.model.repository;

import cu.uci.cesim.hce_back.estadisticas.model.entity.auto.Servicio_estadisticas;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class ServicioRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @SuppressWarnings("unchecked")
    public List<Servicio_estadisticas> getServicios(Long idEntidad) {
        List<Servicio_estadisticas> servicios = entityManager.createQuery("select  s from Servicio_estadisticas s " +
                        "inner join s.servicioInEntidads sie " +
                        "inner join sie.entidad e " +
                        "where e.id = :idEntidad").setParameter("idEntidad", idEntidad)
                .getResultList();

        return servicios;
    }

    public Servicio_estadisticas findById(Long idServicio) {
        return entityManager.find(Servicio_estadisticas.class, idServicio);
    }
}
