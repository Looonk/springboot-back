package cu.uci.cesim.hce_back.estadisticas.model.entity.reportes.auto;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

// Generated 21/09/2012 09:38:30 AM by Hibernate Tools 3.4.0.CR1

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * ReporteCategoria generated by hbm2java
 */
@SuppressWarnings("serial")
@Entity
@Table(name = "reporte_categoria", schema = "epidemiologia")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class ReporteCategoria_reportes implements java.io.Serializable {

    private long id;
    private String valor;
    private Boolean contieneEnfermedades;
    private Boolean eliminado;
    private String codigoInicio;
    private String codigoFin;
    private Integer orden;
    private Long cid;
    private Set<ReporteDiagnostico_reportes> reporteDiagnosticos = new HashSet<ReporteDiagnostico_reportes>(
            0);

    public ReporteCategoria_reportes() {
    }

    public ReporteCategoria_reportes(long id) {
        this.id = id;
    }

    public ReporteCategoria_reportes(long id, String valor,
                                     Boolean contieneEnfermedades, Boolean eliminado,
                                     String codigoInicio, String codigoFin, Integer orden, Long cid,
                                     Set<ReporteDiagnostico_reportes> reporteDiagnosticos) {
        this.id = id;
        this.valor = valor;
        this.contieneEnfermedades = contieneEnfermedades;
        this.eliminado = eliminado;
        this.codigoInicio = codigoInicio;
        this.codigoFin = codigoFin;
        this.orden = orden;
        this.cid = cid;
        this.reporteDiagnosticos = reporteDiagnosticos;
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

    @Column(name = "valor")
    public String getValor() {
        return this.valor;
    }

    public void setValor(String valor) {
        if (valor != null)
            valor = valor.trim();
        this.valor = valor;
    }

    @Column(name = "contiene_enfermedades")
    public Boolean getContieneEnfermedades() {
        return this.contieneEnfermedades;
    }

    public void setContieneEnfermedades(Boolean contieneEnfermedades) {
        this.contieneEnfermedades = contieneEnfermedades;
    }

    @Column(name = "eliminado")
    public Boolean getEliminado() {
        return this.eliminado;
    }

    public void setEliminado(Boolean eliminado) {
        this.eliminado = eliminado;
    }

    @Column(name = "codigo_inicio")
    public String getCodigoInicio() {
        return this.codigoInicio;
    }

    public void setCodigoInicio(String codigoInicio) {
        if (codigoInicio != null)
            codigoInicio = codigoInicio.trim();
        this.codigoInicio = codigoInicio;
    }

    @Column(name = "codigo_fin")
    public String getCodigoFin() {
        return this.codigoFin;
    }

    public void setCodigoFin(String codigoFin) {
        if (codigoFin != null)
            codigoFin = codigoFin.trim();
        this.codigoFin = codigoFin;
    }

    @Column(name = "orden")
    public Integer getOrden() {
        return this.orden;
    }

    public void setOrden(Integer orden) {
        this.orden = orden;
    }

    @Column(name = "cid")
    public Long getCid() {
        return this.cid;
    }

    public void setCid(Long cid) {
        this.cid = cid;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "reporteCategoria")
    public Set<ReporteDiagnostico_reportes> getReporteDiagnosticos() {
        return this.reporteDiagnosticos;
    }

    public void setReporteDiagnosticos(
            Set<ReporteDiagnostico_reportes> reporteDiagnosticos) {
        this.reporteDiagnosticos = reporteDiagnosticos;
    }

}
