package cu.uci.cesim.hce_back.estadisticas.model.entity.auto;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

// Generated Sep 25, 2015 8:59:04 AM by Hibernate Tools 3.4.0.CR1

/**
 * ExamenInSubconjunto generated by hbm2java
 */
//@Entity
//@Table(name = "examen_in_subconjunto", schema = "estadisticas")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class ExamenInSubconjunto_estadisticas implements java.io.Serializable {

    private long id;
    private Integer version;
    private SubconjuntoExamen_estadisticas subconjuntoExamen;
    private ExamenLab_estadisticas examenLab;
    private Long cid;
    private Boolean eliminado;

    public ExamenInSubconjunto_estadisticas() {
    }

    public ExamenInSubconjunto_estadisticas(long id) {
        this.id = id;
    }

    public ExamenInSubconjunto_estadisticas(long id,
                                            SubconjuntoExamen_estadisticas subconjuntoExamen,
                                            ExamenLab_estadisticas examenLab, Long cid, Boolean eliminado) {
        this.id = id;
        this.subconjuntoExamen = subconjuntoExamen;
        this.examenLab = examenLab;
        this.cid = cid;
        this.eliminado = eliminado;
    }

    //@Id
    //@Column(name = "id", unique = true, nullable = false)
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    //@Version
    //@Column(name = "version")
    public Integer getVersion() {
        return this.version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    //@ManyToOne(fetch = FetchType.LAZY)
    //@JoinColumn(name = "id_subconjunto")
    public SubconjuntoExamen_estadisticas getSubconjuntoExamen() {
        return this.subconjuntoExamen;
    }

    public void setSubconjuntoExamen(
            SubconjuntoExamen_estadisticas subconjuntoExamen) {
        this.subconjuntoExamen = subconjuntoExamen;
    }

    //@ManyToOne(fetch = FetchType.LAZY)
    //@JoinColumn(name = "id_examen")
    public ExamenLab_estadisticas getExamenLab() {
        return this.examenLab;
    }

    public void setExamenLab(ExamenLab_estadisticas examenLab) {
        this.examenLab = examenLab;
    }

    //@Column(name = "cid")
    public Long getCid() {
        return this.cid;
    }

    public void setCid(Long cid) {
        this.cid = cid;
    }

    //@Column(name = "eliminado")
    public Boolean getEliminado() {
        return this.eliminado;
    }

    public void setEliminado(Boolean eliminado) {
        this.eliminado = eliminado;
    }

}
