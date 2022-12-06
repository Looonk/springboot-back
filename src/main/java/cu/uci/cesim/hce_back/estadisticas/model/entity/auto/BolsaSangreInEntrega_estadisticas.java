package cu.uci.cesim.hce_back.estadisticas.model.entity.auto;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.*;

// Generated Apr 18, 2012 10:46:48 AM by Hibernate Tools 3.4.0.CR1


/**
 * BolsaSangreInEntrega generated by hbm2java
 */
@Entity
@Table(name = "bolsa_sangre_in_entrega", schema = "publico")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class BolsaSangreInEntrega_estadisticas implements java.io.Serializable {

    private long id;
    private Integer version;
    private EntregaSangre_estadisticas entregaSangre;
    private BolsaSangre_estadisticas bolsaSangre;
    private Long idUtilizacion;
    private Boolean eliminado;
    private Long cid;

    public BolsaSangreInEntrega_estadisticas() {
    }

    public BolsaSangreInEntrega_estadisticas(long id,
                                             EntregaSangre_estadisticas entregaSangre,
                                             BolsaSangre_estadisticas bolsaSangre) {
        this.id = id;
        this.entregaSangre = entregaSangre;
        this.bolsaSangre = bolsaSangre;
    }

    public BolsaSangreInEntrega_estadisticas(long id,
                                             EntregaSangre_estadisticas entregaSangre,
                                             BolsaSangre_estadisticas bolsaSangre, Long idUtilizacion,
                                             Boolean eliminado, Long cid) {
        this.id = id;
        this.entregaSangre = entregaSangre;
        this.bolsaSangre = bolsaSangre;
        this.idUtilizacion = idUtilizacion;
        this.eliminado = eliminado;
        this.cid = cid;
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
    @JoinColumn(name = "id_entrega_sangre", nullable = false)

    public EntregaSangre_estadisticas getEntregaSangre() {
        return this.entregaSangre;
    }

    public void setEntregaSangre(EntregaSangre_estadisticas entregaSangre) {
        this.entregaSangre = entregaSangre;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_bolsa_sangre", nullable = false)

    public BolsaSangre_estadisticas getBolsaSangre() {
        return this.bolsaSangre;
    }

    public void setBolsaSangre(BolsaSangre_estadisticas bolsaSangre) {
        this.bolsaSangre = bolsaSangre;
    }

    @Column(name = "id_utilizacion")
    public Long getIdUtilizacion() {
        return this.idUtilizacion;
    }

    public void setIdUtilizacion(Long idUtilizacion) {
        this.idUtilizacion = idUtilizacion;
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

}
