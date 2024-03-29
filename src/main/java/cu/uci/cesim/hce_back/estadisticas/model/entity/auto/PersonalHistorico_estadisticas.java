package cu.uci.cesim.hce_back.estadisticas.model.entity.auto;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.*;
import java.util.Date;

// Generated Apr 18, 2012 10:46:48 AM by Hibernate Tools 3.4.0.CR1

/**
 * PersonalHistorico generated by hbm2java
 */
@Entity
@Table(name = "personal_historico", schema = "estadisticas")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class PersonalHistorico_estadisticas implements java.io.Serializable {

    private long id;
    private Integer version;
    private Entidad_estadisticas entidad;
    private TipoPersonal_estadisticas tipoPersonal;
    private Long cantidad;
    private Date fecha;
    private Long cid;
    private Boolean eliminado;

    public PersonalHistorico_estadisticas() {
    }

    public PersonalHistorico_estadisticas(long id) {
        this.id = id;
    }

    public PersonalHistorico_estadisticas(long id,
                                          Entidad_estadisticas entidad,
                                          TipoPersonal_estadisticas tipoPersonal, Long cantidad, Date fecha,
                                          Long cid, Boolean eliminado) {
        this.id = id;
        this.entidad = entidad;
        this.tipoPersonal = tipoPersonal;
        this.cantidad = cantidad;
        this.fecha = fecha;
        this.cid = cid;
        this.eliminado = eliminado;
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
    @JoinColumn(name = "id_tipo_personal")
    public TipoPersonal_estadisticas getTipoPersonal() {
        return this.tipoPersonal;
    }

    public void setTipoPersonal(TipoPersonal_estadisticas tipoPersonal) {
        this.tipoPersonal = tipoPersonal;
    }

    @Column(name = "cantidad")
    public Long getCantidad() {
        return this.cantidad;
    }

    public void setCantidad(Long cantidad) {
        this.cantidad = cantidad;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "fecha", length = 13)
    public Date getFecha() {
        return this.fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
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

}
