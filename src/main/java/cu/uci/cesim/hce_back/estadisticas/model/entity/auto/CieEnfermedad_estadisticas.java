package cu.uci.cesim.hce_back.estadisticas.model.entity.auto;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;

// Generated Apr 18, 2012 10:46:48 AM by Hibernate Tools 3.4.0.CR1


/**
 * CieEnfermedad generated by hbm2java
 */
@Entity
@Table(name = "cie_enfermedad", schema = "estandares", uniqueConstraints = @UniqueConstraint(columnNames = "codigo_enfermedad"))
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class CieEnfermedad_estadisticas implements java.io.Serializable {

    private long id;
    private Integer version;
    private CieSubcategoria_estadisticas cieSubcategoria;
    private String codigoEnfermedad;
    private String descripcion;
    private Boolean eliminado;
    private Long cid;

    public CieEnfermedad_estadisticas() {
    }

    public CieEnfermedad_estadisticas(long id,
                                      CieSubcategoria_estadisticas cieSubcategoria,
                                      String codigoEnfermedad, String descripcion) {
        this.id = id;
        this.cieSubcategoria = cieSubcategoria;
        this.codigoEnfermedad = codigoEnfermedad;
        this.descripcion = descripcion;
    }

    public CieEnfermedad_estadisticas(long id,
                                      CieSubcategoria_estadisticas cieSubcategoria,
                                      String codigoEnfermedad, String descripcion, Boolean eliminado,
                                      Long cid) {
        this.id = id;
        this.cieSubcategoria = cieSubcategoria;
        this.codigoEnfermedad = codigoEnfermedad;
        this.descripcion = descripcion;
        this.eliminado = eliminado;
        this.cid = cid;
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
    @JoinColumn(name = "id_subcategoria", nullable = false)

    public CieSubcategoria_estadisticas getCieSubcategoria() {
        return this.cieSubcategoria;
    }

    public void setCieSubcategoria(CieSubcategoria_estadisticas cieSubcategoria) {
        this.cieSubcategoria = cieSubcategoria;
    }

    @Column(name = "codigo_enfermedad", unique = true, nullable = false, length = 10)

    @Length(max = 10)
    public String getCodigoEnfermedad() {
        return this.codigoEnfermedad;
    }

    public void setCodigoEnfermedad(String codigoEnfermedad) {
        if (codigoEnfermedad != null)
            codigoEnfermedad = codigoEnfermedad.trim();
        this.codigoEnfermedad = codigoEnfermedad;
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

}
