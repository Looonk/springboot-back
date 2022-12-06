package cu.uci.cesim.hce_back.estadisticas.model.entity.auto;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

// Generated Apr 18, 2012 10:46:48 AM by Hibernate Tools 3.4.0.CR1


/**
 * EgresoEmergencia generated by hbm2java
 */
@Entity
@Table(name = "egreso_emergencia", schema = "hc_local")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class EgresoEmergencia_estadisticas implements java.io.Serializable {

    private long id;
    private Integer version;
    private CertificadoDefuncion_estadisticas certificadoDefuncion;
    private SolicitudAutopsia_estadisticas solicitudAutopsia;
    private Referencias_estadisticas referencias;
    private Medico_estadisticas medico;
    private TipoEgreso_estadisticas tipoEgreso;
    private Date fecha;
    private String observaciones;
    private Boolean eliminado;
    private Long cid;
    private Date hora;
    private Long idIndicacionesMedicas;
    private Long idConstancia;
    private String resumenHistoriaClinica;
    private String identificadorDocumento;
    private Long idTratamientoEgreso;
    private Long idContrarreferencia;
    private Long idInformeReposo;
    private Set<HojaEmergencia_estadisticas> hojaEmergencias = new HashSet<HojaEmergencia_estadisticas>(
            0);

    public EgresoEmergencia_estadisticas() {
    }

    public EgresoEmergencia_estadisticas(long id, Medico_estadisticas medico,
                                         TipoEgreso_estadisticas tipoEgreso, Date fecha, Date hora,
                                         String resumenHistoriaClinica) {
        this.id = id;
        this.medico = medico;
        this.tipoEgreso = tipoEgreso;
        this.fecha = fecha;
        this.hora = hora;
        this.resumenHistoriaClinica = resumenHistoriaClinica;
    }

    public EgresoEmergencia_estadisticas(long id,
                                         CertificadoDefuncion_estadisticas certificadoDefuncion,
                                         SolicitudAutopsia_estadisticas solicitudAutopsia,
                                         Referencias_estadisticas referencias, Medico_estadisticas medico,
                                         TipoEgreso_estadisticas tipoEgreso, Date fecha,
                                         String observaciones, Boolean eliminado, Long cid, Date hora,
                                         Long idIndicacionesMedicas, Long idConstancia,
                                         String resumenHistoriaClinica, String identificadorDocumento,
                                         Long idTratamientoEgreso, Long idContrarreferencia,
                                         Long idInformeReposo,
                                         Set<HojaEmergencia_estadisticas> hojaEmergencias) {
        this.id = id;
        this.certificadoDefuncion = certificadoDefuncion;
        this.solicitudAutopsia = solicitudAutopsia;
        this.referencias = referencias;
        this.medico = medico;
        this.tipoEgreso = tipoEgreso;
        this.fecha = fecha;
        this.observaciones = observaciones;
        this.eliminado = eliminado;
        this.cid = cid;
        this.hora = hora;
        this.idIndicacionesMedicas = idIndicacionesMedicas;
        this.idConstancia = idConstancia;
        this.resumenHistoriaClinica = resumenHistoriaClinica;
        this.identificadorDocumento = identificadorDocumento;
        this.idTratamientoEgreso = idTratamientoEgreso;
        this.idContrarreferencia = idContrarreferencia;
        this.idInformeReposo = idInformeReposo;
        this.hojaEmergencias = hojaEmergencias;
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
    @JoinColumn(name = "id_referencia")
    public Referencias_estadisticas getReferencias() {
        return this.referencias;
    }

    public void setReferencias(Referencias_estadisticas referencias) {
        this.referencias = referencias;
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

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "egresoEmergencia")
    public Set<HojaEmergencia_estadisticas> getHojaEmergencias() {
        return this.hojaEmergencias;
    }

    public void setHojaEmergencias(
            Set<HojaEmergencia_estadisticas> hojaEmergencias) {
        this.hojaEmergencias = hojaEmergencias;
    }

}