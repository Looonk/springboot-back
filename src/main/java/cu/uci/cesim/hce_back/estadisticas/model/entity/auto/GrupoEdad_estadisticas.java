package cu.uci.cesim.hce_back.estadisticas.model.entity.auto;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

// Generated Apr 18, 2012 10:46:48 AM by Hibernate Tools 3.4.0.CR1


/**
 * GrupoEdad generated by hbm2java
 */
@Entity
@Table(name = "grupo_edad", schema = "nomencladores")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class GrupoEdad_estadisticas implements java.io.Serializable {

    private long id;
    private int version;
    private String valor;
    private long cid;
    private boolean eliminado;
    private int edadinicial;
    private int edadfinal;
    private String codigo;
    private Boolean poblacion;
    private Set<TpobPinfluAgeInEnt_estadisticas> tpobPinfluAgeInEnts = new HashSet<TpobPinfluAgeInEnt_estadisticas>(
            0);

    public GrupoEdad_estadisticas() {
    }

    public GrupoEdad_estadisticas(long id, String valor, long cid,
                                  boolean eliminado, int edadinicial, int edadfinal) {
        this.id = id;
        this.valor = valor;
        this.cid = cid;
        this.eliminado = eliminado;
        this.edadinicial = edadinicial;
        this.edadfinal = edadfinal;
    }

    public GrupoEdad_estadisticas(long id, String valor, long cid,
                                  boolean eliminado, int edadinicial, int edadfinal, String codigo,
                                  Boolean poblacion,
                                  Set<TpobPinfluAgeInEnt_estadisticas> tpobPinfluAgeInEnts) {
        this.id = id;
        this.valor = valor;
        this.cid = cid;
        this.eliminado = eliminado;
        this.edadinicial = edadinicial;
        this.edadfinal = edadfinal;
        this.codigo = codigo;
        this.poblacion = poblacion;
        this.tpobPinfluAgeInEnts = tpobPinfluAgeInEnts;
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

    @Column(name = "edadinicial", nullable = false)

    public int getEdadinicial() {
        return this.edadinicial;
    }

    public void setEdadinicial(int edadinicial) {
        this.edadinicial = edadinicial;
    }

    @Column(name = "edadfinal", nullable = false)

    public int getEdadfinal() {
        return this.edadfinal;
    }

    public void setEdadfinal(int edadfinal) {
        this.edadfinal = edadfinal;
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

    @Column(name = "poblacion")
    public Boolean getPoblacion() {
        return this.poblacion;
    }

    public void setPoblacion(Boolean poblacion) {
        this.poblacion = poblacion;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "grupoEdad")
    public Set<TpobPinfluAgeInEnt_estadisticas> getTpobPinfluAgeInEnts() {
        return this.tpobPinfluAgeInEnts;
    }

    public void setTpobPinfluAgeInEnts(
            Set<TpobPinfluAgeInEnt_estadisticas> tpobPinfluAgeInEnts) {
        this.tpobPinfluAgeInEnts = tpobPinfluAgeInEnts;
    }

}