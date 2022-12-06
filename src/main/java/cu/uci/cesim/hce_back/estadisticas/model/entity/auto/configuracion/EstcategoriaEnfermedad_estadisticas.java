package cu.uci.cesim.hce_back.estadisticas.model.entity.auto.configuracion;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

// Generated Oct 26, 2017 9:28:14 AM by Hibernate Tools 3.2.4.GA

import cu.uci.cesim.hce_back.estadisticas.model.entity.auto.DiagnosticoMedico_estadisticas;

import javax.persistence.*;

/**
 * EstcategoriaEnfermedad generated by hbm2java
 */
@Entity
@Table(name = "estcategoria_enfermedad", schema = "estadisticas")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class EstcategoriaEnfermedad_estadisticas implements java.io.Serializable {

    private long id;
    private Integer version;
    private ReporteTipoReporte_estadisticas reporteTipoReporte;
    private DiagnosticoMedico_estadisticas diagnosticoMedico;
    private Integer orden;
    private String nombre;
    private Long cid;
    private Boolean eliminado;

    public EstcategoriaEnfermedad_estadisticas() {
    }

    public EstcategoriaEnfermedad_estadisticas(long id) {
        this.id = id;
    }

    public EstcategoriaEnfermedad_estadisticas(long id,
                                               ReporteTipoReporte_estadisticas reporteTipoReporte,
                                               DiagnosticoMedico_estadisticas diagnosticoMedico, Integer orden, String nombre,
                                               Long cid, Boolean eliminado) {
        this.id = id;
        this.reporteTipoReporte = reporteTipoReporte;
        this.diagnosticoMedico = diagnosticoMedico;
        this.orden = orden;
        this.nombre = nombre;
        this.cid = cid;
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

    @Version
    @Column(name = "version")
    public Integer getVersion() {
        return this.version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "tipo_reporte")
    public ReporteTipoReporte_estadisticas getReporteTipoReporte() {
        return this.reporteTipoReporte;
    }

    public void setReporteTipoReporte(ReporteTipoReporte_estadisticas reporteTipoReporte) {
        this.reporteTipoReporte = reporteTipoReporte;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "enfermedad")
    public DiagnosticoMedico_estadisticas getDiagnosticoMedico() {
        return this.diagnosticoMedico;
    }

    public void setDiagnosticoMedico(DiagnosticoMedico_estadisticas diagnosticoMedico) {
        this.diagnosticoMedico = diagnosticoMedico;
    }

    @Column(name = "orden")
    public Integer getOrden() {
        return this.orden;
    }

    public void setOrden(Integer orden) {
        this.orden = orden;
    }

    @Column(name = "nombre")
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        if (nombre != null)
            nombre = nombre.trim();
        this.nombre = nombre;
    }

    @Column(name = "cid")
    public Long getCid() {
        return this.cid;
    }

    public void setCid(Long cid) {
        this.cid = cid;
    }

    @Column(name = "eliminado")
    public Boolean getEliminado() {
        return this.eliminado;
    }

    public void setEliminado(Boolean eliminado) {
        this.eliminado = eliminado;
    }

}