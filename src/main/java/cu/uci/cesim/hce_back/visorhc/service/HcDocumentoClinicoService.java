package cu.uci.cesim.hce_back.visorhc.service;

import cu.uci.cesim.hce_back.visorhc.model.entity.auto.HcDocumentoClinico_visorhc;
import cu.uci.cesim.hce_back.visorhc.model.repository.HcDocumentoClinicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HcDocumentoClinicoService {

    @Autowired
    HcDocumentoClinicoRepository hcDocumentoClinicoRepository;

    public List<HcDocumentoClinico_visorhc> DocumentosPersona(Long idPersona) {
        List<HcDocumentoClinico_visorhc> documentos = hcDocumentoClinicoRepository.DocumentosPersona(idPersona);

        return documentos;
    }

    public List<HcDocumentoClinico_visorhc> DocumentosPersona(String numeroHc) {
        List<HcDocumentoClinico_visorhc> documentos = hcDocumentoClinicoRepository.DocumentosPersona(numeroHc);

        return documentos;
    }
}
