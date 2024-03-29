package cu.uci.cesim.hce_back.estadisticas.model.entity.auto;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

// Generated Apr 18, 2012 10:46:48 AM by Hibernate Tools 3.4.0.CR1


/**
 * EspecialidadInEntidad generated by hbm2java
 */
@Entity
@Table(name = "especialidad_in_entidad", schema = "comun", uniqueConstraints = @UniqueConstraint(columnNames = {
        "id_entidad", "id_especialidad"}))
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class EspecialidadInEntidad_estadisticas implements java.io.Serializable {

    private long id;
    private int version;
    private Entidad_estadisticas entidad;
    private Especialidad_estadisticas especialidad;
    private Long cid;
    private Boolean eliminado;
    private Set<SolicitudInterconsulta_estadisticas> solicitudInterconsultas = new HashSet<SolicitudInterconsulta_estadisticas>(
            0);
    private Set<PlanificacionMedico_estadisticas> planificacionMedicos = new HashSet<PlanificacionMedico_estadisticas>(
            0);

    public EspecialidadInEntidad_estadisticas() {
    }

    public EspecialidadInEntidad_estadisticas(long id) {
        this.id = id;
    }

    public EspecialidadInEntidad_estadisticas(long id,
                                              Entidad_estadisticas entidad,
                                              Especialidad_estadisticas especialidad, Long cid,
                                              Boolean eliminado,
                                              Set<SolicitudInterconsulta_estadisticas> solicitudInterconsultas,
                                              Set<PlanificacionMedico_estadisticas> planificacionMedicos) {
        this.id = id;
        this.entidad = entidad;
        this.especialidad = especialidad;
        this.cid = cid;
        this.eliminado = eliminado;
        this.solicitudInterconsultas = solicitudInterconsultas;
        this.planificacionMedicos = planificacionMedicos;
    }

    @Id
    @Column(name = "id", unique = true, nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Version
    @Column(name = "version", nullable = false)

    public int getVersion() {
        return this.version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_entidad")
    public Entidad_estadisticas getEntidad() {
        return this.entidad;
    }

    public void setEntidad(Entidad_estadisticas entidad) {
        this.entidad = entidad;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_especialidad")
    public Especialidad_estadisticas getEspecialidad() {
        return this.especialidad;
    }

    public void setEspecialidad(Especialidad_estadisticas especialidad) {
        this.especialidad = especialidad;
    }

    @Column(name = "cid")
    public Long getCid() {
        return this.cid;
    }

    public void setCid(Long cid) {
        this.cid = cid;
    }

    @Column(name = "eliminado")
    public Boolean getEliminado() {
        return this.eliminado;
    }

    public void setEliminado(Boolean eliminado) {
        this.eliminado = eliminado;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "especialidadInEntidad")
    public Set<SolicitudInterconsulta_estadisticas> getSolicitudInterconsultas() {
        return this.solicitudInterconsultas;
    }

    public void setSolicitudInterconsultas(
            Set<SolicitudInterconsulta_estadisticas> solicitudInterconsultas) {
        this.solicitudInterconsultas = solicitudInterconsultas;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "especialidadInEntidad")
    public Set<PlanificacionMedico_estadisticas> getPlanificacionMedicos() {
        return this.planificacionMedicos;
    }

    public void setPlanificacionMedicos(
            Set<PlanificacionMedico_estadisticas> planificacionMedicos) {
        this.planificacionMedicos = planificacionMedicos;
    }

}
