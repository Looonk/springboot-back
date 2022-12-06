package cu.uci.cesim.hce_back.estadisticas.model.entity.auto;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.*;
import java.util.Date;

// Generated Apr 18, 2012 10:46:48 AM by Hibernate Tools 3.4.0.CR1


/**
 * Egreso generated by hbm2java
 */
@Entity
@Table(name = "egreso", schema = "hc_local")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Egreso_estadisticas implements java.io.Serializable {

    private long id;
    private Integer version;
    private CertificadoDefuncion_estadisticas certificadoDefuncion;
    private SolicitudAutopsia_estadisticas solicitudAutopsia;
    private Admision_estadisticas admision;
    private DiagnosticoMedico_estadisticas diagnosticoMedicoByIdDiagnostico;
    private ServicioInEntidad_estadisticas servicioInEntidad;
    private Referencias_estadisticas referencias;
    private Cita_estadisticas cita;
    private Fallecimiento_estadisticas fallecimiento;
    private Medico_estadisticas medico;
    private TipoEgreso_estadisticas tipoEgreso;
    private DiagnosticoMedico_estadisticas diagnosticoMedicoByIdDiagnosticoPrincFinal;
    private Date fecha;
    private String observaciones;
    private Boolean eliminado;
    private Long cid;
    private Date hora;
    private Long idIndicacionesMedicas;
    private Long idConstancia;
    private Long idTecnicoRecodifica;
    private String resumenHistoriaClinica;
    private String identificadorDocumento;
    private Long idTratamientoEgreso;
    private Long idContrarreferencia;
    private Long idInformeReposo;

    public Egreso_estadisticas() {
    }

    public Egreso_estadisticas(long id,
                               DiagnosticoMedico_estadisticas diagnosticoMedicoByIdDiagnostico,
                               ServicioInEntidad_estadisticas servicioInEntidad,
                               Medico_estadisticas medico, TipoEgreso_estadisticas tipoEgreso,
                               Date fecha, Date hora, String resumenHistoriaClinica) {
        this.id = id;
        this.diagnosticoMedicoByIdDiagnostico = diagnosticoMedicoByIdDiagnostico;
        this.servicioInEntidad = servicioInEntidad;
        this.medico = medico;
        this.tipoEgreso = tipoEgreso;
        this.fecha = fecha;
        this.hora = hora;
        this.resumenHistoriaClinica = resumenHistoriaClinica;
    }

    public Egreso_estadisticas(
            long id,
            CertificadoDefuncion_estadisticas certificadoDefuncion,
            SolicitudAutopsia_estadisticas solicitudAutopsia,
            Admision_estadisticas admision,
            DiagnosticoMedico_estadisticas diagnosticoMedicoByIdDiagnostico,
            ServicioInEntidad_estadisticas servicioInEntidad,
            Referencias_estadisticas referencias,
            Cita_estadisticas cita,
            Fallecimiento_estadisticas fallecimiento,
            Medico_estadisticas medico,
            TipoEgreso_estadisticas tipoEgreso,
            DiagnosticoMedico_estadisticas diagnosticoMedicoByIdDiagnosticoPrincFinal,
            Date fecha, String observaciones, Boolean eliminado, Long cid,
            Date hora, Long idIndicacionesMedicas, Long idConstancia,
            Long idTecnicoRecodifica, String resumenHistoriaClinica,
            String identificadorDocumento, Long idTratamientoEgreso,
            Long idContrarreferencia, Long idInformeReposo) {
        this.id = id;
        this.certificadoDefuncion = certificadoDefuncion;
        this.solicitudAutopsia = solicitudAutopsia;
        this.admision = admision;
        this.diagnosticoMedicoByIdDiagnostico = diagnosticoMedicoByIdDiagnostico;
        this.servicioInEntidad = servicioInEntidad;
        this.referencias = referencias;
        this.cita = cita;
        this.fallecimiento = fallecimiento;
        this.medico = medico;
        this.tipoEgreso = tipoEgreso;
        this.diagnosticoMedicoByIdDiagnosticoPrincFinal = diagnosticoMedicoByIdDiagnosticoPrincFinal;
        this.fecha = fecha;
        this.observaciones = observaciones;
        this.eliminado = eliminado;
        this.cid = cid;
        this.hora = hora;
        this.idIndicacionesMedicas = idIndicacionesMedicas;
        this.idConstancia = idConstancia;
        this.idTecnicoRecodifica = idTecnicoRecodifica;
        this.resumenHistoriaClinica = resumenHistoriaClinica;
        this.identificadorDocumento = identificadorDocumento;
        this.idTratamientoEgreso = idTratamientoEgreso;
        this.idContrarreferencia = idContrarreferencia;
        this.idInformeReposo = idInformeReposo;
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
    @JoinColumn(name = "id_certificado_defuncion")
    public CertificadoDefuncion_estadisticas getCertificadoDefuncion() {
        return this.certificadoDefuncion;
    }

    public void setCertificadoDefuncion(
            CertificadoDefuncion_estadisticas certificadoDefuncion) {
        this.certificadoDefuncion = certificadoDefuncion;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_solicitud_autopsia")
    public SolicitudAutopsia_estadisticas getSolicitudAutopsia() {
        return this.solicitudAutopsia;
    }

    public void setSolicitudAutopsia(
            SolicitudAutopsia_estadisticas solicitudAutopsia) {
        this.solicitudAutopsia = solicitudAutopsia;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_admision")
    public Admision_estadisticas getAdmision() {
        return this.admision;
    }

    public void setAdmision(Admision_estadisticas admision) {
        this.admision = admision;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_diagnostico", nullable = false)

    public DiagnosticoMedico_estadisticas getDiagnosticoMedicoByIdDiagnostico() {
        return this.diagnosticoMedicoByIdDiagnostico;
    }

    public void setDiagnosticoMedicoByIdDiagnostico(
            DiagnosticoMedico_estadisticas diagnosticoMedicoByIdDiagnostico) {
        this.diagnosticoMedicoByIdDiagnostico = diagnosticoMedicoByIdDiagnostico;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_servicio_realiza", nullable = false)

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
    @JoinColumn(name = "id_cita_control")
    public Cita_estadisticas getCita() {
        return this.cita;
    }

    public void setCita(Cita_estadisticas cita) {
        this.cita = cita;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_registro_fallecimiento")
    public Fallecimiento_estadisticas getFallecimiento() {
        return this.fallecimiento;
    }

    public void setFallecimiento(Fallecimiento_estadisticas fallecimiento) {
        this.fallecimiento = fallecimiento;
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
    @JoinColumn(name = "id_tipo_egreso", nullable = false)

    public TipoEgreso_estadisticas getTipoEgreso() {
        return this.tipoEgreso;
    }

    public void setTipoEgreso(TipoEgreso_estadisticas tipoEgreso) {
        this.tipoEgreso = tipoEgreso;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_diagnostico_princ_final")
    public DiagnosticoMedico_estadisticas getDiagnosticoMedicoByIdDiagnosticoPrincFinal() {
        return this.diagnosticoMedicoByIdDiagnosticoPrincFinal;
    }

    public void setDiagnosticoMedicoByIdDiagnosticoPrincFinal(
            DiagnosticoMedico_estadisticas diagnosticoMedicoByIdDiagnosticoPrincFinal) {
        this.diagnosticoMedicoByIdDiagnosticoPrincFinal = diagnosticoMedicoByIdDiagnosticoPrincFinal;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "fecha", nullable = false, length = 13)

    public Date getFecha() {
        return this.fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
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

    @Temporal(TemporalType.TIME)
    @Column(name = "hora", nullable = false, length = 8)

    public Date getHora() {
        return this.hora;
    }

    public void setHora(Date hora) {
        this.hora = hora;
    }

    @Column(name = "id_indicaciones_medicas")
    public Long getIdIndicacionesMedicas() {
        return this.idIndicacionesMedicas;
    }

    public void setIdIndicacionesMedicas(Long idIndicacionesMedicas) {
        this.idIndicacionesMedicas = idIndicacionesMedicas;
    }

    @Column(name = "id_constancia")
    public Long getIdConstancia() {
        return this.idConstancia;
    }

    public void setIdConstancia(Long idConstancia) {
        this.idConstancia = idConstancia;
    }

    @Column(name = "id_tecnico_recodifica")
    public Long getIdTecnicoRecodifica() {
        return this.idTecnicoRecodifica;
    }

    public void setIdTecnicoRecodifica(Long idTecnicoRecodifica) {
        this.idTecnicoRecodifica = idTecnicoRecodifica;
    }

    @Column(name = "resumen_historia_clinica", nullable = false)

    public String getResumenHistoriaClinica() {
        return this.resumenHistoriaClinica;
    }

    public void setResumenHistoriaClinica(String resumenHistoriaClinica) {
        if (resumenHistoriaClinica != null)
            resumenHistoriaClinica = resumenHistoriaClinica.trim();
        this.resumenHistoriaClinica = resumenHistoriaClinica;
    }

    @Column(name = "identificador_documento")
    public String getIdentificadorDocumento() {
        return this.identificadorDocumento;
    }

    public void setIdentificadorDocumento(String identificadorDocumento) {
        if (identificadorDocumento != null)
            identificadorDocumento = identificadorDocumento.trim();
        this.identificadorDocumento = identificadorDocumento;
    }

    @Column(name = "id_tratamiento_egreso")
    public Long getIdTratamientoEgreso() {
        return this.idTratamientoEgreso;
    }

    public void setIdTratamientoEgreso(Long idTratamientoEgreso) {
        this.idTratamientoEgreso = idTratamientoEgreso;
    }

    @Column(name = "id_contrarreferencia")
    public Long getIdContrarreferencia() {
        return this.idContrarreferencia;
    }

    public void setIdContrarreferencia(Long idContrarreferencia) {
        this.idContrarreferencia = idContrarreferencia;
    }

    @Column(name = "id_informe_reposo")
    public Long getIdInformeReposo() {
        return this.idInformeReposo;
    }

    public void setIdInformeReposo(Long idInformeReposo) {
        this.idInformeReposo = idInformeReposo;
    }

}
