package cu.uci.cesim.hce_back.estadisticas.model.entity.auto;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

// Generated Apr 18, 2012 10:46:48 AM by Hibernate Tools 3.4.0.CR1


/**
 * TipoReaccionTransfusional generated by hbm2java
 */
@Entity
@Table(name = "tipo_reaccion_transfusional", schema = "nomencladores")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class TipoReaccionTransfusional_estadisticas implements
        java.io.Serializable {

    private long id;
    private Integer version;
    private String valor;
    private Boolean eliminado;
    private Long cid;
    private String codigo;
    private Set<RegistroTransfusion_estadisticas> registroTransfusions = new HashSet<RegistroTransfusion_estadisticas>(
            0);

    public TipoReaccionTransfusional_estadisticas() {
    }

    public TipoReaccionTransfusional_estadisticas(long id, String valor,
                                                  String codigo) {
        this.id = id;
        this.valor = valor;
        this.codigo = codigo;
    }

    public TipoReaccionTransfusional_estadisticas(long id, String valor,
                                                  Boolean eliminado, Long cid, String codigo,
                                                  Set<RegistroTransfusion_estadisticas> registroTransfusions) {
        this.id = id;
        this.valor = valor;
        this.eliminado = eliminado;
        this.cid = cid;
        this.codigo = codigo;
        this.registroTransfusions = registroTransfusions;
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

    @Column(name = "codigo", nullable = false)

    public String getCodigo() {
        return this.codigo;
    }

    public void setCodigo(String codigo) {
        if (codigo != null)
            codigo = codigo.trim();
        this.codigo = codigo;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "tipoReaccionTransfusional")
    public Set<RegistroTransfusion_estadisticas> getRegistroTransfusions() {
        return this.registroTransfusions;
    }

    public void setRegistroTransfusions(
            Set<RegistroTransfusion_estadisticas> registroTransfusions) {
        this.registroTransfusions = registroTransfusions;
    }

}
