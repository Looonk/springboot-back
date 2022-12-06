package cu.uci.cesim.hce_back.estadisticas.controller;

import cu.uci.cesim.hce_back.estadisticas.model.entity.custom.ConsultasXEspecialidadCustom;
import cu.uci.cesim.hce_back.estadisticas.service.ConsultaExternaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/ce")
public class ConsultaExternaController {

    @Autowired
    ConsultaExternaService consultaExternaService;

    @RequestMapping(path = "/consultas", method = RequestMethod.GET)
    public List<ConsultasXEspecialidadCustom> ConsultasXEspecialidad(@RequestParam(name = "idEntidad") Long idEntidad, @RequestParam(name = "idServicio", required = false) Long idServicio, @RequestParam(name = "finicio") String finicio, @RequestParam(name = "ffin") String ffin) {
        List<ConsultasXEspecialidadCustom> consultasXEspecialidadCustoms = null;
        try {
            Date fechai = new SimpleDateFormat("yyyy-MM-dd").parse(finicio);
            Date fechaf = new SimpleDateFormat("yyyy-MM-dd").parse(ffin);
            consultasXEspecialidadCustoms = consultaExternaService.ConsultasXEspecialidad(idEntidad, idServicio, fechai, fechaf);
        } catch (ParseException e) {

        }


        return consultasXEspecialidadCustoms;
    }

}
