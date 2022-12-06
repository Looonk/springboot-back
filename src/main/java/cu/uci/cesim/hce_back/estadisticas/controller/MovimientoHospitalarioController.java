package cu.uci.cesim.hce_back.estadisticas.controller;

import cu.uci.cesim.hce_back.estadisticas.model.entity.auto.Entidad_estadisticas;
import cu.uci.cesim.hce_back.estadisticas.model.entity.auto.Servicio_estadisticas;
import cu.uci.cesim.hce_back.estadisticas.model.entity.custom.MovimientoHospitalarioCustom_estadisticas;
import cu.uci.cesim.hce_back.estadisticas.service.EntidadService;
import cu.uci.cesim.hce_back.estadisticas.service.MovimientoHosppitalarioService;
import cu.uci.cesim.hce_back.estadisticas.service.ServicioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/movhosp/")
public class MovimientoHospitalarioController {

    @Autowired
    MovimientoHosppitalarioService movimientoHospitalarioService;

    @Autowired
    EntidadService entidadService;

    @Autowired
    ServicioService servicioService;

    @RequestMapping("/cierre/{idEntidad}/{idServicio}")
    public MovimientoHospitalarioCustom_estadisticas CierreMovimientoHospitalario(@PathVariable Long idEntidad, @PathVariable Long idServicio) {
        Entidad_estadisticas entidad = entidadService.findById(idEntidad);
        MovimientoHospitalarioCustom_estadisticas movimientoHospitalarioCustom_estadisticas = new MovimientoHospitalarioCustom_estadisticas();
        int diasCama = 0;
        if (idServicio == 0 || idServicio == null) {
            diasCama = movimientoHospitalarioService.DiasCamasActualEntidad(idEntidad);
        } else {
            diasCama = movimientoHospitalarioService.DiasCamasActualServicio(idEntidad, idServicio);
            Servicio_estadisticas servicio = servicioService.findById(idServicio);
            movimientoHospitalarioCustom_estadisticas.setIdServicio(servicio.getId());
            movimientoHospitalarioCustom_estadisticas.setNombreServicio(servicio.getNombre());
        }
        movimientoHospitalarioCustom_estadisticas.setDiasCama(diasCama);
        movimientoHospitalarioCustom_estadisticas.setIdEntidad(entidad.getId());
        movimientoHospitalarioCustom_estadisticas.setNombreEntidad(entidad.getNombre());

        return movimientoHospitalarioCustom_estadisticas;

    }
}
