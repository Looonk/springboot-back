package cu.uci.cesim.hce_back.visorhc.model.repository;

import cu.uci.cesim.hce_back.visorhc.model.entity.auto.HcPersona_visorhc;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class HcPersonaRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @SuppressWarnings("unchecked")
    public List<HcPersona_visorhc> getHcPersonas(String numeroHc) {
        List<HcPersona_visorhc> personas = entityManager.createQuery("select  p from HcPersona_visorhc p " +
                        "where p.numeroHc = :numeroHc").setParameter("numeroHc", numeroHc)
                .getResultList();

        return personas;
    }

    @SuppressWarnings("unchecked")
    public List<HcPersona_visorhc> getHcPersonas(String nombre, String apellido1, String apellido2, String noidentidad) {


        String query = "";
        if (nombre != null && nombre != "")
            query = "where nombre = :nombre ";
        if (apellido1 != null && apellido1 != "")
            query += query == "" ? "where apellido1 = :apellido1 " : "and apellido1 = :apellido1 ";
        if (apellido2 != null && apellido2 != "")
            query += query == "" ? "where apellido2 = :apellid2 " : "and apellido2 = :apellido2 ";
        if (noidentidad != null && noidentidad != "")
            query += query == "" ? "where noidentidad = :noidentidad " : "and noidentidad = :noidentidad ";

        Query queryResult = entityManager.createQuery("select  p from HcPersona_visorhc p " + query);

        if (nombre != null && nombre != "")
            queryResult.setParameter("nombre", nombre);
        if (apellido1 != null && apellido1 != "")
            queryResult.setParameter("apellido1", apellido1);
        if (apellido2 != null && apellido2 != "")
            queryResult.setParameter("apellido2", apellido2);
        if (noidentidad != null && noidentidad != "")
            queryResult.setParameter("noidentidad", noidentidad);

        List<HcPersona_visorhc> personas = queryResult.getResultList();

        return personas;
    }

}
