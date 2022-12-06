package cu.uci.cesim.hce_back.estadisticas.model.entity.auto;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

// Generated Apr 18, 2012 10:46:48 AM by Hibernate Tools 3.4.0.CR1

/**
 * TipoHojaFrontal generated by hbm2java
 */
@Entity
@Table(name = "tipo_hoja_frontal", schema = "nomencladores")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class TipoHojaFrontal_estadisticas implements java.io.Serializable {

    private long id;
    private Integer version;
    private String valor;
    private Boolean eliminado;
    private Long cid;
    private String codigo;
    private Set<HojaFrontal_estadisticas> hojaFrontals = new HashSet<HojaFrontal_estadisticas>(
            0);
    private Set<PersonaHist_estadisticas> personaHists = new HashSet<PersonaHist_estadisticas>(
            0);

    public TipoHojaFrontal_estadisticas() {
    }

    public TipoHojaFrontal_estadisticas(long id) {
        this.id = id;
    }

    public TipoHojaFrontal_estadisticas(long id, String valor,
                                        Boolean eliminado, Long cid, String codigo,
                                        Set<HojaFrontal_estadisticas> hojaFrontals,
                                        Set<PersonaHist_estadisticas> personaHists) {
        this.id = id;
        this.valor = valor;
        this.eliminado = eliminado;
        this.cid = cid;
        this.codigo = codigo;
        this.hojaFrontals = hojaFrontals;
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

    @Column(name = "valor", length = 30)
    @Length(max = 30)
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

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "tipoHojaFrontal")
    public Set<HojaFrontal_estadisticas> getHojaFrontals() {
        return this.hojaFrontals;
    }

    public void setHojaFrontals(Set<HojaFrontal_estadisticas> hojaFrontals) {
        this.hojaFrontals = hojaFrontals;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "tipoHojaFrontal")
    public Set<PersonaHist_estadisticas> getPersonaHists() {
        return this.personaHists;
    }

    public void setPersonaHists(Set<PersonaHist_estadisticas> personaHists) {
        this.personaHists = personaHists;
    }

}