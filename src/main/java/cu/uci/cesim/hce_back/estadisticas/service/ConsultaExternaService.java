package cu.uci.cesim.hce_back.estadisticas.service;

import cu.uci.cesim.hce_back.estadisticas.model.entity.auto.Especialidad_estadisticas;
import cu.uci.cesim.hce_back.estadisticas.model.entity.custom.ConsultasXEspecialidadCustom;
import cu.uci.cesim.hce_back.estadisticas.model.repository.ConsultaExternaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.NoSuchElementException;

@Service
public class ConsultaExternaService {

    @Autowired
    ConsultaExternaRepository consultaExternaRepository;

    public List<ConsultasXEspecialidadCustom> ConsultasXEspecialidad(Long idEntidad, Long idServicio, Date finicio, Date ffin) {
        List<ConsultasXEspecialidadCustom> consultasXEspecialidadCustoms = new ArrayList<>();

        List<List> planificadas = consultaExternaRepository.ConsultasPlanificadasXEspecialidad(idEntidad, idServicio, finicio, ffin);

        for (List o : planificadas) {
            ConsultasXEspecialidadCustom consultaXEspecialidaCustoms = new ConsultasXEspecialidadCustom((Especialidad_estadisticas) o.get(2), (int) (long) o.get(0), 0);
            consultasXEspecialidadCustoms.add(consultaXEspecialidaCustoms);
        }

        List<List> realizadas = consultaExternaRepository.ConsultasRealizadasXEspecialidad(idEntidad, idServicio, finicio, ffin);

        for (ConsultasXEspecialidadCustom r : consultasXEspecialidadCustoms) {
            try {
                List aux = realizadas.stream().filter(x -> ((Especialidad_estadisticas) x.get(2)).getId() == r.getEspecialidad_estadisticas().getId()).findFirst().get();
                r.setRealizadas((int) (long) aux.get(0));
            } catch (NoSuchElementException e) {

            }
        }


        return consultasXEspecialidadCustoms;
    }
}
