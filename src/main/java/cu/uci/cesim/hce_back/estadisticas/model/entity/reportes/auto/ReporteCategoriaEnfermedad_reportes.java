package cu.uci.cesim.hce_back.estadisticas.model.entity.reportes.auto;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

// Generated 21/09/2012 09:38:30 AM by Hibernate Tools 3.4.0.CR1

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;


/**
 * ReporteCategoriaEnfermedad generated by hbm2java
 */
@SuppressWarnings("serial")
@Entity
@Table(name = "reporte_categoria_enfermedad", schema = "epidemiologia")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class ReporteCategoriaEnfermedad_reportes implements
        java.io.Serializable {

    private long id;
    private Integer version;
    private ReporteCategoriaEnfermedad_reportes reporteCategoriaEnfermedad;
    private ReporteTipoReporte_reportes reporteTipoReporte;
    private String valor;
    private String codigo;
    private boolean sinEnfermedad;
    private Integer orden;
    private Long cid;
    private Boolean eliminado;
    private String configuracion;
    private Integer etareoInf;
    private Integer etareoSup;
    private String identificador;
    private Boolean rojo;
    private Integer acumuladoPX;
    private Integer acumuladoH;
    private Integer acumuladoM;
    private Boolean h;
    private Boolean m;

    private Set<ReporteEnfermedad_reportes> reporteEnfermedads = new HashSet<ReporteEnfermedad_reportes>(
            0);
    private Set<ReporteCategoriaEnfermedad_reportes> reporteCategoriaEnfermedads = new HashSet<ReporteCategoriaEnfermedad_reportes>(
            0);

    public ReporteCategoriaEnfermedad_reportes() {
    }

    public ReporteCategoriaEnfermedad_reportes(long id, boolean sinEnfermedad) {
        this.id = id;
        this.sinEnfermedad = sinEnfermedad;
    }

    public ReporteCategoriaEnfermedad_reportes(long id,
                                               ReporteCategoriaEnfermedad_reportes reporteCategoriaEnfermedad,
                                               ReporteTipoReporte_reportes reporteTipoReporte, String valor,
                                               String codigo, boolean sinEnfermedad, Integer orden, Long cid,
                                               Boolean eliminado, String configuracion, Integer etareoInf,
                                               Integer etareoSup, String identificador, Boolean rojo,
                                               Set<ReporteEnfermedad_reportes> reporteEnfermedads,
                                               Set<ReporteCategoriaEnfermedad_reportes> reporteCategoriaEnfermedads) {
        this.id = id;
        this.reporteCategoriaEnfermedad = reporteCategoriaEnfermedad;
        this.reporteTipoReporte = reporteTipoReporte;
        this.valor = valor;
        this.codigo = codigo;
        this.sinEnfermedad = sinEnfermedad;
        this.orden = orden;
        this.cid = cid;
        this.eliminado = eliminado;
        this.configuracion = configuracion;
        this.etareoInf = etareoInf;
        this.etareoSup = etareoSup;
        this.identificador = identificador;
        this.reporteEnfermedads = reporteEnfermedads;
        this.reporteCategoriaEnfermedads = reporteCategoriaEnfermedads;
        this.rojo = rojo;
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
    @JoinColumn(name = "id_padre")
    public ReporteCategoriaEnfermedad_reportes getReporteCategoriaEnfermedad() {
        return this.reporteCategoriaEnfermedad;
    }

    public void setReporteCategoriaEnfermedad(
            ReporteCategoriaEnfermedad_reportes reporteCategoriaEnfermedad) {
        this.reporteCategoriaEnfermedad = reporteCategoriaEnfermedad;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_tipo_reporte")
    public ReporteTipoReporte_reportes getReporteTipoReporte() {
        return this.reporteTipoReporte;
    }

    public void setReporteTipoReporte(
            ReporteTipoReporte_reportes reporteTipoReporte) {
        this.reporteTipoReporte = reporteTipoReporte;
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

    @Column(name = "codigo")
    public String getCodigo() {
        return this.codigo;
    }

    public void setCodigo(String codigo) {
        if (codigo != null)
            codigo = codigo.trim();
        this.codigo = codigo;
    }

    @Column(name = "sin_enfermedad", nullable = false)

    public boolean isSinEnfermedad() {
        return this.sinEnfermedad;
    }

    public void setSinEnfermedad(boolean sinEnfermedad) {
        this.sinEnfermedad = sinEnfermedad;
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

    @Column(name = "eliminado")
    public Boolean getEliminado() {
        return this.eliminado;
    }

    public void setEliminado(Boolean eliminado) {
        this.eliminado = eliminado;
    }

    @Column(name = "configuracion")
    public String getConfiguracion() {
        return this.configuracion;
    }

    public void setConfiguracion(String configuracion) {
        if (configuracion != null)
            configuracion = configuracion.trim();
        this.configuracion = configuracion;
    }

    @Column(name = "etareo_inf")
    public Integer getEtareoInf() {
        return this.etareoInf;
    }

    public void setEtareoInf(Integer etareoInf) {
        this.etareoInf = etareoInf;
    }

    @Column(name = "etareo_sup")
    public Integer getEtareoSup() {
        return this.etareoSup;
    }

    public void setEtareoSup(Integer etareoSup) {
        this.etareoSup = etareoSup;
    }

    @Column(name = "identificador")
    public String getIdentificador() {
        return this.identificador;
    }

    public void setIdentificador(String identificador) {
        if (identificador != null)
            identificador = identificador.trim();
        this.identificador = identificador;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "reporteCategoriaEnfermedad")
    public Set<ReporteEnfermedad_reportes> getReporteEnfermedads() {
        return this.reporteEnfermedads;
    }

    public void setReporteEnfermedads(
            Set<ReporteEnfermedad_reportes> reporteEnfermedads) {
        this.reporteEnfermedads = reporteEnfermedads;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "reporteCategoriaEnfermedad")
    public Set<ReporteCategoriaEnfermedad_reportes> getReporteCategoriaEnfermedads() {
        return this.reporteCategoriaEnfermedads;
    }

    public void setReporteCategoriaEnfermedads(
            Set<ReporteCategoriaEnfermedad_reportes> reporteCategoriaEnfermedads) {
        this.reporteCategoriaEnfermedads = reporteCategoriaEnfermedads;
    }

    @Column(name = "rojo")
    public Boolean getRojo() {
        return rojo;
    }

    public void setRojo(Boolean rojo) {
        this.rojo = rojo;
    }

    @Column(name = "acumulado_p_x")
    public Integer getAcumuladoPX() {
        return acumuladoPX;
    }

    public void setAcumuladoPX(Integer acumuladoPX) {
        this.acumuladoPX = acumuladoPX;
    }

    @Column(name = "acumulado_h")
    public Integer getAcumuladoH() {
        return acumuladoH;
    }

    public void setAcumuladoH(Integer acumuladoH) {
        this.acumuladoH = acumuladoH;
    }

    @Column(name = "acumulado_m")
    public Integer getAcumuladoM() {
        return acumuladoM;
    }

    public void setAcumuladoM(Integer acumuladoM) {
        this.acumuladoM = acumuladoM;
    }

    @Column(name = "h")
    public Boolean getH() {
        return h;
    }

    public void setH(Boolean h) {
        this.h = h;
    }

    @Column(name = "m")
    public Boolean getM() {
        return m;
    }

    public void setM(Boolean m) {
        this.m = m;
    }

}
