package cu.uci.cesim.hce_back.estadisticas.controller;

import cu.uci.cesim.hce_back.estadisticas.model.entity.auto.Servicio_estadisticas;
import cu.uci.cesim.hce_back.estadisticas.service.ServicioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/servicio")
public class ServicioController {

    @Autowired
    ServicioService servicioService;

    @RequestMapping(path = "/serviciosentidad/{idEntidad}", method = RequestMethod.GET)
    public List<Servicio_estadisticas> getServiciosEntidad(@PathVariable Long idEntidad) {
        return servicioService.getServiciosEntidad(idEntidad);
    }
}
