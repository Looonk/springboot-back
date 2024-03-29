package cu.uci.cesim.hce_back.estadisticas.model.entity.auto;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

// Generated Apr 18, 2012 10:46:48 AM by Hibernate Tools 3.4.0.CR1


/**
 * CieSubcategoria generated by hbm2java
 */
@Entity
@Table(name = "cie_subcategoria", schema = "estandares", uniqueConstraints = @UniqueConstraint(columnNames = "codigo_subcategoria"))
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class CieSubcategoria_estadisticas implements java.io.Serializable {

    private long id;
    private Integer version;
    private CieCategoria_estadisticas cieCategoria;
    private String codigoSubcategoria;
    private String descripcion;
    private String incluye;
    private String excluye;
    private String observaciones;
    private Boolean eliminado;
    private Long cid;
    private Set<CieEnfermedad_estadisticas> cieEnfermedads = new HashSet<CieEnfermedad_estadisticas>(
            0);

    public CieSubcategoria_estadisticas() {
    }

    public CieSubcategoria_estadisticas(long id,
                                        CieCategoria_estadisticas cieCategoria, String codigoSubcategoria,
                                        String descripcion) {
        this.id = id;
        this.cieCategoria = cieCategoria;
        this.codigoSubcategoria = codigoSubcategoria;
        this.descripcion = descripcion;
    }

    public CieSubcategoria_estadisticas(long id,
                                        CieCategoria_estadisticas cieCategoria, String codigoSubcategoria,
                                        String descripcion, String incluye, String excluye,
                                        String observaciones, Boolean eliminado, Long cid,
                                        Set<CieEnfermedad_estadisticas> cieEnfermedads) {
        this.id = id;
        this.cieCategoria = cieCategoria;
        this.codigoSubcategoria = codigoSubcategoria;
        this.descripcion = descripcion;
        this.incluye = incluye;
        this.excluye = excluye;
        this.observaciones = observaciones;
        this.eliminado = eliminado;
        this.cid = cid;
        this.cieEnfermedads = cieEnfermedads;
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

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_categoria", nullable = false)

    public CieCategoria_estadisticas getCieCategoria() {
        return this.cieCategoria;
    }

    public void setCieCategoria(CieCategoria_estadisticas cieCategoria) {
        this.cieCategoria = cieCategoria;
    }

    @Column(name = "codigo_subcategoria", unique = true, nullable = false, length = 10)

    @Length(max = 10)
    public String getCodigoSubcategoria() {
        return this.codigoSubcategoria;
    }

    public void setCodigoSubcategoria(String codigoSubcategoria) {
        if (codigoSubcategoria != null)
            codigoSubcategoria = codigoSubcategoria.trim();
        this.codigoSubcategoria = codigoSubcategoria;
    }

    @Column(name = "descripcion", nullable = false)

    public String getDescripcion() {
        return this.descripcion;
    }

    public void setDescripcion(String descripcion) {
        if (descripcion != null)
            descripcion = descripcion.trim();
        this.descripcion = descripcion;
    }

    @Column(name = "incluye")
    public String getIncluye() {
        return this.incluye;
    }

    public void setIncluye(String incluye) {
        if (incluye != null)
            incluye = incluye.trim();
        this.incluye = incluye;
    }

    @Column(name = "excluye")
    public String getExcluye() {
        return this.excluye;
    }

    public void setExcluye(String excluye) {
        if (excluye != null)
            excluye = excluye.trim();
        this.excluye = excluye;
    }

    @Column(name = "observaciones")
    public String getObservaciones() {
        return this.observaciones;
    }

    public void setObservaciones(String observaciones) {
        if (observaciones != null)
            observaciones = observaciones.trim();
        this.observaciones = observaciones;
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

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "cieSubcategoria")
    public Set<CieEnfermedad_estadisticas> getCieEnfermedads() {
        return this.cieEnfermedads;
    }

    public void setCieEnfermedads(Set<CieEnfermedad_estadisticas> cieEnfermedads) {
        this.cieEnfermedads = cieEnfermedads;
    }

}
