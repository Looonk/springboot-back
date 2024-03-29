package cu.uci.cesim.hce_back.estadisticas.model.entity.auto;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.*;
import java.util.Date;

// Generated Apr 18, 2012 10:46:48 AM by Hibernate Tools 3.4.0.CR1


/**
 * HojaEmergencia generated by hbm2java
 */
@Entity
@Table(name = "hoja_emergencia", schema = "hc_local")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class HojaEmergencia_estadisticas implements java.io.Serializable {

    private long id;
    private Integer version;
    private SolicitudIntervencion_estadisticas solicitudIntervencion;
    private OrdenAdmision_estadisticas ordenAdmision;
    private EgresoEmergencia_estadisticas egresoEmergencia;
    private DiagnosticoMedico_estadisticas diagnosticoMedicoByIdDiagnosticoFinal;
    private ServicioInEntidad_estadisticas servicioInEntidad;
    private Referencias_estadisticas referencias;
    private DiagnosticoMedico_estadisticas diagnosticoMedicoByIdDiagnosticoFinalRecodificado;
    private Medico_estadisticas medico;
    private HojaFrontal_estadisticas hojaFrontal;
    private Date fecha;
    private long idTraidoPor;
    private long idNivelGravedad;
    private String motivoConsulta;
    private Long idCasoMedicoLegal;
    private Date hora;
    private Long idAtencionMedica;
    private Long idObservacion;
    private Boolean eliminado;
    private Long cid;
    private Long idUsuarioRecodificador;
    private Date fechaSalidaEmergencias;
    private Date horaSalidaEmergencias;
    private Long idConstancia;
    private String observacionRecepcion;
    private int edadAtencion;

    public HojaEmergencia_estadisticas() {
    }

    public HojaEmergencia_estadisticas(long id,
                                       ServicioInEntidad_estadisticas servicioInEntidad, Date fecha,
                                       long idTraidoPor, long idNivelGravedad, String motivoConsulta,
                                       Date hora, int edadAtencion) {
        this.id = id;
        this.servicioInEntidad = servicioInEntidad;
        this.fecha = fecha;
        this.idTraidoPor = idTraidoPor;
        this.idNivelGravedad = idNivelGravedad;
        this.motivoConsulta = motivoConsulta;
        this.hora = hora;
        this.edadAtencion = edadAtencion;
    }

    public HojaEmergencia_estadisticas(
            long id,
            SolicitudIntervencion_estadisticas solicitudIntervencion,
            OrdenAdmision_estadisticas ordenAdmision,
            EgresoEmergencia_estadisticas egresoEmergencia,
            DiagnosticoMedico_estadisticas diagnosticoMedicoByIdDiagnosticoFinal,
            ServicioInEntidad_estadisticas servicioInEntidad,
            Referencias_estadisticas referencias,
            DiagnosticoMedico_estadisticas diagnosticoMedicoByIdDiagnosticoFinalRecodificado,
            Medico_estadisticas medico, HojaFrontal_estadisticas hojaFrontal,
            Date fecha, long idTraidoPor, long idNivelGravedad,
            String motivoConsulta, Long idCasoMedicoLegal, Date hora,
            Long idAtencionMedica, Long idObservacion, Boolean eliminado,
            Long cid, Long idUsuarioRecodificador, Date fechaSalidaEmergencias,
            Date horaSalidaEmergencias, Long idConstancia,
            String observacionRecepcion, int edadAtencion) {
        this.id = id;
        this.solicitudIntervencion = solicitudIntervencion;
        this.ordenAdmision = ordenAdmision;
        this.egresoEmergencia = egresoEmergencia;
        this.diagnosticoMedicoByIdDiagnosticoFinal = diagnosticoMedicoByIdDiagnosticoFinal;
        this.servicioInEntidad = servicioInEntidad;
        this.referencias = referencias;
        this.diagnosticoMedicoByIdDiagnosticoFinalRecodificado = diagnosticoMedicoByIdDiagnosticoFinalRecodificado;
        this.medico = medico;
        this.hojaFrontal = hojaFrontal;
        this.fecha = fecha;
        this.idTraidoPor = idTraidoPor;
        this.idNivelGravedad = idNivelGravedad;
        this.motivoConsulta = motivoConsulta;
        this.idCasoMedicoLegal = idCasoMedicoLegal;
        this.hora = hora;
        this.idAtencionMedica = idAtencionMedica;
        this.idObservacion = idObservacion;
        this.eliminado = eliminado;
        this.cid = cid;
        this.idUsuarioRecodificador = idUsuarioRecodificador;
        this.fechaSalidaEmergencias = fechaSalidaEmergencias;
        this.horaSalidaEmergencias = horaSalidaEmergencias;
        this.idConstancia = idConstancia;
        this.observacionRecepcion = observacionRecepcion;
        this.edadAtencion = edadAtencion;
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
    @JoinColumn(name = "id_notificacion_intervencion")
    public SolicitudIntervencion_estadisticas getSolicitudIntervencion() {
        return this.solicitudIntervencion;
    }

    public void setSolicitudIntervencion(
            SolicitudIntervencion_estadisticas solicitudIntervencion) {
        this.solicitudIntervencion = solicitudIntervencion;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_orden_admision")
    public OrdenAdmision_estadisticas getOrdenAdmision() {
        return this.ordenAdmision;
    }

    public void setOrdenAdmision(OrdenAdmision_estadisticas ordenAdmision) {
        this.ordenAdmision = ordenAdmision;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_egreso")
    public EgresoEmergencia_estadisticas getEgresoEmergencia() {
        return this.egresoEmergencia;
    }

    public void setEgresoEmergencia(
            EgresoEmergencia_estadisticas egresoEmergencia) {
        this.egresoEmergencia = egresoEmergencia;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_diagnostico_final")
    public DiagnosticoMedico_estadisticas getDiagnosticoMedicoByIdDiagnosticoFinal() {
        return this.diagnosticoMedicoByIdDiagnosticoFinal;
    }

    public void setDiagnosticoMedicoByIdDiagnosticoFinal(
            DiagnosticoMedico_estadisticas diagnosticoMedicoByIdDiagnosticoFinal) {
        this.diagnosticoMedicoByIdDiagnosticoFinal = diagnosticoMedicoByIdDiagnosticoFinal;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_servicio_emergencia", nullable = false)

    public ServicioInEntidad_estadisticas getServicioInEntidad() {
        return this.servicioInEntidad;
    }

    public void setServicioInEntidad(
            ServicioInEntidad_estadisticas servicioInEntidad) {
        this.servicioInEntidad = servicioInEntidad;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_referencia")
    public Referencias_estadisticas getReferencias() {
        return this.referencias;
    }

    public void setReferencias(Referencias_estadisticas referencias) {
        this.referencias = referencias;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_diagnostico_final_recodificado")
    public DiagnosticoMedico_estadisticas getDiagnosticoMedicoByIdDiagnosticoFinalRecodificado() {
        return this.diagnosticoMedicoByIdDiagnosticoFinalRecodificado;
    }

    public void setDiagnosticoMedicoByIdDiagnosticoFinalRecodificado(
            DiagnosticoMedico_estadisticas diagnosticoMedicoByIdDiagnosticoFinalRecodificado) {
        this.diagnosticoMedicoByIdDiagnosticoFinalRecodificado = diagnosticoMedicoByIdDiagnosticoFinalRecodificado;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_medico_diagnostica")
    public Medico_estadisticas getMedico() {
        return this.medico;
    }

    public void setMedico(Medico_estadisticas medico) {
        this.medico = medico;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_hoja_frontal")
    public HojaFrontal_estadisticas getHojaFrontal() {
        return this.hojaFrontal;
    }

    public void setHojaFrontal(HojaFrontal_estadisticas hojaFrontal) {
        this.hojaFrontal = hojaFrontal;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "fecha", nullable = false, length = 13)

    public Date getFecha() {
        return this.fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Column(name = "id_traido_por", nullable = false)

    public long getIdTraidoPor() {
        return this.idTraidoPor;
    }

    public void setIdTraidoPor(long idTraidoPor) {
        this.idTraidoPor = idTraidoPor;
    }

    @Column(name = "id_nivel_gravedad", nullable = false)

    public long getIdNivelGravedad() {
        return this.idNivelGravedad;
    }

    public void setIdNivelGravedad(long idNivelGravedad) {
        this.idNivelGravedad = idNivelGravedad;
    }

    @Column(name = "motivo_consulta", nullable = false)

    public String getMotivoConsulta() {
        return this.motivoConsulta;
    }

    public void setMotivoConsulta(String motivoConsulta) {
        if (motivoConsulta != null)
            motivoConsulta = motivoConsulta.trim();
        this.motivoConsulta = motivoConsulta;
    }

    @Column(name = "id_caso_medico_legal")
    public Long getIdCasoMedicoLegal() {
        return this.idCasoMedicoLegal;
    }

    public void setIdCasoMedicoLegal(Long idCasoMedicoLegal) {
        this.idCasoMedicoLegal = idCasoMedicoLegal;
    }

    @Temporal(TemporalType.TIME)
    @Column(name = "hora", nullable = false, length = 15)

    public Date getHora() {
        return this.hora;
    }

    public void setHora(Date hora) {
        this.hora = hora;
    }

    @Column(name = "id_atencion_medica")
    public Long getIdAtencionMedica() {
        return this.idAtencionMedica;
    }

    public void setIdAtencionMedica(Long idAtencionMedica) {
        this.idAtencionMedica = idAtencionMedica;
    }

    @Column(name = "id_observacion")
    public Long getIdObservacion() {
        return this.idObservacion;
    }

    public void setIdObservacion(Long idObservacion) {
        this.idObservacion = idObservacion;
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

    @Column(name = "id_usuario_recodificador")
    public Long getIdUsuarioRecodificador() {
        return this.idUsuarioRecodificador;
    }

    public void setIdUsuarioRecodificador(Long idUsuarioRecodificador) {
        this.idUsuarioRecodificador = idUsuarioRecodificador;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "fecha_salida_emergencias", length = 13)
    public Date getFechaSalidaEmergencias() {
        return this.fechaSalidaEmergencias;
    }

    public void setFechaSalidaEmergencias(Date fechaSalidaEmergencias) {
        this.fechaSalidaEmergencias = fechaSalidaEmergencias;
    }

    @Temporal(TemporalType.TIME)
    @Column(name = "hora_salida_emergencias", length = 21)
    public Date getHoraSalidaEmergencias() {
        return this.horaSalidaEmergencias;
    }

    public void setHoraSalidaEmergencias(Date horaSalidaEmergencias) {
        this.horaSalidaEmergencias = horaSalidaEmergencias;
    }

    @Column(name = "id_constancia")
    public Long getIdConstancia() {
        return this.idConstancia;
    }

    public void setIdConstancia(Long idConstancia) {
        this.idConstancia = idConstancia;
    }

    @Column(name = "observacion_recepcion")
    public String getObservacionRecepcion() {
        return this.observacionRecepcion;
    }

    public void setObservacionRecepcion(String observacionRecepcion) {
        if (observacionRecepcion != null)
            observacionRecepcion = observacionRecepcion.trim();
        this.observacionRecepcion = observacionRecepcion;
    }

    @Column(name = "edad_atencion", nullable = false)

    public int getEdadAtencion() {
        return this.edadAtencion;
    }

    public void setEdadAtencion(int edadAtencion) {
        this.edadAtencion = edadAtencion;
    }

}
