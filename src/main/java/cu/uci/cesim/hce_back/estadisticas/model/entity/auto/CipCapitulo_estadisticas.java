package cu.uci.cesim.hce_back.estadisticas.model.entity.auto;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

// Generated Apr 18, 2012 10:46:48 AM by Hibernate Tools 3.4.0.CR1


/**
 * CipCapitulo generated by hbm2java
 */
@Entity
@Table(name = "cip_capitulo", schema = "estandares")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class CipCapitulo_estadisticas implements java.io.Serializable {

    private long id;
    private Integer version;
    private String codigo;
    private String valor;
    private Boolean eliminado;
    private Long cid;
    private Set<CipGrupo_estadisticas> cipGrupos = new HashSet<CipGrupo_estadisticas>(
            0);

    public CipCapitulo_estadisticas() {
    }

    public CipCapitulo_estadisticas(long id, String codigo, String valor) {
        this.id = id;
        this.codigo = codigo;
        this.valor = valor;
    }

    public CipCapitulo_estadisticas(long id, String codigo, String valor,
                                    Boolean eliminado, Long cid, Set<CipGrupo_estadisticas> cipGrupos) {
        this.id = id;
        this.codigo = codigo;
        this.valor = valor;
        this.eliminado = eliminado;
        this.cid = cid;
        this.cipGrupos = cipGrupos;
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

    @Column(name = "codigo", nullable = false)

    public String getCodigo() {
        return this.codigo;
    }

    public void setCodigo(String codigo) {
        if (codigo != null)
            codigo = codigo.trim();
        this.codigo = codigo;
    }

    @Column(name = "valor", nullable = false)

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

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "cipCapitulo")
    public Set<CipGrupo_estadisticas> getCipGrupos() {
        return this.cipGrupos;
    }

    public void setCipGrupos(Set<CipGrupo_estadisticas> cipGrupos) {
        this.cipGrupos = cipGrupos;
    }

}
