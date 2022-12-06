package cu.uci.cesim.hce_back.estadisticas.model.entity.auto;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

// Generated Apr 18, 2012 10:46:48 AM by Hibernate Tools 3.4.0.CR1


/**
 * OrdenAdmision generated by hbm2java
 */
@Entity
@Table(name = "orden_admision", schema = "publico")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class OrdenAdmision_estadisticas implements java.io.Serializable {

    private long id;
    private Integer version;
    private Entidad_estadisticas entidad;
    private Medico_estadisticas medico;
    private ServicioInEntidad_estadisticas servicioInEntidad;
    private DiagnosticoMedico_estadisticas diagnosticoMedico;
    private HojaFrontal_estadisticas hojaFrontal;
    private long idTipoAdmision;
    private String observaciones;
    private Date fechaElaboracion;
    private Date fechaAdmision;
    private Boolean eliminado;
    private Long cid;
    private Set<Admision_estadisticas> admisions = new HashSet<Admision_estadisticas>(
            0);
    private Set<HojaConsulta_estadisticas> hojaConsultas = new HashSet<HojaConsulta_estadisticas>(
            0);
    private Set<HojaEmergencia_estadisticas> hojaEmergencias = new HashSet<HojaEmergencia_estadisticas>(
            0);
    private Set<SolicitudIntervencion_estadisticas> solicitudIntervencions = new HashSet<SolicitudIntervencion_estadisticas>(
            0);

    public OrdenAdmision_estadisticas() {
    }

    public OrdenAdmision_estadisticas(long id, Medico_estadisticas medico,
                                      ServicioInEntidad_estadisticas servicioInEntidad,
                                      HojaFrontal_estadisticas hojaFrontal, long idTipoAdmision,
                                      Date fechaElaboracion, Date fechaAdmision) {
        this.id = id;
        this.medico = medico;
        this.servicioInEntidad = servicioInEntidad;
        this.hojaFrontal = hojaFrontal;
        this.idTipoAdmision = idTipoAdmision;
        this.fechaElaboracion = fechaElaboracion;
        this.fechaAdmision = fechaAdmision;
    }

    public OrdenAdmision_estadisticas(long id, Entidad_estadisticas entidad,
                                      Medico_estadisticas medico,
                                      ServicioInEntidad_estadisticas servicioInEntidad,
                                      DiagnosticoMedico_estadisticas diagnosticoMedico,
                                      HojaFrontal_estadisticas hojaFrontal, long idTipoAdmision,
                                      String observaciones, Date fechaElaboracion, Date fechaAdmision,
                                      Boolean eliminado, Long cid, Set<Admision_estadisticas> admisions,
                                      Set<HojaConsulta_estadisticas> hojaConsultas,
                                      Set<HojaEmergencia_estadisticas> hojaEmergencias,
                                      Set<SolicitudIntervencion_estadisticas> solicitudIntervencions) {
        this.id = id;
        this.entidad = entidad;
        this.medico = medico;
        this.servicioInEntidad = servicioInEntidad;
        this.diagnosticoMedico = diagnosticoMedico;
        this.hojaFrontal = hojaFrontal;
        this.idTipoAdmision = idTipoAdmision;
        this.observaciones = observaciones;
        this.fechaElaboracion = fechaElaboracion;
        this.fechaAdmision = fechaAdmision;
        this.eliminado = eliminado;
        this.cid = cid;
        this.admisions = admisions;
        this.hojaConsultas = hojaConsultas;
        this.hojaEmergencias = hojaEmergencias;
        this.solicitudIntervencions = solicitudIntervencions;
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
    @Column(name = "version")
    public Integer getVersion() {
        return this.version;
    }

    public void setVersion(Integer version) {
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
    @JoinColumn(name = "id_medico", nullable = false)

    public Medico_estadisticas getMedico() {
        return this.medico;
    }

    public void setMedico(Medico_estadisticas medico) {
        this.medico = medico;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_servicio", nullable = false)

    public ServicioInEntidad_estadisticas getServicioInEntidad() {
        return this.servicioInEntidad;
    }

    public void setServicioInEntidad(
            ServicioInEntidad_estadisticas servicioInEntidad) {
        this.servicioInEntidad = servicioInEntidad;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_diagnostico_inicial")
    public DiagnosticoMedico_estadisticas getDiagnosticoMedico() {
        return this.diagnosticoMedico;
    }

    public void setDiagnosticoMedico(
            DiagnosticoMedico_estadisticas diagnosticoMedico) {
        this.diagnosticoMedico = diagnosticoMedico;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_hoja_frontal", nullable = false)

    public HojaFrontal_estadisticas getHojaFrontal() {
        return this.hojaFrontal;
    }

    public void setHojaFrontal(HojaFrontal_estadisticas hojaFrontal) {
        this.hojaFrontal = hojaFrontal;
    }

    @Column(name = "id_tipo_admision", nullable = false)

    public long getIdTipoAdmision() {
        return this.idTipoAdmision;
    }

    public void setIdTipoAdmision(long idTipoAdmision) {
        this.idTipoAdmision = idTipoAdmision;
    }

    @Column(name = "observaciones")
    public String getObservaciones() {
        return this.observaciones;
    }

    public void setObservaciones(String observaciones) {
        if (observaciones != null)
            observaciones = observaciones.trim();
        this.observaciones = observaciones;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "fecha_elaboracion", nullable = false, length = 13)

    public Date getFechaElaboracion() {
        return this.fechaElaboracion;
    }

    public void setFechaElaboracion(Date fechaElaboracion) {
        this.fechaElaboracion = fechaElaboracion;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "fecha_admision", nullable = false, length = 13)

    public Date getFechaAdmision() {
        return this.fechaAdmision;
    }

    public void setFechaAdmision(Date fechaAdmision) {
        this.fechaAdmision = fechaAdmision;
    }

    @Column(name = "eliminado")
    public Boolean getEliminado() {
        return this.eliminado;
    }

    public void setEliminado(Boolean eliminado) {
        this.eliminado = eliminado;
    }

    @Column(name = "cid")
    public Long getCid() {
        return this.cid;
    }

    public void setCid(Long cid) {
        this.cid = cid;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "ordenAdmision")
    public Set<Admision_estadisticas> getAdmisions() {
        return this.admisions;
    }

    public void setAdmisions(Set<Admision_estadisticas> admisions) {
        this.admisions = admisions;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "ordenAdmision")
    public Set<HojaConsulta_estadisticas> getHojaConsultas() {
        return this.hojaConsultas;
    }

    public void setHojaConsultas(Set<HojaConsulta_estadisticas> hojaConsultas) {
        this.hojaConsultas = hojaConsultas;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "ordenAdmision")
    public Set<HojaEmergencia_estadisticas> getHojaEmergencias() {
        return this.hojaEmergencias;
    }

    public void setHojaEmergencias(
            Set<HojaEmergencia_estadisticas> hojaEmergencias) {
        this.hojaEmergencias = hojaEmergencias;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "ordenAdmision")
    public Set<SolicitudIntervencion_estadisticas> getSolicitudIntervencions() {
        return this.solicitudIntervencions;
    }

    public void setSolicitudIntervencions(
            Set<SolicitudIntervencion_estadisticas> solicitudIntervencions) {
        this.solicitudIntervencions = solicitudIntervencions;
    }

}