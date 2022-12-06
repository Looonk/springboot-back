package cu.uci.cesim.hce_back.estadisticas.service;

import cu.uci.cesim.hce_back.estadisticas.model.entity.auto.Servicio_estadisticas;
import cu.uci.cesim.hce_back.estadisticas.model.repository.ServicioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicioService {

    @Autowired
    ServicioRepository servicioRepository;

    public List<Servicio_estadisticas> getServiciosEntidad(Long idEntidad) {
        return servicioRepository.getServicios(idEntidad);
    }

    public Servicio_estadisticas findById(Long idServicio) {
        return servicioRepository.findById(idServicio);
    }
}
