package cu.uci.cesim.hce_back.estadisticas.model.entity.auto;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

// Generated Jun 4, 2012 4:59:22 PM by Hibernate Tools 3.4.0.CR1


@Entity
@Table(name = "medicina_natural_tradicional", schema = "nomencladores", uniqueConstraints = @UniqueConstraint(columnNames = "valor"))
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class MedicinaNaturalTradicional_estadisticas implements java.io.Serializable {

    private long id;
    private Integer version;
    private String valor;
    private Boolean eliminado;
    private Long cid;
    private String codigo;
    private Set<IndicacionMedicaTratamiento_estadisticas> indicacionMedicaTratamientos = new HashSet<IndicacionMedicaTratamiento_estadisticas>(
            0);
    private Set<IndicacionMnt_estadisticas> indicacionMnt = new HashSet<IndicacionMnt_estadisticas>(
            0);

    public MedicinaNaturalTradicional_estadisticas() {
    }

    public MedicinaNaturalTradicional_estadisticas(long id, String valor) {
        this.id = id;
        this.valor = valor;
    }

    public MedicinaNaturalTradicional_estadisticas(long id, String valor, Boolean eliminado, Long cid,
                                                   String codigo,
                                                   Set<IndicacionMedicaTratamiento_estadisticas> indicacionMedicaTratamientos, Set<IndicacionMnt_estadisticas> indicacionMnt) {
        this.id = id;
        this.valor = valor;
        this.eliminado = eliminado;
        this.cid = cid;
        this.codigo = codigo;
        this.indicacionMedicaTratamientos = indicacionMedicaTratamientos;
        this.indicacionMnt = indicacionMnt;
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

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "viaAdministracionMedicamento")
    public Set<IndicacionMedicaTratamiento_estadisticas> getIndicacionMedicaTratamientos() {
        return this.indicacionMedicaTratamientos;
    }

    public void setIndicacionMedicaTratamientos(
            Set<IndicacionMedicaTratamiento_estadisticas> indicacionMedicaTratamientos) {
        this.indicacionMedicaTratamientos = indicacionMedicaTratamientos;
    }

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "indicacion_mnt_in_medicina_natural_tradicional", schema = "hc_local",
            joinColumns = {@JoinColumn(name = "id_medicina_natural_tradicional", nullable = false, updatable = false)},
            inverseJoinColumns = {@JoinColumn(name = "id_indicacion_mnt", nullable = false, updatable = false)})
    public Set<IndicacionMnt_estadisticas> getIndicacionMnt() {
        return this.indicacionMnt;
    }

    public void setIndicacionMnt(Set<IndicacionMnt_estadisticas> indicacionMnt) {
        this.indicacionMnt = indicacionMnt;
    }

}
