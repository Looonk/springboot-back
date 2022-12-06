package cu.uci.cesim.hce_back.estadisticas.model.repository;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Repository
@Transactional
public class ConsultaExternaRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public List ConsultasPlanificadasXEspecialidad(Long idEntidad, Long idServicio, Date finicio, Date ffin) {
        String servicioQuery = "";
        if (idServicio != null)
            servicioQuery = "and servicio.id = :idServicio ";

        List<List> citas = new ArrayList();
        Query query = entityManager.createQuery("select new list(count(c), servicio.nombre, especialidad) from Cita_estadisticas c " +
                        "inner join c.horarioCita as hc " +
                        "inner join c.hojaFrontal as hf " +
                        "inner join hc.planificacionMedicos as pl " +
                        "inner join pl.especialidadInEntidad as eie " +
                        "inner join eie.entidad as entidad  " +
                        "inner join pl.medico as medico " +
                        "inner join medico.usuario as u " +
                        "inner join u.servicioInEntidads as serv " +
                        "inner join serv.servicio as servicio " +
                        "inner join eie.especialidad as especialidad " +
                        "inner join especialidad.servicio as s " +
                        "where s = servicio and " +
                        "especialidad = eie.especialidad " +
                        "and (c.eliminado=false or c.eliminado = null) " +
                        "and (hf.eliminado<>true or hf.eliminado=null) " +
                        "and (pl.eliminado<>true or pl.eliminado=null) " +
                        "and (medico.eliminado<>true or medico.eliminado=null) " +
                        "and (eie.eliminado<>true or eie.eliminado=null) " +
                        "and (serv.eliminado<>true or serv.eliminado=null) " +
                        servicioQuery +
                        "and eie.entidad.id =:idEntidad " +
                        "and c.fecha between :fechaInicial and :fechaFinal " +
                        "group by servicio.nombre, especialidad.id " +
                        "order by servicio.nombre")
                .setParameter("idEntidad", idEntidad)
                .setParameter("fechaInicial", finicio)
                .setParameter("fechaFinal", ffin);

        if (idServicio != null) {
            query.setParameter("idServicio", idServicio);
        }
        citas = query.getResultList();

        return citas;
    }

    public List ConsultasRealizadasXEspecialidad(Long idEntidad, Long idServicio, Date finicio, Date ffin) {
        String servicioQuery = "";
        if (idServicio != null)
            servicioQuery = "and servicio.id = :idServicio ";

        List<List> citas = new ArrayList();
        Query query = entityManager.createQuery("select new list(count(c), servicio.nombre, especialidad) from HojaConsulta_estadisticas hc " +
                        "inner join hc.citaByIdCitaOrigen c " +
                        "inner join c.horarioCita as hcit " +
                        "inner join c.hojaFrontal as hf " +
                        "inner join hcit.planificacionMedicos as pl " +
                        "inner join pl.especialidadInEntidad as eie " +
                        "inner join eie.entidad as entidad  " +
                        "inner join pl.medico as medico " +
                        "inner join medico.usuario as u " +
                        "inner join u.servicioInEntidads as serv " +
                        "inner join serv.servicio as servicio " +
                        "inner join eie.especialidad as especialidad " +
                        "inner join especialidad.servicio as s " +
                        "where s = servicio and " +
                        "especialidad = eie.especialidad " +
                        "and (c.eliminado=false or c.eliminado = null) " +
                        "and (hc.eliminado<>true or hc.eliminado=null) " +
                        "and (hf.eliminado<>true or hf.eliminado=null) " +
                        "and (pl.eliminado<>true or pl.eliminado=null) " +
                        "and (medico.eliminado<>true or medico.eliminado=null) " +
                        "and (eie.eliminado<>true or eie.eliminado=null) " +
                        "and (serv.eliminado<>true or serv.eliminado=null) " +
                        servicioQuery +
                        "and eie.entidad.id =:idEntidad " +
                        "and hc.fecha between :fechaInicial and :fechaFinal " +
                        "group by servicio.nombre, especialidad.id " +
                        "order by servicio.nombre")
                .setParameter("idEntidad", idEntidad)
                .setParameter("fechaInicial", finicio)
                .setParameter("fechaFinal", ffin);

        if (idServicio != null) {
            query.setParameter("idServicio", idServicio);
        }
        citas = query.getResultList();

        return citas;
    }


}
