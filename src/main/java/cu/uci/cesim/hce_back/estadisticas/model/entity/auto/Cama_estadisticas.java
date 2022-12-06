package cu.uci.cesim.hce_back.estadisticas.model.entity.auto;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

// Generated Apr 18, 2012 10:46:48 AM by Hibernate Tools 3.4.0.CR1


/**
 * Cama generated by hbm2java
 */
@Entity
@Table(name = "cama", schema = "comun")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Cama_estadisticas implements java.io.Serializable {

    private long id;
    private Integer version;
    private Admision_estadisticas admision;
    private Ubicacion_estadisticas ubicacion;
    private ServicioInEntidad_estadisticas servicioInEntidadByIdServicioFlotante;
    private ServicioInEntidad_estadisticas servicioInEntidadByIdServicio;
    private EstadoCama_estadisticas estadoCama;
    private String descripcion;
    private Boolean eliminado;
    private Long cid;
    private long idTipoCama;
    private long idCategoriaCama;
    private Long idHabitacion;
    private int x;
    private int y;
    private Set<OrdenTransferencia_estadisticas> ordenTransferenciasForCamaEstaba = new HashSet<OrdenTransferencia_estadisticas>(
            0);
    private Set<Transferencia_estadisticas> transferencias = new HashSet<Transferencia_estadisticas>(
            0);
    private Set<OrdenTransferencia_estadisticas> ordenTransferenciasForCamaFutura = new HashSet<OrdenTransferencia_estadisticas>(
            0);
    private Set<InfecMonitoreo_estadisticas> infecMonitoreos = new HashSet<InfecMonitoreo_estadisticas>(
            0);
    private Set<Admision_estadisticas> admisions = new HashSet<Admision_estadisticas>(
            0);

    public Cama_estadisticas() {
    }

    public Cama_estadisticas(long id,
                             ServicioInEntidad_estadisticas servicioInEntidadByIdServicio,
                             EstadoCama_estadisticas estadoCama, String descripcion,
                             long idTipoCama, long idCategoriaCama, int x, int y) {
        this.id = id;
        this.servicioInEntidadByIdServicio = servicioInEntidadByIdServicio;
        this.estadoCama = estadoCama;
        this.descripcion = descripcion;
        this.idTipoCama = idTipoCama;
        this.idCategoriaCama = idCategoriaCama;
        this.x = x;
        this.y = y;
    }

    public Cama_estadisticas(
            long id,
            Admision_estadisticas admision,
            Ubicacion_estadisticas ubicacion,
            ServicioInEntidad_estadisticas servicioInEntidadByIdServicioFlotante,
            ServicioInEntidad_estadisticas servicioInEntidadByIdServicio,
            EstadoCama_estadisticas estadoCama,
            String descripcion,
            Boolean eliminado,
            Long cid,
            long idTipoCama,
            long idCategoriaCama,
            Long idHabitacion,
            int x,
            int y,
            Set<OrdenTransferencia_estadisticas> ordenTransferenciasForCamaEstaba,
            Set<Transferencia_estadisticas> transferencias,
            Set<OrdenTransferencia_estadisticas> ordenTransferenciasForCamaFutura,
            Set<InfecMonitoreo_estadisticas> infecMonitoreos,
            Set<Admision_estadisticas> admisions) {
        this.id = id;
        this.admision = admision;
        this.ubicacion = ubicacion;
        this.servicioInEntidadByIdServicioFlotante = servicioInEntidadByIdServicioFlotante;
        this.servicioInEntidadByIdServicio = servicioInEntidadByIdServicio;
        this.estadoCama = estadoCama;
        this.descripcion = descripcion;
        this.eliminado = eliminado;
        this.cid = cid;
        this.idTipoCama = idTipoCama;
        this.idCategoriaCama = idCategoriaCama;
        this.idHabitacion = idHabitacion;
        this.x = x;
        this.y = y;
        this.ordenTransferenciasForCamaEstaba = ordenTransferenciasForCamaEstaba;
        this.transferencias = transferencias;
        this.ordenTransferenciasForCamaFutura = ordenTransferenciasForCamaFutura;
        this.infecMonitoreos = infecMonitoreos;
        this.admisions = admisions;
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
    @JoinColumn(name = "id_admision")
    public Admision_estadisticas getAdmision() {
        return this.admision;
    }

    public void setAdmision(Admision_estadisticas admision) {
        this.admision = admision;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_ubicacion")
    public Ubicacion_estadisticas getUbicacion() {
        return this.ubicacion;
    }

    public void setUbicacion(Ubicacion_estadisticas ubicacion) {
        this.ubicacion = ubicacion;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_servicio_flotante")
    public ServicioInEntidad_estadisticas getServicioInEntidadByIdServicioFlotante() {
        return this.servicioInEntidadByIdServicioFlotante;
    }

    public void setServicioInEntidadByIdServicioFlotante(
            ServicioInEntidad_estadisticas servicioInEntidadByIdServicioFlotante) {
        this.servicioInEntidadByIdServicioFlotante = servicioInEntidadByIdServicioFlotante;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_servicio", nullable = false)

    public ServicioInEntidad_estadisticas getServicioInEntidadByIdServicio() {
        return this.servicioInEntidadByIdServicio;
    }

    public void setServicioInEntidadByIdServicio(
            ServicioInEntidad_estadisticas servicioInEntidadByIdServicio) {
        this.servicioInEntidadByIdServicio = servicioInEntidadByIdServicio;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_estado", nullable = false)

    public EstadoCama_estadisticas getEstadoCama() {
        return this.estadoCama;
    }

    public void setEstadoCama(EstadoCama_estadisticas estadoCama) {
        this.estadoCama = estadoCama;
    }

    @Column(name = "descripcion", nullable = false)

    public String getDescripcion() {
        return this.descripcion;
    }

    public void setDescripcion(String descripcion) {
        if (descripcion != null)
            descripcion = descripcion.trim();
        this.descripcion = descripcion;
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

    @Column(name = "id_tipo_cama", nullable = false)

    public long getIdTipoCama() {
        return this.idTipoCama;
    }

    public void setIdTipoCama(long idTipoCama) {
        this.idTipoCama = idTipoCama;
    }

    @Column(name = "id_categoria_cama", nullable = false)

    public long getIdCategoriaCama() {
        return this.idCategoriaCama;
    }

    public void setIdCategoriaCama(long idCategoriaCama) {
        this.idCategoriaCama = idCategoriaCama;
    }

    @Column(name = "id_habitacion")
    public Long getIdHabitacion() {
        return this.idHabitacion;
    }

    public void setIdHabitacion(Long idHabitacion) {
        this.idHabitacion = idHabitacion;
    }

    @Column(name = "x", nullable = false)

    public int getX() {
        return this.x;
    }

    public void setX(int x) {
        this.x = x;
    }

    @Column(name = "y", nullable = false)

    public int getY() {
        return this.y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "camaByCamaEstaba")
    public Set<OrdenTransferencia_estadisticas> getOrdenTransferenciasForCamaEstaba() {
        return this.ordenTransferenciasForCamaEstaba;
    }

    public void setOrdenTransferenciasForCamaEstaba(
            Set<OrdenTransferencia_estadisticas> ordenTransferenciasForCamaEstaba) {
        this.ordenTransferenciasForCamaEstaba = ordenTransferenciasForCamaEstaba;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "cama")
    public Set<Transferencia_estadisticas> getTransferencias() {
        return this.transferencias;
    }

    public void setTransferencias(Set<Transferencia_estadisticas> transferencias) {
        this.transferencias = transferencias;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "camaByCamaFutura")
    public Set<OrdenTransferencia_estadisticas> getOrdenTransferenciasForCamaFutura() {
        return this.ordenTransferenciasForCamaFutura;
    }

    public void setOrdenTransferenciasForCamaFutura(
            Set<OrdenTransferencia_estadisticas> ordenTransferenciasForCamaFutura) {
        this.ordenTransferenciasForCamaFutura = ordenTransferenciasForCamaFutura;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "cama")
    public Set<InfecMonitoreo_estadisticas> getInfecMonitoreos() {
        return this.infecMonitoreos;
    }

    public void setInfecMonitoreos(
            Set<InfecMonitoreo_estadisticas> infecMonitoreos) {
        this.infecMonitoreos = infecMonitoreos;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "cama")
    public Set<Admision_estadisticas> getAdmisions() {
        return this.admisions;
    }

    public void setAdmisions(Set<Admision_estadisticas> admisions) {
        this.admisions = admisions;
    }

}
