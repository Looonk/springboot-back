package cu.uci.cesim.hce_back.estadisticas.model.entity.auto;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.*;
import java.util.Date;

// Generated Apr 18, 2012 10:46:48 AM by Hibernate Tools 3.4.0.CR1

/**
 * InfecFicha generated by hbm2java
 */
@Entity
@Table(name = "infec_ficha", schema = "epidemiologia")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class InfecFicha_estadisticas implements java.io.Serializable {

    private long id;
    private Integer version;
    private Funcionalidad_estadisticas funcionalidad;
    private SolicitudIntervencion_estadisticas solicitudIntervencion;
    private ServicioInEntidad_estadisticas servicioInEntidad;
    private InfecMonitoreo_estadisticas infecMonitoreo;
    private Long cid;
    private Boolean eliminado;
    private Integer numeroFicha;
    private String enfermedadesSubyacente;
    private String observaciones;
    private Boolean fiebre;
    private Date fechaSospecha;
    private String otrosCriteriosSospecha;
    private String otrosCriteriosExtrinsecos;
    private Boolean neonato;
    private Float pesoAlNacer;
    private Integer edadGestacional;
    private Long idCondicion;
    private String sitio;
    private Date fechaInicioProbable;
    private String germen;
    private String antibiotico;
    private String observacion;
    private Boolean cirugiaPrevia;
    private Date fechaIntervencion;
    private Boolean electiva;
    private Boolean urgente;
    private Boolean intervencionPracticada;
    private Integer estado;
    private Date fechaCreacion;
    private Long idCondicionEgreso;
    private Long idUsuario;
    private String otroGermenValor;
    private Boolean otroGermen;

    public InfecFicha_estadisticas() {
    }

    public InfecFicha_estadisticas(long id) {
        this.id = id;
    }

    public InfecFicha_estadisticas(long id,
                                   Funcionalidad_estadisticas funcionalidad,
                                   SolicitudIntervencion_estadisticas solicitudIntervencion,
                                   ServicioInEntidad_estadisticas servicioInEntidad,
                                   InfecMonitoreo_estadisticas infecMonitoreo, Long cid,
                                   Boolean eliminado, Integer numeroFicha,
                                   String enfermedadesSubyacente, String observaciones,
                                   Boolean fiebre, Date fechaSospecha, String otrosCriteriosSospecha,
                                   String otrosCriteriosExtrinsecos, Boolean neonato,
                                   Float pesoAlNacer, Integer edadGestacional, Long idCondicion,
                                   String sitio, Date fechaInicioProbable, String germen,
                                   String antibiotico, String observacion, Boolean cirugiaPrevia,
                                   Date fechaIntervencion, Boolean electiva, Boolean urgente,
                                   Boolean intervencionPracticada, Integer estado, Date fechaCreacion,
                                   Long idCondicionEgreso, Long idUsuario, String otroGermenValor,
                                   Boolean otroGermen) {
        this.id = id;
        this.funcionalidad = funcionalidad;
        this.solicitudIntervencion = solicitudIntervencion;
        this.servicioInEntidad = servicioInEntidad;
        this.infecMonitoreo = infecMonitoreo;
        this.cid = cid;
        this.eliminado = eliminado;
        this.numeroFicha = numeroFicha;
        this.enfermedadesSubyacente = enfermedadesSubyacente;
        this.observaciones = observaciones;
        this.fiebre = fiebre;
        this.fechaSospecha = fechaSospecha;
        this.otrosCriteriosSospecha = otrosCriteriosSospecha;
        this.otrosCriteriosExtrinsecos = otrosCriteriosExtrinsecos;
        this.neonato = neonato;
        this.pesoAlNacer = pesoAlNacer;
        this.edadGestacional = edadGestacional;
        this.idCondicion = idCondicion;
        this.sitio = sitio;
        this.fechaInicioProbable = fechaInicioProbable;
        this.germen = germen;
        this.antibiotico = antibiotico;
        this.observacion = observacion;
        this.cirugiaPrevia = cirugiaPrevia;
        this.fechaIntervencion = fechaIntervencion;
        this.electiva = electiva;
        this.urgente = urgente;
        this.intervencionPracticada = intervencionPracticada;
        this.estado = estado;
        this.fechaCreacion = fechaCreacion;
        this.idCondicionEgreso = idCondicionEgreso;
        this.idUsuario = idUsuario;
        this.otroGermenValor = otroGermenValor;
        this.otroGermen = otroGermen;
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
    @JoinColumn(name = "id_funcionalidad")
    public Funcionalidad_estadisticas getFuncionalidad() {
        return this.funcionalidad;
    }

    public void setFuncionalidad(Funcionalidad_estadisticas funcionalidad) {
        this.funcionalidad = funcionalidad;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_solicitud_intervencion")
    public SolicitudIntervencion_estadisticas getSolicitudIntervencion() {
        return this.solicitudIntervencion;
    }

    public void setSolicitudIntervencion(
            SolicitudIntervencion_estadisticas solicitudIntervencion) {
        this.solicitudIntervencion = solicitudIntervencion;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_servicio")
    public ServicioInEntidad_estadisticas getServicioInEntidad() {
        return this.servicioInEntidad;
    }

    public void setServicioInEntidad(
            ServicioInEntidad_estadisticas servicioInEntidad) {
        this.servicioInEntidad = servicioInEntidad;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_monitoreo")
    public InfecMonitoreo_estadisticas getInfecMonitoreo() {
        return this.infecMonitoreo;
    }

    public void setInfecMonitoreo(InfecMonitoreo_estadisticas infecMonitoreo) {
        this.infecMonitoreo = infecMonitoreo;
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

    @Column(name = "numero_ficha")
    public Integer getNumeroFicha() {
        return this.numeroFicha;
    }

    public void setNumeroFicha(Integer numeroFicha) {
        this.numeroFicha = numeroFicha;
    }

    @Column(name = "enfermedades_subyacente")
    public String getEnfermedadesSubyacente() {
        return this.enfermedadesSubyacente;
    }

    public void setEnfermedadesSubyacente(String enfermedadesSubyacente) {
        if (enfermedadesSubyacente != null)
            enfermedadesSubyacente = enfermedadesSubyacente.trim();
        this.enfermedadesSubyacente = enfermedadesSubyacente;
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

    @Column(name = "fiebre")
    public Boolean getFiebre() {
        return this.fiebre;
    }

    public void setFiebre(Boolean fiebre) {
        this.fiebre = fiebre;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "fecha_sospecha", length = 13)
    public Date getFechaSospecha() {
        return this.fechaSospecha;
    }

    public void setFechaSospecha(Date fechaSospecha) {
        this.fechaSospecha = fechaSospecha;
    }

    @Column(name = "otros_criterios_sospecha")
    public String getOtrosCriteriosSospecha() {
        return this.otrosCriteriosSospecha;
    }

    public void setOtrosCriteriosSospecha(String otrosCriteriosSospecha) {
        if (otrosCriteriosSospecha != null)
            otrosCriteriosSospecha = otrosCriteriosSospecha.trim();
        this.otrosCriteriosSospecha = otrosCriteriosSospecha;
    }

    @Column(name = "otros_criterios_extrinsecos")
    public String getOtrosCriteriosExtrinsecos() {
        return this.otrosCriteriosExtrinsecos;
    }

    public void setOtrosCriteriosExtrinsecos(String otrosCriteriosExtrinsecos) {
        if (otrosCriteriosExtrinsecos != null)
            otrosCriteriosExtrinsecos = otrosCriteriosExtrinsecos.trim();
        this.otrosCriteriosExtrinsecos = otrosCriteriosExtrinsecos;
    }

    @Column(name = "neonato")
    public Boolean getNeonato() {
        return this.neonato;
    }

    public void setNeonato(Boolean neonato) {
        this.neonato = neonato;
    }

    @Column(name = "peso_al_nacer", precision = 8, scale = 8)
    public Float getPesoAlNacer() {
        return this.pesoAlNacer;
    }

    public void setPesoAlNacer(Float pesoAlNacer) {
        this.pesoAlNacer = pesoAlNacer;
    }

    @Column(name = "edad_gestacional")
    public Integer getEdadGestacional() {
        return this.edadGestacional;
    }

    public void setEdadGestacional(Integer edadGestacional) {
        this.edadGestacional = edadGestacional;
    }

    @Column(name = "id_condicion")
    public Long getIdCondicion() {
        return this.idCondicion;
    }

    public void setIdCondicion(Long idCondicion) {
        this.idCondicion = idCondicion;
    }

    @Column(name = "sitio")
    public String getSitio() {
        return this.sitio;
    }

    public void setSitio(String sitio) {
        if (sitio != null)
            sitio = sitio.trim();
        this.sitio = sitio;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "fecha_inicio_probable", length = 13)
    public Date getFechaInicioProbable() {
        return this.fechaInicioProbable;
    }

    public void setFechaInicioProbable(Date fechaInicioProbable) {
        this.fechaInicioProbable = fechaInicioProbable;
    }

    @Column(name = "germen")
    public String getGermen() {
        return this.germen;
    }

    public void setGermen(String germen) {
        if (germen != null)
            germen = germen.trim();
        this.germen = germen;
    }

    @Column(name = "antibiotico")
    public String getAntibiotico() {
        return this.antibiotico;
    }

    public void setAntibiotico(String antibiotico) {
        if (antibiotico != null)
            antibiotico = antibiotico.trim();
        this.antibiotico = antibiotico;
    }

    @Column(name = "observacion")
    public String getObservacion() {
        return this.observacion;
    }

    public void setObservacion(String observacion) {
        if (observacion != null)
            observacion = observacion.trim();
        this.observacion = observacion;
    }

    @Column(name = "cirugia_previa")
    public Boolean getCirugiaPrevia() {
        return this.cirugiaPrevia;
    }

    public void setCirugiaPrevia(Boolean cirugiaPrevia) {
        this.cirugiaPrevia = cirugiaPrevia;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "fecha_intervencion", length = 13)
    public Date getFechaIntervencion() {
        return this.fechaIntervencion;
    }

    public void setFechaIntervencion(Date fechaIntervencion) {
        this.fechaIntervencion = fechaIntervencion;
    }

    @Column(name = "electiva")
    public Boolean getElectiva() {
        return this.electiva;
    }

    public void setElectiva(Boolean electiva) {
        this.electiva = electiva;
    }

    @Column(name = "urgente")
    public Boolean getUrgente() {
        return this.urgente;
    }

    public void setUrgente(Boolean urgente) {
        this.urgente = urgente;
    }

    @Column(name = "intervencion_practicada")
    public Boolean getIntervencionPracticada() {
        return this.intervencionPracticada;
    }

    public void setIntervencionPracticada(Boolean intervencionPracticada) {
        this.intervencionPracticada = intervencionPracticada;
    }

    @Column(name = "estado")
    public Integer getEstado() {
        return this.estado;
    }

    public void setEstado(Integer estado) {
        this.estado = estado;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "fecha_creacion", length = 13)
    public Date getFechaCreacion() {
        return this.fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    @Column(name = "id_condicion_egreso")
    public Long getIdCondicionEgreso() {
        return this.idCondicionEgreso;
    }

    public void setIdCondicionEgreso(Long idCondicionEgreso) {
        this.idCondicionEgreso = idCondicionEgreso;
    }

    @Column(name = "id_usuario")
    public Long getIdUsuario() {
        return this.idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }

    @Column(name = "otro_germen_valor")
    public String getOtroGermenValor() {
        return this.otroGermenValor;
    }

    public void setOtroGermenValor(String otroGermenValor) {
        if (otroGermenValor != null)
            otroGermenValor = otroGermenValor.trim();
        this.otroGermenValor = otroGermenValor;
    }

    @Column(name = "otro_germen")
    public Boolean getOtroGermen() {
        return this.otroGermen;
    }

    public void setOtroGermen(Boolean otroGermen) {
        this.otroGermen = otroGermen;
    }

}
