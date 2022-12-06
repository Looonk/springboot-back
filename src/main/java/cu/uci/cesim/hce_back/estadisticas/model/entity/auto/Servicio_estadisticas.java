package cu.uci.cesim.hce_back.estadisticas.model.entity.auto;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

// Generated Apr 18, 2012 10:46:48 AM by Hibernate Tools 3.4.0.CR1


/**
 * Servicio generated by hbm2java
 */
@Entity
@Table(name = "servicio", schema = "comun", uniqueConstraints = @UniqueConstraint(columnNames = "nombre"))
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Servicio_estadisticas implements java.io.Serializable {

    private long id;
    private Integer version;
    @JsonIgnore
    private Departamento_estadisticas departamento;
    @JsonIgnore
    private Servicio_estadisticas servicio;
    private String nombre;
    private Boolean eliminado;
    private Long cid;
    private String codigo;
    private Boolean servicioFisico;
    @JsonIgnore
    private Set<Servicio_estadisticas> servicios = new HashSet<Servicio_estadisticas>(
            0);
    @JsonIgnore
    private Set<ServicioInEntidad_estadisticas> servicioInEntidads = new HashSet<ServicioInEntidad_estadisticas>(
            0);
    @JsonIgnore
    private Set<CamasHistorico_estadisticas> camasHistoricos = new HashSet<CamasHistorico_estadisticas>(
            0);
    @JsonIgnore
    private Set<OrigenSolicitudAnatomia_estadisticas> origenSolicitudAnatomias = new HashSet<OrigenSolicitudAnatomia_estadisticas>(
            0);
    @JsonIgnore
    private Set<Admision_estadisticas> admisionsForIdServicioUbicacionEntrada = new HashSet<Admision_estadisticas>(
            0);
    @JsonIgnore
    private Set<Admision_estadisticas> admisionsForIdServicioTratanteEntrada = new HashSet<Admision_estadisticas>(
            0);
    @JsonIgnore
    private Set<Admision_estadisticas> admisionsForIdServicioTratante = new HashSet<Admision_estadisticas>(
            0);
    @JsonIgnore
    private Set<Referencias_estadisticas> referenciases = new HashSet<Referencias_estadisticas>(
            0);
    @JsonIgnore
    private Set<Especialidad_estadisticas> especialidads = new HashSet<Especialidad_estadisticas>(
            0);
    @JsonIgnore
    private Set<OrdenTransferencia_estadisticas> ordenTransferenciasForIdServicioEmisorUbicacion = new HashSet<OrdenTransferencia_estadisticas>(
            0);
    @JsonIgnore
    private Set<ServicioInEntidad_estadisticas> servicioInEntidads_1 = new HashSet<ServicioInEntidad_estadisticas>(
            0);
    @JsonIgnore
    private Set<OrdenTransferencia_estadisticas> ordenTransferenciasForIdServicioReceptorUbicacion = new HashSet<OrdenTransferencia_estadisticas>(
            0);
    @JsonIgnore
    private Set<Admision_estadisticas> admisionsForIdServicioUbicacion = new HashSet<Admision_estadisticas>(
            0);

    public Servicio_estadisticas() {
    }

    public Servicio_estadisticas(long id,
                                 Departamento_estadisticas departamento, String nombre) {
        this.id = id;
        this.departamento = departamento;
        this.nombre = nombre;
    }

    public Servicio_estadisticas(
            long id,
            Departamento_estadisticas departamento,
            Servicio_estadisticas servicio,
            String nombre,
            Boolean eliminado,
            Long cid,
            String codigo,
            Boolean servicioFisico,
            Set<Servicio_estadisticas> servicios,
            Set<ServicioInEntidad_estadisticas> servicioInEntidads,
            Set<CamasHistorico_estadisticas> camasHistoricos,
            Set<OrigenSolicitudAnatomia_estadisticas> origenSolicitudAnatomias,
            Set<Admision_estadisticas> admisionsForIdServicioUbicacionEntrada,
            Set<Admision_estadisticas> admisionsForIdServicioTratanteEntrada,
            Set<Admision_estadisticas> admisionsForIdServicioTratante,
            Set<Referencias_estadisticas> referenciases,
            Set<Especialidad_estadisticas> especialidads,
            Set<OrdenTransferencia_estadisticas> ordenTransferenciasForIdServicioEmisorUbicacion,
            Set<ServicioInEntidad_estadisticas> servicioInEntidads_1,
            Set<OrdenTransferencia_estadisticas> ordenTransferenciasForIdServicioReceptorUbicacion,
            Set<Admision_estadisticas> admisionsForIdServicioUbicacion) {
        this.id = id;
        this.departamento = departamento;
        this.servicio = servicio;
        this.nombre = nombre;
        this.eliminado = eliminado;
        this.cid = cid;
        this.codigo = codigo;
        this.servicioFisico = servicioFisico;
        this.servicios = servicios;
        this.servicioInEntidads = servicioInEntidads;
        this.camasHistoricos = camasHistoricos;
        this.origenSolicitudAnatomias = origenSolicitudAnatomias;
        this.admisionsForIdServicioUbicacionEntrada = admisionsForIdServicioUbicacionEntrada;
        this.admisionsForIdServicioTratanteEntrada = admisionsForIdServicioTratanteEntrada;
        this.admisionsForIdServicioTratante = admisionsForIdServicioTratante;
        this.referenciases = referenciases;
        this.especialidads = especialidads;
        this.ordenTransferenciasForIdServicioEmisorUbicacion = ordenTransferenciasForIdServicioEmisorUbicacion;
        this.servicioInEntidads_1 = servicioInEntidads_1;
        this.ordenTransferenciasForIdServicioReceptorUbicacion = ordenTransferenciasForIdServicioReceptorUbicacion;
        this.admisionsForIdServicioUbicacion = admisionsForIdServicioUbicacion;
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
    @JoinColumn(name = "id_departamento", nullable = false)

    public Departamento_estadisticas getDepartamento() {
        return this.departamento;
    }

    public void setDepartamento(Departamento_estadisticas departamento) {
        this.departamento = departamento;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_servicio_padre")
    public Servicio_estadisticas getServicio() {
        return this.servicio;
    }

    public void setServicio(Servicio_estadisticas servicio) {
        this.servicio = servicio;
    }

    @Column(name = "nombre", unique = true, nullable = false)

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        if (nombre != null)
            nombre = nombre.trim();
        this.nombre = nombre;
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

    @Column(name = "codigo")
    public String getCodigo() {
        return this.codigo;
    }

    public void setCodigo(String codigo) {
        if (codigo != null)
            codigo = codigo.trim();
        this.codigo = codigo;
    }

    @Column(name = "servicio_fisico")
    public Boolean getServicioFisico() {
        return this.servicioFisico;
    }

    public void setServicioFisico(Boolean servicioFisico) {
        this.servicioFisico = servicioFisico;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "servicio")
    public Set<Servicio_estadisticas> getServicios() {
        return this.servicios;
    }

    public void setServicios(Set<Servicio_estadisticas> servicios) {
        this.servicios = servicios;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "servicio")
    public Set<ServicioInEntidad_estadisticas> getServicioInEntidads() {
        return this.servicioInEntidads;
    }

    public void setServicioInEntidads(
            Set<ServicioInEntidad_estadisticas> servicioInEntidads) {
        this.servicioInEntidads = servicioInEntidads;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "servicio")
    public Set<CamasHistorico_estadisticas> getCamasHistoricos() {
        return this.camasHistoricos;
    }

    public void setCamasHistoricos(
            Set<CamasHistorico_estadisticas> camasHistoricos) {
        this.camasHistoricos = camasHistoricos;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "servicio")
    public Set<OrigenSolicitudAnatomia_estadisticas> getOrigenSolicitudAnatomias() {
        return this.origenSolicitudAnatomias;
    }

    public void setOrigenSolicitudAnatomias(
            Set<OrigenSolicitudAnatomia_estadisticas> origenSolicitudAnatomias) {
        this.origenSolicitudAnatomias = origenSolicitudAnatomias;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "servicioByIdServicioUbicacionEntrada")
    public Set<Admision_estadisticas> getAdmisionsForIdServicioUbicacionEntrada() {
        return this.admisionsForIdServicioUbicacionEntrada;
    }

    public void setAdmisionsForIdServicioUbicacionEntrada(
            Set<Admision_estadisticas> admisionsForIdServicioUbicacionEntrada) {
        this.admisionsForIdServicioUbicacionEntrada = admisionsForIdServicioUbicacionEntrada;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "servicioByIdServicioTratanteEntrada")
    public Set<Admision_estadisticas> getAdmisionsForIdServicioTratanteEntrada() {
        return this.admisionsForIdServicioTratanteEntrada;
    }

    public void setAdmisionsForIdServicioTratanteEntrada(
            Set<Admision_estadisticas> admisionsForIdServicioTratanteEntrada) {
        this.admisionsForIdServicioTratanteEntrada = admisionsForIdServicioTratanteEntrada;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "servicioByIdServicioTratante")
    public Set<Admision_estadisticas> getAdmisionsForIdServicioTratante() {
        return this.admisionsForIdServicioTratante;
    }

    public void setAdmisionsForIdServicioTratante(
            Set<Admision_estadisticas> admisionsForIdServicioTratante) {
        this.admisionsForIdServicioTratante = admisionsForIdServicioTratante;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "servicio")
    public Set<Referencias_estadisticas> getReferenciases() {
        return this.referenciases;
    }

    public void setReferenciases(Set<Referencias_estadisticas> referenciases) {
        this.referenciases = referenciases;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "servicio")
    public Set<Especialidad_estadisticas> getEspecialidads() {
        return this.especialidads;
    }

    public void setEspecialidads(Set<Especialidad_estadisticas> especialidads) {
        this.especialidads = especialidads;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "servicioByIdServicioEmisorUbicacion")
    public Set<OrdenTransferencia_estadisticas> getOrdenTransferenciasForIdServicioEmisorUbicacion() {
        return this.ordenTransferenciasForIdServicioEmisorUbicacion;
    }

    public void setOrdenTransferenciasForIdServicioEmisorUbicacion(
            Set<OrdenTransferencia_estadisticas> ordenTransferenciasForIdServicioEmisorUbicacion) {
        this.ordenTransferenciasForIdServicioEmisorUbicacion = ordenTransferenciasForIdServicioEmisorUbicacion;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "servicio")
    public Set<ServicioInEntidad_estadisticas> getServicioInEntidads_1() {
        return this.servicioInEntidads_1;
    }

    public void setServicioInEntidads_1(
            Set<ServicioInEntidad_estadisticas> servicioInEntidads_1) {
        this.servicioInEntidads_1 = servicioInEntidads_1;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "servicioByIdServicioReceptorUbicacion")
    public Set<OrdenTransferencia_estadisticas> getOrdenTransferenciasForIdServicioReceptorUbicacion() {
        return this.ordenTransferenciasForIdServicioReceptorUbicacion;
    }

    public void setOrdenTransferenciasForIdServicioReceptorUbicacion(
            Set<OrdenTransferencia_estadisticas> ordenTransferenciasForIdServicioReceptorUbicacion) {
        this.ordenTransferenciasForIdServicioReceptorUbicacion = ordenTransferenciasForIdServicioReceptorUbicacion;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "servicioByIdServicioUbicacion")
    public Set<Admision_estadisticas> getAdmisionsForIdServicioUbicacion() {
        return this.admisionsForIdServicioUbicacion;
    }

    public void setAdmisionsForIdServicioUbicacion(
            Set<Admision_estadisticas> admisionsForIdServicioUbicacion) {
        this.admisionsForIdServicioUbicacion = admisionsForIdServicioUbicacion;
    }

}