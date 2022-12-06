package cu.uci.cesim.hce_back.estadisticas.service;

import cu.uci.cesim.hce_back.estadisticas.model.entity.auto.Entidad_estadisticas;
import cu.uci.cesim.hce_back.estadisticas.model.repository.EntidadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EntidadService {

    @Autowired
    EntidadRepository entidadRepository;

    public List<Entidad_estadisticas> getAllEntidades() {
        return entidadRepository.getAllEntidades();
    }

    public Entidad_estadisticas findById(Long idEntidad) {
        return entidadRepository.findById(idEntidad);
    }
}
