package cu.uci.cesim.hce_back.estadisticas.controller;

import cu.uci.cesim.hce_back.estadisticas.model.entity.auto.Entidad_estadisticas;
import cu.uci.cesim.hce_back.estadisticas.service.EntidadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/entidad")
public class EntidadController {

    @Autowired
    EntidadService entidadService;

    @RequestMapping("/all")
    public List<Entidad_estadisticas> getAllEntidades() {
        return entidadService.getAllEntidades();
    }
}
