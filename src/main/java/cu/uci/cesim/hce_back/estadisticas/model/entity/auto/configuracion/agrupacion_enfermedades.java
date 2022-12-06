package cu.uci.cesim.hce_back.estadisticas.model.entity.auto.configuracion;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;


@Entity
@Table(name = "agrupacion_enfermedades", schema = "estadisticas")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class agrupacion_enfermedades implements java.io.Serializable {

    private long id;
    private Integer version;
    private ReporteTipoReporte_estadisticas reporteTipoReporte;
    private String nombre;
    private Set<diagnostico_agrupacion> diagnostico_agrupacion = new HashSet<diagnostico_agrupacion>(0);


    public agrupacion_enfermedades() {

    }

    public agrupacion_enfermedades(long id) {
        this.id = id;
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


    @OneToMany(fetch = FetchType.LAZY, mappedBy = "agrupacion_enfermedad")
    public Set<diagnostico_agrupacion> getDiagnostico_agrupacion() {
        return diagnostico_agrupacion;
    }

    public void setDiagnostico_agrupacion(
            Set<diagnostico_agrupacion> diagnostico_agrupacion) {
        this.diagnostico_agrupacion = diagnostico_agrupacion;
    }


}
