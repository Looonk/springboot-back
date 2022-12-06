package cu.uci.cesim.hce_back.estadisticas.model.entity.auto;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.*;
import java.util.Date;

// Generated Apr 18, 2012 10:46:48 AM by Hibernate Tools 3.4.0.CR1


/**
 * HojaConsulta generated by hbm2java
 */
@Entity
@Table(name = "hoja_consulta", schema = "hc_local")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class HojaConsulta_estadisticas implements java.io.Serializable {

    private long id;
    private Integer version;
    private Entidad_estadisticas entidad;
    private OrdenAdmision_estadisticas ordenAdmision;
    private Especialidad_estadisticas especialidad;
    private SolicitudIntervencion_estadisticas solicitudIntervencion;
    private SolicitudCitologiaGinecologica_estadisticas solicitudCitologiaGinecologica;
    private SolicitudCitologia_estadisticas solicitudCitologia;
    private SolicitudAnalisisLab_estadisticas solicitudAnalisisLab;
    private DiagnosticoMedico_estadisticas diagnosticoMedicoByIdDiagnostico;
    private Referencias_estadisticas referencias;
    private Cita_estadisticas citaByIdCitaOrigen;
    private Cita_estadisticas citaByIdCitaConsulta;
    private DiagnosticoMedico_estadisticas diagnosticoMedicoByIdDiagnosticoPrincFinal;
    private SolicitudBiopsia_estadisticas solicitudBiopsia;
    private Long idIndicacionesMedicas;
    private Long idConstancia;
    private Long idContrarreferencia;
    private Long idSolicitudExamenTipiaje;
    private Date fecha;
    private String observaciones;
    private String conclusiones;
    private Long idHojaDermatologia;
    private Long idHojaGeneral;
    private Long idHojaHemOncPediatrica;
    private Long idHojaRadioterapia;
    private Long idHojaTriaje;
    private Long idHojaCirugiaColoRectal;
    private Long idHojaGinecologia;
    private Long idHojaNeurologia;
    private Long idHojaOftalmologia;
    private Long idHojaUroGenital;
    private Long idHojaGastroenterologia;
    private Long idHojaHemOncologica;
    private Long idHojaObstetricia;
    private Long idHojaOrl;
    private Long idHojaTraumatologia;
    private String motivo;
    private String enfermedadActual;
    private Date horaFin;
    private Boolean eliminado;
    private Long cid;
    private Long idCitaTriajeGral;
    private Long idTipoHoja;
    private Date horaInicio;
    private Long idHojaRefractiva;
    private Long idHojaNeuroftalmologia;
    private Long idHojaOculoplastia;
    private Long idHojaPterigium;
    private Long idHojaGlaucoma;
    private Long idHojaOftalmologiaEsp;
    private Long idHojaOftAprb;
    private Long idHojaOftCrist;
    private String identificadorDocumento;
    private Long idSignosVitales;
    private Long idHojaAps;
    private Long idHojaSldOcupacional;
    private Long idEcografiaGinecologica;
    private Long idSolPcre;
    private Long idEcoAbdominal;
    private Long idSolEndoDigestivaSup;
    private Long idSolEndoDigestivaInf;
    private Long idSolRectosigmoidoscopia;
    private Long idEvolucion;
    private Long idInformeReposo;
    private Long idLactanciaMaterna;
    private Long idHojaPreanestesica;
    private Integer edadPaciente;
    private Boolean activo;
    private Long idReaccionAdversa;

    private IndicacionMnt_estadisticas indicacionMnt;


    //Variables para la conducta seguida
    boolean chequeopreoperatorio;

    boolean interconsulta;
    boolean referencia;

    boolean tratamientomedico;
    boolean tratamientoquirurgico;


    boolean medicinaturaltradicional;
    boolean seguimiento;
    boolean alta;

    public HojaConsulta_estadisticas() {
        setChequeopreoperatorio(false);
        setTratamientomedico(false);
        setTratamientoquirurgico(false);
        setInterconsulta(false);
        setReferencia(false);
        setMedicinaturaltradicional(false);
        setSeguimiento(false);
        setAlta(false);
    }

    public HojaConsulta_estadisticas(long id,
                                     Cita_estadisticas citaByIdCitaOrigen, Date fecha, Date horaFin,
                                     Date horaInicio) {
        this.id = id;
        this.citaByIdCitaOrigen = citaByIdCitaOrigen;
        this.fecha = fecha;
        this.horaFin = horaFin;
        this.horaInicio = horaInicio;
    }

    public HojaConsulta_estadisticas(
            long id,
            Entidad_estadisticas entidad,
            OrdenAdmision_estadisticas ordenAdmision,
            Especialidad_estadisticas especialidad,
            SolicitudIntervencion_estadisticas solicitudIntervencion,
            SolicitudCitologiaGinecologica_estadisticas solicitudCitologiaGinecologica,
            SolicitudCitologia_estadisticas solicitudCitologia,
            SolicitudAnalisisLab_estadisticas solicitudAnalisisLab,
            DiagnosticoMedico_estadisticas diagnosticoMedicoByIdDiagnostico,
            Referencias_estadisticas referencias,
            Cita_estadisticas citaByIdCitaOrigen,
            Cita_estadisticas citaByIdCitaConsulta,
            DiagnosticoMedico_estadisticas diagnosticoMedicoByIdDiagnosticoPrincFinal,
            SolicitudBiopsia_estadisticas solicitudBiopsia,
            Long idIndicacionesMedicas, Long idConstancia,
            Long idContrarreferencia, Long idSolicitudExamenTipiaje,
            Date fecha, String observaciones, String conclusiones,
            Long idHojaDermatologia, Long idHojaGeneral,
            Long idHojaHemOncPediatrica, Long idHojaRadioterapia,
            Long idHojaTriaje, Long idHojaCirugiaColoRectal,
            Long idHojaGinecologia, Long idHojaNeurologia,
            Long idHojaOftalmologia, Long idHojaUroGenital,
            Long idHojaGastroenterologia, Long idHojaHemOncologica,
            Long idHojaObstetricia, Long idHojaOrl, Long idHojaTraumatologia,
            String motivo, String enfermedadActual, Date horaFin,
            Boolean eliminado, Long cid, Long idCitaTriajeGral,
            Long idTipoHoja, Date horaInicio, Long idHojaRefractiva,
            Long idHojaNeuroftalmologia, Long idHojaOculoplastia,
            Long idHojaPterigium, Long idHojaGlaucoma,
            Long idHojaOftalmologiaEsp, Long idHojaOftAprb,
            Long idHojaOftCrist, String identificadorDocumento,
            Long idSignosVitales, Long idHojaAps, Long idHojaSldOcupacional,
            Long idEcografiaGinecologica, Long idSolPcre, Long idEcoAbdominal,
            Long idSolEndoDigestivaSup, Long idSolEndoDigestivaInf,
            Long idSolRectosigmoidoscopia, Long idEvolucion,
            Long idInformeReposo, Long idLactanciaMaterna,
            Long idHojaPreanestesica, Integer edadPaciente, Boolean activo,
            Long idReaccionAdversa,
            IndicacionMnt_estadisticas indicacionMnt) {
        this.id = id;
        this.entidad = entidad;
        this.ordenAdmision = ordenAdmision;
        this.especialidad = especialidad;
        this.solicitudIntervencion = solicitudIntervencion;
        this.solicitudCitologiaGinecologica = solicitudCitologiaGinecologica;
        this.solicitudCitologia = solicitudCitologia;
        this.solicitudAnalisisLab = solicitudAnalisisLab;
        this.diagnosticoMedicoByIdDiagnostico = diagnosticoMedicoByIdDiagnostico;
        this.referencias = referencias;
        this.citaByIdCitaOrigen = citaByIdCitaOrigen;
        this.citaByIdCitaConsulta = citaByIdCitaConsulta;
        this.diagnosticoMedicoByIdDiagnosticoPrincFinal = diagnosticoMedicoByIdDiagnosticoPrincFinal;
        this.solicitudBiopsia = solicitudBiopsia;
        this.idIndicacionesMedicas = idIndicacionesMedicas;
        this.idConstancia = idConstancia;
        this.idContrarreferencia = idContrarreferencia;
        this.idSolicitudExamenTipiaje = idSolicitudExamenTipiaje;
        this.fecha = fecha;
        this.observaciones = observaciones;
        this.conclusiones = conclusiones;
        this.idHojaDermatologia = idHojaDermatologia;
        this.idHojaGeneral = idHojaGeneral;
        this.idHojaHemOncPediatrica = idHojaHemOncPediatrica;
        this.idHojaRadioterapia = idHojaRadioterapia;
        this.idHojaTriaje = idHojaTriaje;
        this.idHojaCirugiaColoRectal = idHojaCirugiaColoRectal;
        this.idHojaGinecologia = idHojaGinecologia;
        this.idHojaNeurologia = idHojaNeurologia;
        this.idHojaOftalmologia = idHojaOftalmologia;
        this.idHojaUroGenital = idHojaUroGenital;
        this.idHojaGastroenterologia = idHojaGastroenterologia;
        this.idHojaHemOncologica = idHojaHemOncologica;
        this.idHojaObstetricia = idHojaObstetricia;
        this.idHojaOrl = idHojaOrl;
        this.idHojaTraumatologia = idHojaTraumatologia;
        this.motivo = motivo;
        this.enfermedadActual = enfermedadActual;
        this.horaFin = horaFin;
        this.eliminado = eliminado;
        this.cid = cid;
        this.idCitaTriajeGral = idCitaTriajeGral;
        this.idTipoHoja = idTipoHoja;
        this.horaInicio = horaInicio;
        this.idHojaRefractiva = idHojaRefractiva;
        this.idHojaNeuroftalmologia = idHojaNeuroftalmologia;
        this.idHojaOculoplastia = idHojaOculoplastia;
        this.idHojaPterigium = idHojaPterigium;
        this.idHojaGlaucoma = idHojaGlaucoma;
        this.idHojaOftalmologiaEsp = idHojaOftalmologiaEsp;
        this.idHojaOftAprb = idHojaOftAprb;
        this.idHojaOftCrist = idHojaOftCrist;
        this.identificadorDocumento = identificadorDocumento;
        this.idSignosVitales = idSignosVitales;
        this.idHojaAps = idHojaAps;
        this.idHojaSldOcupacional = idHojaSldOcupacional;
        this.idEcografiaGinecologica = idEcografiaGinecologica;
        this.idSolPcre = idSolPcre;
        this.idEcoAbdominal = idEcoAbdominal;
        this.idSolEndoDigestivaSup = idSolEndoDigestivaSup;
        this.idSolEndoDigestivaInf = idSolEndoDigestivaInf;
        this.idSolRectosigmoidoscopia = idSolRectosigmoidoscopia;
        this.idEvolucion = idEvolucion;
        this.idInformeReposo = idInformeReposo;
        this.idLactanciaMaterna = idLactanciaMaterna;
        this.idHojaPreanestesica = idHojaPreanestesica;
        this.edadPaciente = edadPaciente;
        this.activo = activo;
        this.idReaccionAdversa = idReaccionAdversa;
        this.indicacionMnt = indicacionMnt;
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
    @JoinColumn(name = "id_orden_admision")
    public OrdenAdmision_estadisticas getOrdenAdmision() {
        return this.ordenAdmision;
    }

    public void setOrdenAdmision(OrdenAdmision_estadisticas ordenAdmision) {
        this.ordenAdmision = ordenAdmision;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_especialidad")
    public Especialidad_estadisticas getEspecialidad() {
        return this.especialidad;
    }

    public void setEspecialidad(Especialidad_estadisticas especialidad) {
        this.especialidad = especialidad;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_solicitud_intervencion_q")
    public SolicitudIntervencion_estadisticas getSolicitudIntervencion() {
        return this.solicitudIntervencion;
    }

    public void setSolicitudIntervencion(
            SolicitudIntervencion_estadisticas solicitudIntervencion) {
        this.solicitudIntervencion = solicitudIntervencion;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_sol_cit_gin")
    public SolicitudCitologiaGinecologica_estadisticas getSolicitudCitologiaGinecologica() {
        return this.solicitudCitologiaGinecologica;
    }

    public void setSolicitudCitologiaGinecologica(
            SolicitudCitologiaGinecologica_estadisticas solicitudCitologiaGinecologica) {
        this.solicitudCitologiaGinecologica = solicitudCitologiaGinecologica;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_sol_citologia")
    public SolicitudCitologia_estadisticas getSolicitudCitologia() {
        return this.solicitudCitologia;
    }

    public void setSolicitudCitologia(
            SolicitudCitologia_estadisticas solicitudCitologia) {
        this.solicitudCitologia = solicitudCitologia;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_solicitud_analisis_lab")
    public SolicitudAnalisisLab_estadisticas getSolicitudAnalisisLab() {
        return this.solicitudAnalisisLab;
    }

    public void setSolicitudAnalisisLab(
            SolicitudAnalisisLab_estadisticas solicitudAnalisisLab) {
        this.solicitudAnalisisLab = solicitudAnalisisLab;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_diagnostico")
    public DiagnosticoMedico_estadisticas getDiagnosticoMedicoByIdDiagnostico() {
        return this.diagnosticoMedicoByIdDiagnostico;
    }

    public void setDiagnosticoMedicoByIdDiagnostico(
            DiagnosticoMedico_estadisticas diagnosticoMedicoByIdDiagnostico) {
        this.diagnosticoMedicoByIdDiagnostico = diagnosticoMedicoByIdDiagnostico;
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
    @JoinColumn(name = "id_cita_origen", nullable = false)

    public Cita_estadisticas getCitaByIdCitaOrigen() {
        return this.citaByIdCitaOrigen;
    }

    public void setCitaByIdCitaOrigen(Cita_estadisticas citaByIdCitaOrigen) {
        this.citaByIdCitaOrigen = citaByIdCitaOrigen;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_cita_consulta")
    public Cita_estadisticas getCitaByIdCitaConsulta() {
        return this.citaByIdCitaConsulta;
    }

    public void setCitaByIdCitaConsulta(Cita_estadisticas citaByIdCitaConsulta) {
        this.citaByIdCitaConsulta = citaByIdCitaConsulta;
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

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_sol_biopsia")
    public SolicitudBiopsia_estadisticas getSolicitudBiopsia() {
        return this.solicitudBiopsia;
    }

    public void setSolicitudBiopsia(
            SolicitudBiopsia_estadisticas solicitudBiopsia) {
        this.solicitudBiopsia = solicitudBiopsia;
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

    @Column(name = "id_contrarreferencia")
    public Long getIdContrarreferencia() {
        return this.idContrarreferencia;
    }

    public void setIdContrarreferencia(Long idContrarreferencia) {
        this.idContrarreferencia = idContrarreferencia;
    }

    @Column(name = "id_solicitud_examen_tipiaje")
    public Long getIdSolicitudExamenTipiaje() {
        return this.idSolicitudExamenTipiaje;
    }

    public void setIdSolicitudExamenTipiaje(Long idSolicitudExamenTipiaje) {
        this.idSolicitudExamenTipiaje = idSolicitudExamenTipiaje;
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

    @Column(name = "conclusiones")
    public String getConclusiones() {
        return this.conclusiones;
    }

    public void setConclusiones(String conclusiones) {
        if (conclusiones != null)
            conclusiones = conclusiones.trim();
        this.conclusiones = conclusiones;
    }

    @Column(name = "id_hoja_dermatologia")
    public Long getIdHojaDermatologia() {
        return this.idHojaDermatologia;
    }

    public void setIdHojaDermatologia(Long idHojaDermatologia) {
        this.idHojaDermatologia = idHojaDermatologia;
    }

    @Column(name = "id_hoja_general")
    public Long getIdHojaGeneral() {
        return this.idHojaGeneral;
    }

    public void setIdHojaGeneral(Long idHojaGeneral) {
        this.idHojaGeneral = idHojaGeneral;
    }

    @Column(name = "id_hoja_hem_onc_pediatrica")
    public Long getIdHojaHemOncPediatrica() {
        return this.idHojaHemOncPediatrica;
    }

    public void setIdHojaHemOncPediatrica(Long idHojaHemOncPediatrica) {
        this.idHojaHemOncPediatrica = idHojaHemOncPediatrica;
    }

    @Column(name = "id_hoja_radioterapia")
    public Long getIdHojaRadioterapia() {
        return this.idHojaRadioterapia;
    }

    public void setIdHojaRadioterapia(Long idHojaRadioterapia) {
        this.idHojaRadioterapia = idHojaRadioterapia;
    }

    @Column(name = "id_hoja_triaje")
    public Long getIdHojaTriaje() {
        return this.idHojaTriaje;
    }

    public void setIdHojaTriaje(Long idHojaTriaje) {
        this.idHojaTriaje = idHojaTriaje;
    }

    @Column(name = "id_hoja_cirugia_colo_rectal")
    public Long getIdHojaCirugiaColoRectal() {
        return this.idHojaCirugiaColoRectal;
    }

    public void setIdHojaCirugiaColoRectal(Long idHojaCirugiaColoRectal) {
        this.idHojaCirugiaColoRectal = idHojaCirugiaColoRectal;
    }

    @Column(name = "id_hoja_ginecologia")
    public Long getIdHojaGinecologia() {
        return this.idHojaGinecologia;
    }

    public void setIdHojaGinecologia(Long idHojaGinecologia) {
        this.idHojaGinecologia = idHojaGinecologia;
    }

    @Column(name = "id_hoja_neurologia")
    public Long getIdHojaNeurologia() {
        return this.idHojaNeurologia;
    }

    public void setIdHojaNeurologia(Long idHojaNeurologia) {
        this.idHojaNeurologia = idHojaNeurologia;
    }

    @Column(name = "id_hoja_oftalmologia")
    public Long getIdHojaOftalmologia() {
        return this.idHojaOftalmologia;
    }

    public void setIdHojaOftalmologia(Long idHojaOftalmologia) {
        this.idHojaOftalmologia = idHojaOftalmologia;
    }

    @Column(name = "id_hoja_uro_genital")
    public Long getIdHojaUroGenital() {
        return this.idHojaUroGenital;
    }

    public void setIdHojaUroGenital(Long idHojaUroGenital) {
        this.idHojaUroGenital = idHojaUroGenital;
    }

    @Column(name = "id_hoja_gastroenterologia")
    public Long getIdHojaGastroenterologia() {
        return this.idHojaGastroenterologia;
    }

    public void setIdHojaGastroenterologia(Long idHojaGastroenterologia) {
        this.idHojaGastroenterologia = idHojaGastroenterologia;
    }

    @Column(name = "id_hoja_hem_oncologica")
    public Long getIdHojaHemOncologica() {
        return this.idHojaHemOncologica;
    }

    public void setIdHojaHemOncologica(Long idHojaHemOncologica) {
        this.idHojaHemOncologica = idHojaHemOncologica;
    }

    @Column(name = "id_hoja_obstetricia")
    public Long getIdHojaObstetricia() {
        return this.idHojaObstetricia;
    }

    public void setIdHojaObstetricia(Long idHojaObstetricia) {
        this.idHojaObstetricia = idHojaObstetricia;
    }

    @Column(name = "id_hoja_orl")
    public Long getIdHojaOrl() {
        return this.idHojaOrl;
    }

    public void setIdHojaOrl(Long idHojaOrl) {
        this.idHojaOrl = idHojaOrl;
    }

    @Column(name = "id_hoja_traumatologia")
    public Long getIdHojaTraumatologia() {
        return this.idHojaTraumatologia;
    }

    public void setIdHojaTraumatologia(Long idHojaTraumatologia) {
        this.idHojaTraumatologia = idHojaTraumatologia;
    }

    @Column(name = "motivo")
    public String getMotivo() {
        return this.motivo;
    }

    public void setMotivo(String motivo) {
        if (motivo != null)
            motivo = motivo.trim();
        this.motivo = motivo;
    }

    @Column(name = "enfermedad_actual")
    public String getEnfermedadActual() {
        return this.enfermedadActual;
    }

    public void setEnfermedadActual(String enfermedadActual) {
        if (enfermedadActual != null)
            enfermedadActual = enfermedadActual.trim();
        this.enfermedadActual = enfermedadActual;
    }

    @Temporal(TemporalType.TIME)
    @Column(name = "hora_fin", nullable = false, length = 8)

    public Date getHoraFin() {
        return this.horaFin;
    }

    public void setHoraFin(Date horaFin) {
        this.horaFin = horaFin;
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

    @Column(name = "id_cita_triaje_gral")
    public Long getIdCitaTriajeGral() {
        return this.idCitaTriajeGral;
    }

    public void setIdCitaTriajeGral(Long idCitaTriajeGral) {
        this.idCitaTriajeGral = idCitaTriajeGral;
    }

    @Column(name = "id_tipo_hoja")
    public Long getIdTipoHoja() {
        return this.idTipoHoja;
    }

    public void setIdTipoHoja(Long idTipoHoja) {
        this.idTipoHoja = idTipoHoja;
    }

    @Temporal(TemporalType.TIME)
    @Column(name = "hora_inicio", nullable = false, length = 8)

    public Date getHoraInicio() {
        return this.horaInicio;
    }

    public void setHoraInicio(Date horaInicio) {
        this.horaInicio = horaInicio;
    }

    @Column(name = "id_hoja_refractiva")
    public Long getIdHojaRefractiva() {
        return this.idHojaRefractiva;
    }

    public void setIdHojaRefractiva(Long idHojaRefractiva) {
        this.idHojaRefractiva = idHojaRefractiva;
    }

    @Column(name = "id_hoja_neuroftalmologia")
    public Long getIdHojaNeuroftalmologia() {
        return this.idHojaNeuroftalmologia;
    }

    public void setIdHojaNeuroftalmologia(Long idHojaNeuroftalmologia) {
        this.idHojaNeuroftalmologia = idHojaNeuroftalmologia;
    }

    @Column(name = "id_hoja_oculoplastia")
    public Long getIdHojaOculoplastia() {
        return this.idHojaOculoplastia;
    }

    public void setIdHojaOculoplastia(Long idHojaOculoplastia) {
        this.idHojaOculoplastia = idHojaOculoplastia;
    }

    @Column(name = "id_hoja_pterigium")
    public Long getIdHojaPterigium() {
        return this.idHojaPterigium;
    }

    public void setIdHojaPterigium(Long idHojaPterigium) {
        this.idHojaPterigium = idHojaPterigium;
    }

    @Column(name = "id_hoja_glaucoma")
    public Long getIdHojaGlaucoma() {
        return this.idHojaGlaucoma;
    }

    public void setIdHojaGlaucoma(Long idHojaGlaucoma) {
        this.idHojaGlaucoma = idHojaGlaucoma;
    }

    @Column(name = "id_hoja_oftalmologia_esp")
    public Long getIdHojaOftalmologiaEsp() {
        return this.idHojaOftalmologiaEsp;
    }

    public void setIdHojaOftalmologiaEsp(Long idHojaOftalmologiaEsp) {
        this.idHojaOftalmologiaEsp = idHojaOftalmologiaEsp;
    }

    @Column(name = "id_hoja_oft_aprb")
    public Long getIdHojaOftAprb() {
        return this.idHojaOftAprb;
    }

    public void setIdHojaOftAprb(Long idHojaOftAprb) {
        this.idHojaOftAprb = idHojaOftAprb;
    }

    @Column(name = "id_hoja_oft_crist")
    public Long getIdHojaOftCrist() {
        return this.idHojaOftCrist;
    }

    public void setIdHojaOftCrist(Long idHojaOftCrist) {
        this.idHojaOftCrist = idHojaOftCrist;
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

    @Column(name = "id_signos_vitales")
    public Long getIdSignosVitales() {
        return this.idSignosVitales;
    }

    public void setIdSignosVitales(Long idSignosVitales) {
        this.idSignosVitales = idSignosVitales;
    }

    @Column(name = "id_hoja_aps")
    public Long getIdHojaAps() {
        return this.idHojaAps;
    }

    public void setIdHojaAps(Long idHojaAps) {
        this.idHojaAps = idHojaAps;
    }

    @Column(name = "id_hoja_sld_ocupacional")
    public Long getIdHojaSldOcupacional() {
        return this.idHojaSldOcupacional;
    }

    public void setIdHojaSldOcupacional(Long idHojaSldOcupacional) {
        this.idHojaSldOcupacional = idHojaSldOcupacional;
    }

    @Column(name = "id_ecografia_ginecologica")
    public Long getIdEcografiaGinecologica() {
        return this.idEcografiaGinecologica;
    }

    public void setIdEcografiaGinecologica(Long idEcografiaGinecologica) {
        this.idEcografiaGinecologica = idEcografiaGinecologica;
    }

    @Column(name = "id_sol_pcre")
    public Long getIdSolPcre() {
        return this.idSolPcre;
    }

    public void setIdSolPcre(Long idSolPcre) {
        this.idSolPcre = idSolPcre;
    }

    @Column(name = "id_eco_abdominal")
    public Long getIdEcoAbdominal() {
        return this.idEcoAbdominal;
    }

    public void setIdEcoAbdominal(Long idEcoAbdominal) {
        this.idEcoAbdominal = idEcoAbdominal;
    }

    @Column(name = "id_sol_endo_digestiva_sup")
    public Long getIdSolEndoDigestivaSup() {
        return this.idSolEndoDigestivaSup;
    }

    public void setIdSolEndoDigestivaSup(Long idSolEndoDigestivaSup) {
        this.idSolEndoDigestivaSup = idSolEndoDigestivaSup;
    }

    @Column(name = "id_sol_endo_digestiva_inf")
    public Long getIdSolEndoDigestivaInf() {
        return this.idSolEndoDigestivaInf;
    }

    public void setIdSolEndoDigestivaInf(Long idSolEndoDigestivaInf) {
        this.idSolEndoDigestivaInf = idSolEndoDigestivaInf;
    }

    @Column(name = "id_sol_rectosigmoidoscopia")
    public Long getIdSolRectosigmoidoscopia() {
        return this.idSolRectosigmoidoscopia;
    }

    public void setIdSolRectosigmoidoscopia(Long idSolRectosigmoidoscopia) {
        this.idSolRectosigmoidoscopia = idSolRectosigmoidoscopia;
    }

    @Column(name = "id_evolucion")
    public Long getIdEvolucion() {
        return this.idEvolucion;
    }

    public void setIdEvolucion(Long idEvolucion) {
        this.idEvolucion = idEvolucion;
    }

    @Column(name = "id_informe_reposo")
    public Long getIdInformeReposo() {
        return this.idInformeReposo;
    }

    public void setIdInformeReposo(Long idInformeReposo) {
        this.idInformeReposo = idInformeReposo;
    }

    @Column(name = "id_lactancia_materna")
    public Long getIdLactanciaMaterna() {
        return this.idLactanciaMaterna;
    }

    public void setIdLactanciaMaterna(Long idLactanciaMaterna) {
        this.idLactanciaMaterna = idLactanciaMaterna;
    }

    @Column(name = "id_hoja_preanestesica")
    public Long getIdHojaPreanestesica() {
        return this.idHojaPreanestesica;
    }

    public void setIdHojaPreanestesica(Long idHojaPreanestesica) {
        this.idHojaPreanestesica = idHojaPreanestesica;
    }

    @Column(name = "edad_paciente")
    public Integer getEdadPaciente() {
        return this.edadPaciente;
    }

    public void setEdadPaciente(Integer edadPaciente) {
        this.edadPaciente = edadPaciente;
    }

    @Column(name = "activo")
    public Boolean getActivo() {
        return this.activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }

    @Column(name = "id_reaccion_adversa")
    public Long getIdReaccionAdversa() {
        return this.idReaccionAdversa;
    }

    public void setIdReaccionAdversa(Long idReaccionAdversa) {
        this.idReaccionAdversa = idReaccionAdversa;
    }


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_indicacion_mnt")
    public IndicacionMnt_estadisticas getIndicacionMnt() {
        return this.indicacionMnt;
    }

    public void setIndicacionMnt(IndicacionMnt_estadisticas indicacionMnt) {
        this.indicacionMnt = indicacionMnt;
    }

    @Column(name = "chequeopreoperatorio")
    public boolean isChequeopreoperatorio() {
        return chequeopreoperatorio;
    }

    public void setChequeopreoperatorio(boolean chequeopreoperatorio) {
        this.chequeopreoperatorio = chequeopreoperatorio;
    }

    @Column(name = "tratamientomedico")
    public boolean isTratamientomedico() {
        return tratamientomedico;
    }

    public void setTratamientomedico(boolean tratamientomedico) {
        this.tratamientomedico = tratamientomedico;
    }

    @Column(name = "tratamientoquirurgico")
    public boolean isTratamientoquirurgico() {
        return tratamientoquirurgico;
    }

    public void setTratamientoquirurgico(boolean tratamientoquirurgico) {
        this.tratamientoquirurgico = tratamientoquirurgico;
    }

    @Column(name = "referencia")
    public boolean isReferencia() {
        return referencia;
    }

    public void setReferencia(boolean referencia) {
        this.referencia = referencia;
    }

    @Column(name = "interconsulta")
    public boolean isInterconsulta() {
        return interconsulta;
    }

    public void setInterconsulta(boolean interconsulta) {
        this.interconsulta = interconsulta;
    }

    @Column(name = "medicinaturaltradicional")
    public boolean isMedicinaturaltradicional() {
        return medicinaturaltradicional;
    }

    public void setMedicinaturaltradicional(boolean medicinaturaltradicional) {
        this.medicinaturaltradicional = medicinaturaltradicional;
    }

    @Column(name = "seguimiento")
    public boolean isSeguimiento() {
        return seguimiento;
    }

    public void setSeguimiento(boolean seguimiento) {
        this.seguimiento = seguimiento;
    }

    @Column(name = "alta")
    public boolean isAlta() {
        return alta;
    }

    public void setAlta(boolean alta) {
        this.alta = alta;
    }

    public boolean conductaSeguida() {
        return (chequeopreoperatorio ||
                tratamientomedico ||
                tratamientoquirurgico ||
                referencia ||
                interconsulta ||
                medicinaturaltradicional ||
                seguimiento ||
                alta);
    }


}
