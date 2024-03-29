package cu.uci.cesim.hce_back.estadisticas.model.entity.auto;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

// Generated Apr 18, 2012 10:46:48 AM by Hibernate Tools 3.4.0.CR1


/**
 * Sociedad generated by hbm2java
 */
@Entity
@Table(name = "sociedad", schema = "nomencladores", uniqueConstraints = {
        @UniqueConstraint(columnNames = "codigo"),
        @UniqueConstraint(columnNames = "codigo_sap")})
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Sociedad_estadisticas implements java.io.Serializable {

    private long id;
    private Integer version;
    private String codigo;
    private String valor;
    private Boolean eliminado;
    private Long cid;
    private String codigoSap;
    private Set<SociedadInDivisionPersonal_estadisticas> sociedadInDivisionPersonals = new HashSet<SociedadInDivisionPersonal_estadisticas>(
            0);
    private Set<PersonaHist_estadisticas> personaHists = new HashSet<PersonaHist_estadisticas>(
            0);
    private Set<SociedadInUnidadOrganizativa_estadisticas> sociedadInUnidadOrganizativas = new HashSet<SociedadInUnidadOrganizativa_estadisticas>(
            0);

    public Sociedad_estadisticas() {
    }

    public Sociedad_estadisticas(long id, String codigo, String valor,
                                 String codigoSap) {
        this.id = id;
        this.codigo = codigo;
        this.valor = valor;
        this.codigoSap = codigoSap;
    }

    public Sociedad_estadisticas(
            long id,
            String codigo,
            String valor,
            Boolean eliminado,
            Long cid,
            String codigoSap,
            Set<SociedadInDivisionPersonal_estadisticas> sociedadInDivisionPersonals,
            Set<PersonaHist_estadisticas> personaHists,
            Set<SociedadInUnidadOrganizativa_estadisticas> sociedadInUnidadOrganizativas) {
        this.id = id;
        this.codigo = codigo;
        this.valor = valor;
        this.eliminado = eliminado;
        this.cid = cid;
        this.codigoSap = codigoSap;
        this.sociedadInDivisionPersonals = sociedadInDivisionPersonals;
        this.personaHists = personaHists;
        this.sociedadInUnidadOrganizativas = sociedadInUnidadOrganizativas;
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

    @Column(name = "codigo", unique = true, nullable = false)

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

    @Column(name = "codigo_sap", unique = true, nullable = false)

    public String getCodigoSap() {
        return this.codigoSap;
    }

    public void setCodigoSap(String codigoSap) {
        if (codigoSap != null)
            codigoSap = codigoSap.trim();
        this.codigoSap = codigoSap;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "sociedad")
    public Set<SociedadInDivisionPersonal_estadisticas> getSociedadInDivisionPersonals() {
        return this.sociedadInDivisionPersonals;
    }

    public void setSociedadInDivisionPersonals(
            Set<SociedadInDivisionPersonal_estadisticas> sociedadInDivisionPersonals) {
        this.sociedadInDivisionPersonals = sociedadInDivisionPersonals;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "sociedad")
    public Set<PersonaHist_estadisticas> getPersonaHists() {
        return this.personaHists;
    }

    public void setPersonaHists(Set<PersonaHist_estadisticas> personaHists) {
        this.personaHists = personaHists;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "sociedad")
    public Set<SociedadInUnidadOrganizativa_estadisticas> getSociedadInUnidadOrganizativas() {
        return this.sociedadInUnidadOrganizativas;
    }

    public void setSociedadInUnidadOrganizativas(
            Set<SociedadInUnidadOrganizativa_estadisticas> sociedadInUnidadOrganizativas) {
        this.sociedadInUnidadOrganizativas = sociedadInUnidadOrganizativas;
    }

}
