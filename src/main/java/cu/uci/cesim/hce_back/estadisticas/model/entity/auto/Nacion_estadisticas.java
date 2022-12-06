package cu.uci.cesim.hce_back.estadisticas.model.entity.auto;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

// Generated Apr 18, 2012 10:46:48 AM by Hibernate Tools 3.4.0.CR1


/**
 * Nacion generated by hbm2java
 */
@Entity
@Table(name = "nacion", schema = "nomencladores", uniqueConstraints = {
        @UniqueConstraint(columnNames = "valor"),
        @UniqueConstraint(columnNames = "nacionalidad")})
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Nacion_estadisticas implements java.io.Serializable {

    private long id;
    private Integer version;
    private String valor;
    private String nacionalidad;
    private Boolean eliminado;
    private Long cid;
    private String codigo;
    private Set<PersonaHist_estadisticas> personaHists = new HashSet<PersonaHist_estadisticas>(
            0);
    private Set<Estado_estadisticas> estados = new HashSet<Estado_estadisticas>(
            0);
    private Set<Persona_estadisticas> personas = new HashSet<Persona_estadisticas>(
            0);
    private Set<Direccion_estadisticas> direccions = new HashSet<Direccion_estadisticas>(
            0);

    public Nacion_estadisticas() {
    }

    public Nacion_estadisticas(long id, String valor, String nacionalidad) {
        this.id = id;
        this.valor = valor;
        this.nacionalidad = nacionalidad;
    }

    public Nacion_estadisticas(long id, String valor, String nacionalidad,
                               Boolean eliminado, Long cid, String codigo,
                               Set<PersonaHist_estadisticas> personaHists,
                               Set<Estado_estadisticas> estados,
                               Set<Persona_estadisticas> personas,
                               Set<Direccion_estadisticas> direccions) {
        this.id = id;
        this.valor = valor;
        this.nacionalidad = nacionalidad;
        this.eliminado = eliminado;
        this.cid = cid;
        this.codigo = codigo;
        this.personaHists = personaHists;
        this.estados = estados;
        this.personas = personas;
        this.direccions = direccions;
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

    @Column(name = "nacionalidad", unique = true, nullable = false)

    public String getNacionalidad() {
        return this.nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        if (nacionalidad != null)
            nacionalidad = nacionalidad.trim();
        this.nacionalidad = nacionalidad;
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

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "nacion")
    public Set<PersonaHist_estadisticas> getPersonaHists() {
        return this.personaHists;
    }

    public void setPersonaHists(Set<PersonaHist_estadisticas> personaHists) {
        this.personaHists = personaHists;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "nacion")
    public Set<Estado_estadisticas> getEstados() {
        return this.estados;
    }

    public void setEstados(Set<Estado_estadisticas> estados) {
        this.estados = estados;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "nacion")
    public Set<Persona_estadisticas> getPersonas() {
        return this.personas;
    }

    public void setPersonas(Set<Persona_estadisticas> personas) {
        this.personas = personas;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "nacion")
    public Set<Direccion_estadisticas> getDireccions() {
        return this.direccions;
    }

    public void setDireccions(Set<Direccion_estadisticas> direccions) {
        this.direccions = direccions;
    }

}