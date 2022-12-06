package cu.uci.cesim.hce_back.estadisticas.model.entity.auto;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.*;

// Generated Apr 18, 2012 10:46:48 AM by Hibernate Tools 3.4.0.CR1


/**
 * DistritoSanitario generated by hbm2java
 */
@Entity
@Table(name = "distrito_sanitario", schema = "nomencladores")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class DistritoSanitario_estadisticas implements java.io.Serializable {

    private long id;
    private int version;
    private Localidad_estadisticas localidad;
    private String valor;
    private boolean eliminado;
    private long cid;
    private String codigo;

    public DistritoSanitario_estadisticas() {
    }

    public DistritoSanitario_estadisticas(long id,
                                          Localidad_estadisticas localidad, String valor, boolean eliminado,
                                          long cid) {
        this.id = id;
        this.localidad = localidad;
        this.valor = valor;
        this.eliminado = eliminado;
        this.cid = cid;
    }

    public DistritoSanitario_estadisticas(long id,
                                          Localidad_estadisticas localidad, String valor, boolean eliminado,
                                          long cid, String codigo) {
        this.id = id;
        this.localidad = localidad;
        this.valor = valor;
        this.eliminado = eliminado;
        this.cid = cid;
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

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_localidad", nullable = false)

    public Localidad_estadisticas getLocalidad() {
        return this.localidad;
    }

    public void setLocalidad(Localidad_estadisticas localidad) {
        this.localidad = localidad;
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

    @Column(name = "eliminado", nullable = false)

    public boolean isEliminado() {
        return this.eliminado;
    }

    public void setEliminado(boolean eliminado) {
        this.eliminado = eliminado;
    }

    @Column(name = "cid", nullable = false)

    public long getCid() {
        return this.cid;
    }

    public void setCid(long cid) {
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

}