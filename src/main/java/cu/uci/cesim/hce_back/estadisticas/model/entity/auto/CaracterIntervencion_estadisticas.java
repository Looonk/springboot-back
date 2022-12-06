package cu.uci.cesim.hce_back.estadisticas.model.entity.auto;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

// Generated Apr 18, 2012 10:46:48 AM by Hibernate Tools 3.4.0.CR1


/**
 * CaracterIntervencion generated by hbm2java
 */
@Entity
@Table(name = "caracter_intervencion", schema = "nomencladores", uniqueConstraints = @UniqueConstraint(columnNames = "valor"))
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class CaracterIntervencion_estadisticas implements java.io.Serializable {

    private long id;
    private Integer version;
    private String valor;
    private Long cid;
    private Boolean eliminado;
    private String codigo;
    private Set<SolicitudIntervencion_estadisticas> solicitudIntervencions = new HashSet<SolicitudIntervencion_estadisticas>(
            0);

    public CaracterIntervencion_estadisticas() {
    }

    public CaracterIntervencion_estadisticas(long id, String valor) {
        this.id = id;
        this.valor = valor;
    }

    public CaracterIntervencion_estadisticas(long id, String valor, Long cid,
                                             Boolean eliminado, String codigo,
                                             Set<SolicitudIntervencion_estadisticas> solicitudIntervencions) {
        this.id = id;
        this.valor = valor;
        this.cid = cid;
        this.eliminado = eliminado;
        this.codigo = codigo;
        this.solicitudIntervencions = solicitudIntervencions;
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

    @Column(name = "valor", unique = true, nullable = false)

    public String getValor() {
        return this.valor;
    }

    public void setValor(String valor) {
        if (valor != null)
            valor = valor.trim();
        this.valor = valor;
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

    @Column(name = "codigo")
    public String getCodigo() {
        return this.codigo;
    }

    public void setCodigo(String codigo) {
        if (codigo != null)
            codigo = codigo.trim();
        this.codigo = codigo;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "caracterIntervencion")
    public Set<SolicitudIntervencion_estadisticas> getSolicitudIntervencions() {
        return this.solicitudIntervencions;
    }

    public void setSolicitudIntervencions(
            Set<SolicitudIntervencion_estadisticas> solicitudIntervencions) {
        this.solicitudIntervencions = solicitudIntervencions;
    }

}
