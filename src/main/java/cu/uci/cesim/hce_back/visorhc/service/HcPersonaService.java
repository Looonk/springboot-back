package cu.uci.cesim.hce_back.visorhc.service;

import cu.uci.cesim.hce_back.visorhc.model.entity.auto.HcPersona_visorhc;
import cu.uci.cesim.hce_back.visorhc.model.repository.HcPersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HcPersonaService {

    @Autowired
    HcPersonaRepository hcPersonaRepository;

    public List<HcPersona_visorhc> SearchHcPersonas(String numeroHc) {
        return hcPersonaRepository.getHcPersonas(numeroHc);
    }

    public List<HcPersona_visorhc> SearchHcPersonas(String nombre, String apellido1, String apellido2, String noidentidad) {
        return hcPersonaRepository.getHcPersonas(nombre, apellido1, apellido2, noidentidad);
    }
}
