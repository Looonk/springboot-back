package cu.uci.cesim.hce_back.estadisticas.model.entity.auto;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

// Generated Apr 18, 2012 10:46:48 AM by Hibernate Tools 3.4.0.CR1


/**
 * DivisionPersonal generated by hbm2java
 */
@Entity
@Table(name = "division_personal", schema = "nomencladores", uniqueConstraints = {
        @UniqueConstraint(columnNames = "codigo_sap"),
        @UniqueConstraint(columnNames = "codigo")})
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class DivisionPersonal_estadisticas implements java.io.Serializable {

    private long id;
    private Integer version;
    private String codigo;
    private String valor;
    private Boolean eliminado;
    private Long cid;
    private String codigoSap;
    private Set<SociedadInDivisionPersonal_estadisticas> sociedadInDivisionPersonals = new HashSet<SociedadInDivisionPersonal_estadisticas>(
            0);
    private Set<DivisionPersonalInSubdivision_estadisticas> divisionPersonalInSubdivisions = new HashSet<DivisionPersonalInSubdivision_estadisticas>(
            0);
    private Set<PersonaHist_estadisticas> personaHists = new HashSet<PersonaHist_estadisticas>(
            0);

    public DivisionPersonal_estadisticas() {
    }

    public DivisionPersonal_estadisticas(long id, String codigo, String valor) {
        this.id = id;
        this.codigo = codigo;
        this.valor = valor;
    }

    public DivisionPersonal_estadisticas(
            long id,
            String codigo,
            String valor,
            Boolean eliminado,
            Long cid,
            String codigoSap,
            Set<SociedadInDivisionPersonal_estadisticas> sociedadInDivisionPersonals,
            Set<DivisionPersonalInSubdivision_estadisticas> divisionPersonalInSubdivisions,
            Set<PersonaHist_estadisticas> personaHists) {
        this.id = id;
        this.codigo = codigo;
        this.valor = valor;
        this.eliminado = eliminado;
        this.cid = cid;
        this.codigoSap = codigoSap;
        this.sociedadInDivisionPersonals = sociedadInDivisionPersonals;
        this.divisionPersonalInSubdivisions = divisionPersonalInSubdivisions;
        this.personaHists = personaHists;
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

    @Column(name = "codigo_sap", unique = true)
    public String getCodigoSap() {
        return this.codigoSap;
    }

    public void setCodigoSap(String codigoSap) {
        if (codigoSap != null)
            codigoSap = codigoSap.trim();
        this.codigoSap = codigoSap;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "divisionPersonal")
    public Set<SociedadInDivisionPersonal_estadisticas> getSociedadInDivisionPersonals() {
        return this.sociedadInDivisionPersonals;
    }

    public void setSociedadInDivisionPersonals(
            Set<SociedadInDivisionPersonal_estadisticas> sociedadInDivisionPersonals) {
        this.sociedadInDivisionPersonals = sociedadInDivisionPersonals;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "divisionPersonal")
    public Set<DivisionPersonalInSubdivision_estadisticas> getDivisionPersonalInSubdivisions() {
        return this.divisionPersonalInSubdivisions;
    }

    public void setDivisionPersonalInSubdivisions(
            Set<DivisionPersonalInSubdivision_estadisticas> divisionPersonalInSubdivisions) {
        this.divisionPersonalInSubdivisions = divisionPersonalInSubdivisions;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "divisionPersonal")
    public Set<PersonaHist_estadisticas> getPersonaHists() {
        return this.personaHists;
    }

    public void setPersonaHists(Set<PersonaHist_estadisticas> personaHists) {
        this.personaHists = personaHists;
    }

}
