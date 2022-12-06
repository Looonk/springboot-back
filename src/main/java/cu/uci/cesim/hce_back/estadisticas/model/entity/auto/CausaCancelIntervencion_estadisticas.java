package cu.uci.cesim.hce_back.estadisticas.model.entity.auto;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

// Generated Apr 18, 2012 10:46:48 AM by Hibernate Tools 3.4.0.CR1


/**
 * CausaCancelIntervencion generated by hbm2java
 */
@Entity
@Table(name = "causa_cancel_intervencion", schema = "nomencladores", uniqueConstraints = @UniqueConstraint(columnNames = "valor"))
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class CausaCancelIntervencion_estadisticas implements
        java.io.Serializable {

    private long id;
    private Integer version;
    private ObjetoCancelCirugia_estadisticas objetoCancelCirugia;
    private String valor;
    private Boolean eliminado;
    private Long cid;
    private String codigo;
    private Set<SolicitudCausas_estadisticas> solicitudCausases = new HashSet<SolicitudCausas_estadisticas>(
            0);

    public CausaCancelIntervencion_estadisticas() {
    }

    public CausaCancelIntervencion_estadisticas(long id,
                                                ObjetoCancelCirugia_estadisticas objetoCancelCirugia, String valor) {
        this.id = id;
        this.objetoCancelCirugia = objetoCancelCirugia;
        this.valor = valor;
    }

    public CausaCancelIntervencion_estadisticas(long id,
                                                ObjetoCancelCirugia_estadisticas objetoCancelCirugia, String valor,
                                                Boolean eliminado, Long cid, String codigo,
                                                Set<SolicitudCausas_estadisticas> solicitudCausases) {
        this.id = id;
        this.objetoCancelCirugia = objetoCancelCirugia;
        this.valor = valor;
        this.eliminado = eliminado;
        this.cid = cid;
        this.codigo = codigo;
        this.solicitudCausases = solicitudCausases;
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
    @JoinColumn(name = "id_objeto_cancelacion", nullable = false)

    public ObjetoCancelCirugia_estadisticas getObjetoCancelCirugia() {
        return this.objetoCancelCirugia;
    }

    public void setObjetoCancelCirugia(
            ObjetoCancelCirugia_estadisticas objetoCancelCirugia) {
        this.objetoCancelCirugia = objetoCancelCirugia;
    }

    @Column(name = "valor", unique = true, nullable = false)

    public String getValor() {
        return this.valor;
    }

    public void setValor(String valor) {
        if (valor != null)
            valor = valor.trim();
        this.valor = valor;
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

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "causaCancelIntervencion")
    public Set<SolicitudCausas_estadisticas> getSolicitudCausases() {
        return this.solicitudCausases;
    }

    public void setSolicitudCausases(
            Set<SolicitudCausas_estadisticas> solicitudCausases) {
        this.solicitudCausases = solicitudCausases;
    }

}