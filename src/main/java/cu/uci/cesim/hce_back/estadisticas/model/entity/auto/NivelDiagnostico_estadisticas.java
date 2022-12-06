package cu.uci.cesim.hce_back.estadisticas.model.entity.auto;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.*;

// Generated Apr 18, 2012 10:46:48 AM by Hibernate Tools 3.4.0.CR1


/**
 * NivelDiagnostico generated by hbm2java
 */
@Entity
@Table(name = "nivel_diagnostico", schema = "nomencladores")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class NivelDiagnostico_estadisticas implements java.io.Serializable {

    private long id;
    private int version;
    private String valor;
    private long cid;
    private boolean eliminado;
    private String codigo;

    public NivelDiagnostico_estadisticas() {
    }

    public NivelDiagnostico_estadisticas(long id, String valor, long cid,
                                         boolean eliminado) {
        this.id = id;
        this.valor = valor;
        this.cid = cid;
        this.eliminado = eliminado;
    }

    public NivelDiagnostico_estadisticas(long id, String valor, long cid,
                                         boolean eliminado, String codigo) {
        this.id = id;
        this.valor = valor;
        this.cid = cid;
        this.eliminado = eliminado;
        this.codigo = codigo;
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
    @Column(name = "version", nullable = false)

    public int getVersion() {
        return this.version;
    }

    public void setVersion(int version) {
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

    @Column(name = "cid", nullable = false)

    public long getCid() {
        return this.cid;
    }

    public void setCid(long cid) {
        this.cid = cid;
    }

    @Column(name = "eliminado", nullable = false)

    public boolean isEliminado() {
        return this.eliminado;
    }

    public void setEliminado(boolean eliminado) {
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

}
