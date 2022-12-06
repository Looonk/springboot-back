package cu.uci.cesim.hce_back.estadisticas.model.entity.auto;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

// Generated Apr 18, 2012 10:46:48 AM by Hibernate Tools 3.4.0.CR1


/**
 * ServicioInEntidad generated by hbm2java
 */
@Entity
@Table(name = "servicio_in_entidad", schema = "comun", uniqueConstraints = @UniqueConstraint(columnNames = {
        "id_entidad", "id_servicio"}))
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class ServicioInEntidad_estadisticas implements java.io.Serializable {

    private long id;
    private int version;
    private Entidad_estadisticas entidad;
    private Servicio_estadisticas servicio;
    private Long cid;
    private Boolean eliminado;
    private Boolean tieneConsultaExterna;
    private Boolean tieneHospitalizacion;
    private Integer idRis;
    private Boolean tieneEmergencia;
    private Set<Egreso_estadisticas> egresos = new HashSet<Egreso_estadisticas>(
            0);

    private Set<SolicitudAnalisisLab_estadisticas> solicitudAnalisisLabs = new HashSet<SolicitudAnalisisLab_estadisticas>(
            0);
    private Set<OrdenAdmision_estadisticas> ordenAdmisions = new HashSet<OrdenAdmision_estadisticas>(
            0);
    private Set<HojaEmergencia_estadisticas> hojaEmergencias = new HashSet<HojaEmergencia_estadisticas>(
            0);
    private Set<OrdenTransferencia_estadisticas> ordenTransferenciasForIdServicioEmisor = new HashSet<OrdenTransferencia_estadisticas>(
            0);
    private Set<OrdenTransferencia_estadisticas> ordenTransferenciasForIdServicioReceptor = new HashSet<OrdenTransferencia_estadisticas>(
            0);
    private Set<SolicitudInterconsulta_estadisticas> solicitudInterconsultasForIdServicioSolicitante = new HashSet<SolicitudInterconsulta_estadisticas>(
            0);
    private Set<SolicitudIntervencion_estadisticas> solicitudIntervencions = new HashSet<SolicitudIntervencion_estadisticas>(
            0);
    private Set<Cama_estadisticas> camasForIdServicioFlotante = new HashSet<Cama_estadisticas>(
            0);
    private Set<Cama_estadisticas> camasForIdServicio = new HashSet<Cama_estadisticas>(
            0);
    private Set<SolicitudInterconsulta_estadisticas> solicitudInterconsultasForIdSerivicioSolicitado = new HashSet<SolicitudInterconsulta_estadisticas>(
            0);
    private Set<InfecFicha_estadisticas> infecFichas = new HashSet<InfecFicha_estadisticas>(
            0);
    private Set<Ubicacion_estadisticas> ubicacions = new HashSet<Ubicacion_estadisticas>(
            0);

    private Set<Usuario_estadisticas> usuarios = new HashSet<Usuario_estadisticas>(0);

    public ServicioInEntidad_estadisticas() {
    }

    public ServicioInEntidad_estadisticas(long id,
                                          Entidad_estadisticas entidad, Servicio_estadisticas servicio) {
        this.id = id;
        this.entidad = entidad;
        this.servicio = servicio;
    }

    public ServicioInEntidad_estadisticas(
            long id,
            Entidad_estadisticas entidad,
            Servicio_estadisticas servicio,
            Long cid,
            Boolean eliminado,
            Boolean tieneConsultaExterna,
            Boolean tieneHospitalizacion,
            Integer idRis,
            Boolean tieneEmergencia,
            Set<Egreso_estadisticas> egresos,
            Set<SolicitudAnalisisLab_estadisticas> solicitudAnalisisLabs,
            Set<OrdenAdmision_estadisticas> ordenAdmisions,
            Set<HojaEmergencia_estadisticas> hojaEmergencias,
            Set<OrdenTransferencia_estadisticas> ordenTransferenciasForIdServicioEmisor,
            Set<OrdenTransferencia_estadisticas> ordenTransferenciasForIdServicioReceptor,
            Set<SolicitudInterconsulta_estadisticas> solicitudInterconsultasForIdServicioSolicitante,
            Set<SolicitudIntervencion_estadisticas> solicitudIntervencions,
            Set<Cama_estadisticas> camasForIdServicioFlotante,
            Set<Cama_estadisticas> camasForIdServicio,
            Set<SolicitudInterconsulta_estadisticas> solicitudInterconsultasForIdSerivicioSolicitado,
            Set<InfecFicha_estadisticas> infecFichas,
            Set<Ubicacion_estadisticas> ubicacions) {
        this.id = id;
        this.entidad = entidad;
        this.servicio = servicio;
        this.cid = cid;
        this.eliminado = eliminado;
        this.tieneConsultaExterna = tieneConsultaExterna;
        this.tieneHospitalizacion = tieneHospitalizacion;
        this.idRis = idRis;
        this.tieneEmergencia = tieneEmergencia;
        this.egresos = egresos;
        this.solicitudAnalisisLabs = solicitudAnalisisLabs;
        this.ordenAdmisions = ordenAdmisions;
        this.hojaEmergencias = hojaEmergencias;
        this.ordenTransferenciasForIdServicioEmisor = ordenTransferenciasForIdServicioEmisor;
        this.ordenTransferenciasForIdServicioReceptor = ordenTransferenciasForIdServicioReceptor;
        this.solicitudInterconsultasForIdServicioSolicitante = solicitudInterconsultasForIdServicioSolicitante;
        this.solicitudIntervencions = solicitudIntervencions;
        this.camasForIdServicioFlotante = camasForIdServicioFlotante;
        this.camasForIdServicio = camasForIdServicio;
        this.solicitudInterconsultasForIdSerivicioSolicitado = solicitudInterconsultasForIdSerivicioSolicitado;
        this.infecFichas = infecFichas;
        this.ubicacions = ubicacions;
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
    @JoinColumn(name = "id_entidad", nullable = false)

    public Entidad_estadisticas getEntidad() {
        return this.entidad;
    }

    public void setEntidad(Entidad_estadisticas entidad) {
        this.entidad = entidad;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_servicio", nullable = false)

    public Servicio_estadisticas getServicio() {
        return this.servicio;
    }

    public void setServicio(Servicio_estadisticas servicio) {
        this.servicio = servicio;
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

    @Column(name = "tiene_consulta_externa")
    public Boolean getTieneConsultaExterna() {
        return this.tieneConsultaExterna;
    }

    public void setTieneConsultaExterna(Boolean tieneConsultaExterna) {
        this.tieneConsultaExterna = tieneConsultaExterna;
    }

    @Column(name = "tiene_hospitalizacion")
    public Boolean getTieneHospitalizacion() {
        return this.tieneHospitalizacion;
    }

    public void setTieneHospitalizacion(Boolean tieneHospitalizacion) {
        this.tieneHospitalizacion = tieneHospitalizacion;
    }

    @Column(name = "id_ris")
    public Integer getIdRis() {
        return this.idRis;
    }

    public void setIdRis(Integer idRis) {
        this.idRis = idRis;
    }

    @Column(name = "tiene_emergencia")
    public Boolean getTieneEmergencia() {
        return this.tieneEmergencia;
    }

    public void setTieneEmergencia(Boolean tieneEmergencia) {
        this.tieneEmergencia = tieneEmergencia;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "servicioInEntidad")
    public Set<Egreso_estadisticas> getEgresos() {
        return this.egresos;
    }

    public void setEgresos(Set<Egreso_estadisticas> egresos) {
        this.egresos = egresos;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "servicioInEntidad")
    public Set<SolicitudAnalisisLab_estadisticas> getSolicitudAnalisisLabs() {
        return this.solicitudAnalisisLabs;
    }

    public void setSolicitudAnalisisLabs(
            Set<SolicitudAnalisisLab_estadisticas> solicitudAnalisisLabs) {
        this.solicitudAnalisisLabs = solicitudAnalisisLabs;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "servicioInEntidad")
    public Set<OrdenAdmision_estadisticas> getOrdenAdmisions() {
        return this.ordenAdmisions;
    }

    public void setOrdenAdmisions(Set<OrdenAdmision_estadisticas> ordenAdmisions) {
        this.ordenAdmisions = ordenAdmisions;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "servicioInEntidad")
    public Set<HojaEmergencia_estadisticas> getHojaEmergencias() {
        return this.hojaEmergencias;
    }

    public void setHojaEmergencias(
            Set<HojaEmergencia_estadisticas> hojaEmergencias) {
        this.hojaEmergencias = hojaEmergencias;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "servicioInEntidadByIdServicioEmisor")
    public Set<OrdenTransferencia_estadisticas> getOrdenTransferenciasForIdServicioEmisor() {
        return this.ordenTransferenciasForIdServicioEmisor;
    }

    public void setOrdenTransferenciasForIdServicioEmisor(
            Set<OrdenTransferencia_estadisticas> ordenTransferenciasForIdServicioEmisor) {
        this.ordenTransferenciasForIdServicioEmisor = ordenTransferenciasForIdServicioEmisor;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "servicioInEntidadByIdServicioReceptor")
    public Set<OrdenTransferencia_estadisticas> getOrdenTransferenciasForIdServicioReceptor() {
        return this.ordenTransferenciasForIdServicioReceptor;
    }

    public void setOrdenTransferenciasForIdServicioReceptor(
            Set<OrdenTransferencia_estadisticas> ordenTransferenciasForIdServicioReceptor) {
        this.ordenTransferenciasForIdServicioReceptor = ordenTransferenciasForIdServicioReceptor;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "servicioInEntidadByIdServicioSolicitante")
    public Set<SolicitudInterconsulta_estadisticas> getSolicitudInterconsultasForIdServicioSolicitante() {
        return this.solicitudInterconsultasForIdServicioSolicitante;
    }

    public void setSolicitudInterconsultasForIdServicioSolicitante(
            Set<SolicitudInterconsulta_estadisticas> solicitudInterconsultasForIdServicioSolicitante) {
        this.solicitudInterconsultasForIdServicioSolicitante = solicitudInterconsultasForIdServicioSolicitante;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "servicioInEntidad")
    public Set<SolicitudIntervencion_estadisticas> getSolicitudIntervencions() {
        return this.solicitudIntervencions;
    }

    public void setSolicitudIntervencions(
            Set<SolicitudIntervencion_estadisticas> solicitudIntervencions) {
        this.solicitudIntervencions = solicitudIntervencions;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "servicioInEntidadByIdServicioFlotante")
    public Set<Cama_estadisticas> getCamasForIdServicioFlotante() {
        return this.camasForIdServicioFlotante;
    }

    public void setCamasForIdServicioFlotante(
            Set<Cama_estadisticas> camasForIdServicioFlotante) {
        this.camasForIdServicioFlotante = camasForIdServicioFlotante;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "servicioInEntidadByIdServicio")
    public Set<Cama_estadisticas> getCamasForIdServicio() {
        return this.camasForIdServicio;
    }

    public void setCamasForIdServicio(Set<Cama_estadisticas> camasForIdServicio) {
        this.camasForIdServicio = camasForIdServicio;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "servicioInEntidadByIdSerivicioSolicitado")
    public Set<SolicitudInterconsulta_estadisticas> getSolicitudInterconsultasForIdSerivicioSolicitado() {
        return this.solicitudInterconsultasForIdSerivicioSolicitado;
    }

    public void setSolicitudInterconsultasForIdSerivicioSolicitado(
            Set<SolicitudInterconsulta_estadisticas> solicitudInterconsultasForIdSerivicioSolicitado) {
        this.solicitudInterconsultasForIdSerivicioSolicitado = solicitudInterconsultasForIdSerivicioSolicitado;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "servicioInEntidad")
    public Set<InfecFicha_estadisticas> getInfecFichas() {
        return this.infecFichas;
    }

    public void setInfecFichas(Set<InfecFicha_estadisticas> infecFichas) {
        this.infecFichas = infecFichas;
    }

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "usuario_in_servicio", schema = "comun", joinColumns = {@JoinColumn(name = "id_servicio", nullable = false, updatable = false)}, inverseJoinColumns = {@JoinColumn(name = "id_usuario", nullable = false, updatable = false)})
    public Set<Usuario_estadisticas> getUsuarios() {
        return this.usuarios;
    }

    public void setUsuarios(Set<Usuario_estadisticas> usuarios) {
        this.usuarios = usuarios;
    }

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "ubicacion_in_servicio", schema = "comun", joinColumns = {@JoinColumn(name = "id_servicio", nullable = false, updatable = false)}, inverseJoinColumns = {@JoinColumn(name = "id_ubicacion", nullable = false, updatable = false)})
    public Set<Ubicacion_estadisticas> getUbicacions() {
        return this.ubicacions;
    }

    public void setUbicacions(Set<Ubicacion_estadisticas> ubicacions) {
        this.ubicacions = ubicacions;
    }

}
