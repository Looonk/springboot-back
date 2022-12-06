package cu.uci.cesim.hce_back.estadisticas.model.entity.auto.configuracion;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.*;

@Entity
@Table(name = "pie_reporte", schema = "estadisticas")

@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class PieReporte_estadisticas implements java.io.Serializable {
    private long id;
    private String director;
    private String jefeEstadisticas;
    private Entidad_configuracion entidad;
    private Boolean eliminado;

    public PieReporte_estadisticas() {

    }

    public PieReporte_estadisticas(long id, String director, String jefeEstadisticas, Entidad_configuracion entidad, Boolean eliminado) {
        this.id = id;
        this.director = director;
        this.jefeEstadisticas = jefeEstadisticas;
        this.entidad = entidad;
        this.eliminado = eliminado;
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

    @Column(name = "director")
    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        if (director != null) {
            director = director.trim();
        }
        this.director = director;
    }

    @Column(name = "jefe_estadisticas")
    public String getJefeEstadisticas() {
        return jefeEstadisticas;
    }


    public void setJefeEstadisticas(String jefeEstadisticas) {
        if (jefeEstadisticas != null) {
            jefeEstadisticas = jefeEstadisticas.trim();
        }
        this.jefeEstadisticas = jefeEstadisticas;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_entidad")
    public Entidad_configuracion getEntidad() {
        return this.entidad;
    }

    public void setEntidad(Entidad_configuracion entidad) {
        this.entidad = entidad;
    }

    @Column(name = "eliminado")
    public Boolean getEliminado() {
        return this.eliminado;
    }

    public void setEliminado(Boolean eliminado) {
        this.eliminado = eliminado;
    }
}
