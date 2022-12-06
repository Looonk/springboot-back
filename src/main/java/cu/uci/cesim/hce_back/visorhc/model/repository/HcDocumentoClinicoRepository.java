package cu.uci.cesim.hce_back.visorhc.model.repository;

import cu.uci.cesim.hce_back.visorhc.model.entity.auto.HcDocumentoClinico_visorhc;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class HcDocumentoClinicoRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public List<HcDocumentoClinico_visorhc> DocumentosPersona(Long idPersona) {
        List<HcDocumentoClinico_visorhc> documentos = entityManager.createQuery("select  d from HcDocumentoClinico_visorhc d " +
                        "where d.ultimaRevision = true and d.hcPersona.id = :idPersona").setParameter("idPersona", idPersona)
                .getResultList();

        return documentos;
    }

    public List<HcDocumentoClinico_visorhc> DocumentosPersona(String numeroHc) {
        List<HcDocumentoClinico_visorhc> documentos = entityManager.createQuery("select  d from HcDocumentoClinico_visorhc d " +
                        "where d.ultimaRevision = true and d.hcPersona.numeroHc = :numeroHc").setParameter("numeroHc", numeroHc)
                .getResultList();

        return documentos;
    }
}
