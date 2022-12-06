package cu.uci.cesim.hce_back.estadisticas.model.entity.auto;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

// Generated Apr 18, 2012 10:46:48 AM by Hibernate Tools 3.4.0.CR1


/**
 * TipoCausaMuerte generated by hbm2java
 */
@Entity
@Table(name = "tipo_causa_muerte", schema = "nomencladores", uniqueConstraints = @UniqueConstraint(columnNames = "valor"))
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class TipoCausaMuerte_estadisticas implements java.io.Serializable {

    private long id;
    private Integer version;
    private String valor;
    private Boolean eliminado;
    private Long cid;
    private String codigo;
    private Set<CausasMuerte_estadisticas> causasMuertes = new HashSet<CausasMuerte_estadisticas>(
            0);

    public TipoCausaMuerte_estadisticas() {
    }

    public TipoCausaMuerte_estadisticas(long id, String valor, String codigo) {
        this.id = id;
        this.valor = valor;
        this.codigo = codigo;
    }

    public TipoCausaMuerte_estadisticas(long id, String valor,
                                        Boolean eliminado, Long cid, String codigo,
                                        Set<CausasMuerte_estadisticas> causasMuertes) {
        this.id = id;
        this.valor = valor;
        this.eliminado = eliminado;
        this.cid = cid;
        this.codigo = codigo;
        this.causasMuertes = causasMuertes;
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

    @Column(name = "codigo", nullable = false)

    public String getCodigo() {
        return this.codigo;
    }

    public void setCodigo(String codigo) {
        if (codigo != null)
            codigo = codigo.trim();
        this.codigo = codigo;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "tipoCausaMuerte")
    public Set<CausasMuerte_estadisticas> getCausasMuertes() {
        return this.causasMuertes;
    }

    public void setCausasMuertes(Set<CausasMuerte_estadisticas> causasMuertes) {
        this.causasMuertes = causasMuertes;
    }

}
