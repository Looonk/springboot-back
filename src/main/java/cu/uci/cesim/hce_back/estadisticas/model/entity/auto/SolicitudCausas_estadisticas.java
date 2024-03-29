package cu.uci.cesim.hce_back.estadisticas.model.entity.auto;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.*;

// Generated Apr 18, 2012 10:46:48 AM by Hibernate Tools 3.4.0.CR1


/**
 * SolicitudCausas generated by hbm2java
 */
@Entity
@Table(name = "solicitud_causas", schema = "quirofano")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class SolicitudCausas_estadisticas implements java.io.Serializable {

    private long id;
    private Integer version;
    private CipProcedimiento_estadisticas cipProcedimiento;
    private SolicitudIntervencion_estadisticas solicitudIntervencion;
    private CausaCancelIntervencion_estadisticas causaCancelIntervencion;
    private Long cid;
    private Boolean eliminado;
    private Long idServicio;

    public SolicitudCausas_estadisticas() {
    }

    public SolicitudCausas_estadisticas(long id,
                                        SolicitudIntervencion_estadisticas solicitudIntervencion,
                                        CausaCancelIntervencion_estadisticas causaCancelIntervencion) {
        this.id = id;
        this.solicitudIntervencion = solicitudIntervencion;
        this.causaCancelIntervencion = causaCancelIntervencion;
    }

    public SolicitudCausas_estadisticas(long id,
                                        CipProcedimiento_estadisticas cipProcedimiento,
                                        SolicitudIntervencion_estadisticas solicitudIntervencion,
                                        CausaCancelIntervencion_estadisticas causaCancelIntervencion,
                                        Long cid, Boolean eliminado, Long idServicio) {
        this.id = id;
        this.cipProcedimiento = cipProcedimiento;
        this.solicitudIntervencion = solicitudIntervencion;
        this.causaCancelIntervencion = causaCancelIntervencion;
        this.cid = cid;
        this.eliminado = eliminado;
        this.idServicio = idServicio;
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
    @JoinColumn(name = "id_procedimiento")
    public CipProcedimiento_estadisticas getCipProcedimiento() {
        return this.cipProcedimiento;
    }

    public void setCipProcedimiento(
            CipProcedimiento_estadisticas cipProcedimiento) {
        this.cipProcedimiento = cipProcedimiento;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_solicitud", nullable = false)

    public SolicitudIntervencion_estadisticas getSolicitudIntervencion() {
        return this.solicitudIntervencion;
    }

    public void setSolicitudIntervencion(
            SolicitudIntervencion_estadisticas solicitudIntervencion) {
        this.solicitudIntervencion = solicitudIntervencion;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_causa", nullable = false)

    public CausaCancelIntervencion_estadisticas getCausaCancelIntervencion() {
        return this.causaCancelIntervencion;
    }

    public void setCausaCancelIntervencion(
            CausaCancelIntervencion_estadisticas causaCancelIntervencion) {
        this.causaCancelIntervencion = causaCancelIntervencion;
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

    @Column(name = "id_servicio")
    public Long getIdServicio() {
        return this.idServicio;
    }

    public void setIdServicio(Long idServicio) {
        this.idServicio = idServicio;
    }

}
