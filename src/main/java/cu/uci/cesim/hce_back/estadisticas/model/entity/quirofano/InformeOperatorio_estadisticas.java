package cu.uci.cesim.hce_back.estadisticas.model.entity.quirofano;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import cu.uci.cesim.hce_back.estadisticas.model.entity.auto.DiagnosticoMedico_estadisticas;
import cu.uci.cesim.hce_back.estadisticas.model.entity.auto.SolicitudIntervencion_estadisticas;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * informe_operatorio created by avaldesg 20171015
 */
@Entity
@Table(name = "informe_operatorio", schema = "quirofano")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class InformeOperatorio_estadisticas implements java.io.Serializable {

    private long id;
    private SolicitudIntervencion_estadisticas solicitudIntervencion;
    private Integer version;
    private Boolean eliminado;
    private Long cid;
    private Date fecha;
    private Date horaInicio;
    private Date horaFin;
    private Integer tqHoraDuracion;
    private Integer tqMinutoDuracion;
    private Boolean clasOpLimpia;
    private Boolean clasOpLimpiaContaminada;
    private Boolean clasOpContaminada;
    private Boolean clasOpSucia;
    private Boolean clasOpReintervension;
    private Boolean clasOpCirMinAcc;
    private Boolean clasOpConversion;
    private Boolean instrumentalCompleto;
    private Boolean conteoComplCompresas;
    private String accidenteOperatorio;
    private DiagnosticoMedico_estadisticas otrosDiagnosticos;
    private DiagnosticoMedico_estadisticas diagnosticoQuirurgico;
    private Set<ProcedimientoInInformeOperatorio_estadisticas> procedimientoInInformeOperatorio = new HashSet<ProcedimientoInInformeOperatorio_estadisticas>(
            0);


    public InformeOperatorio_estadisticas() {
    }

    public InformeOperatorio_estadisticas(long id) {
        this.id = id;
    }


    public InformeOperatorio_estadisticas(
            long id,
            SolicitudIntervencion_estadisticas solicitudIntervencion,
            Integer version,
            Boolean eliminado,
            Long cid,
            Date fecha,
            Date horaInicio,
            Date horaFin,
            Integer tqHoraDuracion,
            Integer tqMinutoDuracion,
            Boolean clasOpLimpia,
            Boolean clasOpLimpiaContaminada,
            Boolean clasOpContaminada,
            Boolean clasOpSucia,
            Boolean clasOpReintervension,
            Boolean clasOpCirMinAcc,
            Boolean clasOpConversion,
            Boolean instrumentalCompleto,
            Boolean conteoComplCompresas,
            String accidenteOperatorio,
            DiagnosticoMedico_estadisticas otrosDiagnosticos,
            DiagnosticoMedico_estadisticas diagnosticoQuirurgico,
            Set<ProcedimientoInInformeOperatorio_estadisticas> procedimientoInInformeOperatorio) {
        super();
        this.id = id;
        this.solicitudIntervencion = solicitudIntervencion;
        this.version = version;
        this.eliminado = eliminado;
        this.cid = cid;
        this.fecha = fecha;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.tqHoraDuracion = tqHoraDuracion;
        this.tqMinutoDuracion = tqMinutoDuracion;
        this.clasOpLimpia = clasOpLimpia;
        this.clasOpLimpiaContaminada = clasOpLimpiaContaminada;
        this.clasOpContaminada = clasOpContaminada;
        this.clasOpSucia = clasOpSucia;
        this.clasOpReintervension = clasOpReintervension;
        this.clasOpCirMinAcc = clasOpCirMinAcc;
        this.clasOpConversion = clasOpConversion;
        this.instrumentalCompleto = instrumentalCompleto;
        this.conteoComplCompresas = conteoComplCompresas;
        this.accidenteOperatorio = accidenteOperatorio;
        this.otrosDiagnosticos = otrosDiagnosticos;
        this.diagnosticoQuirurgico = diagnosticoQuirurgico;
        this.procedimientoInInformeOperatorio = procedimientoInInformeOperatorio;
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

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_solicitud")
    public SolicitudIntervencion_estadisticas getSolicitudIntervencion() {
        return solicitudIntervencion;
    }

    public void setSolicitudIntervencion(
            SolicitudIntervencion_estadisticas solicitudIntervencion) {
        this.solicitudIntervencion = solicitudIntervencion;
    }

    @Version
    @Column(name = "version")
    public Integer getVersion() {
        return this.version;
    }

    public void setVersion(Integer version) {
        this.version = version;
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

    @Temporal(TemporalType.DATE)
    @Column(name = "fecha", nullable = false)
    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Temporal(TemporalType.TIME)
    @Column(name = "hora_inicio")
    public Date getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(Date horaInicio) {
        this.horaInicio = horaInicio;
    }

    @Temporal(TemporalType.TIME)
    @Column(name = "hora_fin")
    public Date getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(Date horaFin) {
        this.horaFin = horaFin;
    }

    @Column(name = "tq_hora_duracion")
    public Integer getTqHoraDuracion() {
        return tqHoraDuracion;
    }

    public void setTqHoraDuracion(Integer tqHoraDuracion) {
        this.tqHoraDuracion = tqHoraDuracion;
    }

    @Column(name = "tq_minuto_duracion")
    public Integer getTqMinutoDuracion() {
        return tqMinutoDuracion;
    }

    public void setTqMinutoDuracion(Integer tqMinutoDuracion) {
        this.tqMinutoDuracion = tqMinutoDuracion;
    }

    @Column(name = "clas_op_limpia")
    public Boolean getClasOpLimpia() {
        return clasOpLimpia;
    }

    public void setClasOpLimpia(Boolean clasOpLimpia) {
        this.clasOpLimpia = clasOpLimpia;
    }

    @Column(name = "clas_op_limpia_contaminada")
    public Boolean getClasOpLimpiaContaminada() {
        return clasOpLimpiaContaminada;
    }

    public void setClasOpLimpiaContaminada(Boolean clasOpLimpiaContaminada) {
        this.clasOpLimpiaContaminada = clasOpLimpiaContaminada;
    }

    @Column(name = "clas_op_contaminada")
    public Boolean getClasOpContaminada() {
        return clasOpContaminada;
    }

    public void setClasOpContaminada(Boolean clasOpContaminada) {
        this.clasOpContaminada = clasOpContaminada;
    }

    @Column(name = "clas_op_sucia")
    public Boolean getClasOpSucia() {
        return clasOpSucia;
    }

    public void setClasOpSucia(Boolean clasOpSucia) {
        this.clasOpSucia = clasOpSucia;
    }

    @Column(name = "clas_op_reintervension")
    public Boolean getClasOpReintervension() {
        return clasOpReintervension;
    }

    public void setClasOpReintervension(Boolean clasOpReintervension) {
        this.clasOpReintervension = clasOpReintervension;
    }

    @Column(name = "clas_op_cir_min_acc")
    public Boolean getClasOpCirMinAcc() {
        return clasOpCirMinAcc;
    }

    public void setClasOpCirMinAcc(Boolean clasOpCirMinAcc) {
        this.clasOpCirMinAcc = clasOpCirMinAcc;
    }

    @Column(name = "clas_op_conversion")
    public Boolean getClasOpConversion() {
        return clasOpConversion;
    }

    public void setClasOpConversion(Boolean clasOpConversion) {
        this.clasOpConversion = clasOpConversion;
    }

    @Column(name = "instrumental_completo")
    public Boolean getInstrumentalCompleto() {
        return instrumentalCompleto;
    }

    public void setInstrumentalCompleto(Boolean instrumentalCompleto) {
        this.instrumentalCompleto = instrumentalCompleto;
    }

    @Column(name = "conteo_compl_compresas")
    public Boolean getConteoComplCompresas() {
        return conteoComplCompresas;
    }

    public void setConteoComplCompresas(Boolean conteoComplCompresas) {
        this.conteoComplCompresas = conteoComplCompresas;
    }

    @Column(name = "accidente_operatorio")
    public String getAccidenteOperatorio() {
        return accidenteOperatorio;
    }

    public void setAccidenteOperatorio(String accidenteOperatorio) {
        this.accidenteOperatorio = accidenteOperatorio;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_otros_diagnosticos")
    public DiagnosticoMedico_estadisticas getOtrosDiagnosticos() {
        return otrosDiagnosticos;
    }

    public void setOtrosDiagnosticos(DiagnosticoMedico_estadisticas otrosDiagnosticos) {
        this.otrosDiagnosticos = otrosDiagnosticos;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_diagnostico_quirurgico")
    public DiagnosticoMedico_estadisticas getDiagnosticoQuirurgico() {
        return diagnosticoQuirurgico;
    }

    public void setDiagnosticoQuirurgico(
            DiagnosticoMedico_estadisticas diagnosticoQuirurgico) {
        this.diagnosticoQuirurgico = diagnosticoQuirurgico;
    }


    @OneToMany(fetch = FetchType.LAZY, mappedBy = "informeOperatorio")
    public Set<ProcedimientoInInformeOperatorio_estadisticas> getProcedimientoInInformeOperatorio() {
        return procedimientoInInformeOperatorio;
    }

    public void setProcedimientoInInformeOperatorio(
            Set<ProcedimientoInInformeOperatorio_estadisticas> procedimientoInInformeOperatorio) {
        this.procedimientoInInformeOperatorio = procedimientoInInformeOperatorio;
    }


}
