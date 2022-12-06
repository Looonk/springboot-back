package cu.uci.cesim.hce_back.estadisticas.model.entity.auto;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

// Generated Apr 18, 2012 10:46:48 AM by Hibernate Tools 3.4.0.CR1


/**
 * CieGrupo generated by hbm2java
 */
@Entity
@Table(name = "cie_grupo", schema = "estandares", uniqueConstraints = {
        @UniqueConstraint(columnNames = "codigo_grupo"),
        @UniqueConstraint(columnNames = "descripcion")})
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class CieGrupo_estadisticas implements java.io.Serializable {

    private long id;
    private Integer version;
    private CieCapitulo_estadisticas cieCapitulo;
    private String codigoGrupo;
    private String descripcion;
    private String incluye;
    private String excluye;
    private String observaciones;
    private Boolean eliminado;
    private Long cid;
    private Set<CieCategoria_estadisticas> cieCategorias = new HashSet<CieCategoria_estadisticas>(
            0);

    public CieGrupo_estadisticas() {
    }

    public CieGrupo_estadisticas(long id, CieCapitulo_estadisticas cieCapitulo,
                                 String codigoGrupo, String descripcion) {
        this.id = id;
        this.cieCapitulo = cieCapitulo;
        this.codigoGrupo = codigoGrupo;
        this.descripcion = descripcion;
    }

    public CieGrupo_estadisticas(long id, CieCapitulo_estadisticas cieCapitulo,
                                 String codigoGrupo, String descripcion, String incluye,
                                 String excluye, String observaciones, Boolean eliminado, Long cid,
                                 Set<CieCategoria_estadisticas> cieCategorias) {
        this.id = id;
        this.cieCapitulo = cieCapitulo;
        this.codigoGrupo = codigoGrupo;
        this.descripcion = descripcion;
        this.incluye = incluye;
        this.excluye = excluye;
        this.observaciones = observaciones;
        this.eliminado = eliminado;
        this.cid = cid;
        this.cieCategorias = cieCategorias;
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
    @JoinColumn(name = "id_capitulo", nullable = false)

    public CieCapitulo_estadisticas getCieCapitulo() {
        return this.cieCapitulo;
    }

    public void setCieCapitulo(CieCapitulo_estadisticas cieCapitulo) {
        this.cieCapitulo = cieCapitulo;
    }

    @Column(name = "codigo_grupo", unique = true, nullable = false, length = 10)

    @Length(max = 10)
    public String getCodigoGrupo() {
        return this.codigoGrupo;
    }

    public void setCodigoGrupo(String codigoGrupo) {
        if (codigoGrupo != null)
            codigoGrupo = codigoGrupo.trim();
        this.codigoGrupo = codigoGrupo;
    }

    @Column(name = "descripcion", unique = true, nullable = false)

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

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "cieGrupo")
    public Set<CieCategoria_estadisticas> getCieCategorias() {
        return this.cieCategorias;
    }

    public void setCieCategorias(Set<CieCategoria_estadisticas> cieCategorias) {
        this.cieCategorias = cieCategorias;
    }

}
