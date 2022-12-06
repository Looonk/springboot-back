package cu.uci.cesim.hce_back.estadisticas.model.repository;

import cu.uci.cesim.hce_back.estadisticas.model.entity.auto.Entidad_estadisticas;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class EntidadRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public List<Entidad_estadisticas> getAllEntidades() {
        List<Entidad_estadisticas> entidades = entityManager.createQuery("select  e from Entidad_estadisticas e").getResultList();

        return entidades;
    }

    public Entidad_estadisticas findById(Long idEntidad) {
        return entityManager.find(Entidad_estadisticas.class, idEntidad);
    }
}
