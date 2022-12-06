package cu.uci.cesim.hce_back.estadisticas.model.entity.auto;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

// Generated Apr 18, 2012 10:46:48 AM by Hibernate Tools 3.4.0.CR1


/**
 * CipCategoria generated by hbm2java
 */
@Entity
@Table(name = "cip_categoria", schema = "estandares")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class CipCategoria_estadisticas implements java.io.Serializable {

    private long id;
    private Integer version;
    private CipGrupo_estadisticas cipGrupo;
    private String codigo;
    private String valor;
    private Boolean eliminado;
    private Long cid;
    private Set<CipProcedimiento_estadisticas> cipProcedimientos = new HashSet<CipProcedimiento_estadisticas>(
            0);

    public CipCategoria_estadisticas() {
    }

    public CipCategoria_estadisticas(long id, CipGrupo_estadisticas cipGrupo,
                                     String codigo, String valor) {
        this.id = id;
        this.cipGrupo = cipGrupo;
        this.codigo = codigo;
        this.valor = valor;
    }

    public CipCategoria_estadisticas(long id, CipGrupo_estadisticas cipGrupo,
                                     String codigo, String valor, Boolean eliminado, Long cid,
                                     Set<CipProcedimiento_estadisticas> cipProcedimientos) {
        this.id = id;
        this.cipGrupo = cipGrupo;
        this.codigo = codigo;
        this.valor = valor;
        this.eliminado = eliminado;
        this.cid = cid;
        this.cipProcedimientos = cipProcedimientos;
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
    @JoinColumn(name = "id_grupo", nullable = false)

    public CipGrupo_estadisticas getCipGrupo() {
        return this.cipGrupo;
    }

    public void setCipGrupo(CipGrupo_estadisticas cipGrupo) {
        this.cipGrupo = cipGrupo;
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

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "cipCategoria")
    public Set<CipProcedimiento_estadisticas> getCipProcedimientos() {
        return this.cipProcedimientos;
    }

    public void setCipProcedimientos(
            Set<CipProcedimiento_estadisticas> cipProcedimientos) {
        this.cipProcedimientos = cipProcedimientos;
    }

}
