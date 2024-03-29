package cu.uci.cesim.hce_back.estadisticas.model.entity.auto;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

// Generated Apr 18, 2012 10:46:48 AM by Hibernate Tools 3.4.0.CR1


/**
 * EstadoCivil generated by hbm2java
 */
@Entity
@Table(name = "estado_civil", schema = "nomencladores", uniqueConstraints = {
        @UniqueConstraint(columnNames = "valor"),
        @UniqueConstraint(columnNames = "codigo_sap")})
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class EstadoCivil_estadisticas implements java.io.Serializable {

    private long id;
    private Integer version;
    private String valor;
    private Boolean eliminado;
    private Long cid;
    private String codigo;
    private String codigoSap;
    private Set<PersonaHist_estadisticas> personaHists = new HashSet<PersonaHist_estadisticas>(
            0);
    private Set<Persona_estadisticas> personas = new HashSet<Persona_estadisticas>(
            0);

    public EstadoCivil_estadisticas() {
    }

    public EstadoCivil_estadisticas(long id, String valor) {
        this.id = id;
        this.valor = valor;
    }

    public EstadoCivil_estadisticas(long id, String valor, Boolean eliminado,
                                    Long cid, String codigo, String codigoSap,
                                    Set<PersonaHist_estadisticas> personaHists,
                                    Set<Persona_estadisticas> personas) {
        this.id = id;
        this.valor = valor;
        this.eliminado = eliminado;
        this.cid = cid;
        this.codigo = codigo;
        this.codigoSap = codigoSap;
        this.personaHists = personaHists;
        this.personas = personas;
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

    @Column(name = "codigo")
    public String getCodigo() {
        return this.codigo;
    }

    public void setCodigo(String codigo) {
        if (codigo != null)
            codigo = codigo.trim();
        this.codigo = codigo;
    }

    @Column(name = "codigo_sap", unique = true)
    public String getCodigoSap() {
        return this.codigoSap;
    }

    public void setCodigoSap(String codigoSap) {
        if (codigoSap != null)
            codigoSap = codigoSap.trim();
        this.codigoSap = codigoSap;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "estadoCivil")
    public Set<PersonaHist_estadisticas> getPersonaHists() {
        return this.personaHists;
    }

    public void setPersonaHists(Set<PersonaHist_estadisticas> personaHists) {
        this.personaHists = personaHists;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "estadoCivil")
    public Set<Persona_estadisticas> getPersonas() {
        return this.personas;
    }

    public void setPersonas(Set<Persona_estadisticas> personas) {
        this.personas = personas;
    }

}
