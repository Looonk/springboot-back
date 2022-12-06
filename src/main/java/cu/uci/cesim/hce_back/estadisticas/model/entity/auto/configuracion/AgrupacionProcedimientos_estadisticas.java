package cu.uci.cesim.hce_back.estadisticas.model.entity.auto.configuracion;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * @author OSwald
 */
@Entity
@Table(name = "agrupacion_procedimientos", schema = "estadisticas")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class AgrupacionProcedimientos_estadisticas implements java.io.Serializable {

    private Long id;
    private String nombre;
    private ReporteTipoReporte_estadisticas reporteTipoReporte;
    private Boolean eliminado;
    private Set<ProcedimientosAgrupacion_estadisticas> procedimientos_agrupacion = new HashSet<ProcedimientosAgrupacion_estadisticas>();
    private Entidad_configuracion entidad;


    public AgrupacionProcedimientos_estadisticas() {

    }

    public AgrupacionProcedimientos_estadisticas(Long id) {
        this.id = id;
    }

    @Id
    @Column(name = "id", unique = true, nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "nombre")
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "tipo_reporte")
    public ReporteTipoReporte_estadisticas getReporteTipoReporte() {
        return this.reporteTipoReporte;
    }

    public void setReporteTipoReporte(
            ReporteTipoReporte_estadisticas reporteTipoReporte) {
        this.reporteTipoReporte = reporteTipoReporte;
    }

    @Column(name = "eliminado")
    public Boolean getEliminado() {
        return eliminado;
    }

    public void setEliminado(Boolean eliminado) {
        this.eliminado = eliminado;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_entidad")
    public Entidad_configuracion getEntidad() {
        return this.entidad;
    }

    public void setEntidad(Entidad_configuracion entidad) {
        this.entidad = entidad;
    }


    @OneToMany(fetch = FetchType.LAZY, mappedBy = "agrupacionProcedimiento")
    public Set<ProcedimientosAgrupacion_estadisticas> getProcedimientos_agrupacion() {
        return procedimientos_agrupacion;
    }

    public void setProcedimientos_agrupacion(
            Set<ProcedimientosAgrupacion_estadisticas> procedimientos_agrupacion) {
        this.procedimientos_agrupacion = procedimientos_agrupacion;
    }
}
