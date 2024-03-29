package cu.uci.cesim.hce_back.estadisticas.model.entity.reportes.auto;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

// Generated 21/09/2012 09:38:30 AM by Hibernate Tools 3.4.0.CR1

import javax.persistence.*;

/**
 * ReporteEnfermedad generated by hbm2java
 */
@SuppressWarnings("serial")
@Entity
@Table(name = "reporte_enfermedad", schema = "epidemiologia")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class ReporteEnfermedad_reportes implements java.io.Serializable {

    private long id;
    private Integer version;
    private ReporteCategoriaEnfermedad_reportes reporteCategoriaEnfermedad;
    private String valor;
    private String codigo;
    private Long cid;
    private Boolean eliminado;

    public ReporteEnfermedad_reportes() {
    }

    public ReporteEnfermedad_reportes(long id) {
        this.id = id;
    }

    public ReporteEnfermedad_reportes(long id,
                                      ReporteCategoriaEnfermedad_reportes reporteCategoriaEnfermedad,
                                      String valor, String codigo, Long cid, Boolean eliminado) {
        this.id = id;
        this.reporteCategoriaEnfermedad = reporteCategoriaEnfermedad;
        this.valor = valor;
        this.codigo = codigo;
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
    @JoinColumn(name = "id_categoria_enfermedad")
    public ReporteCategoriaEnfermedad_reportes getReporteCategoriaEnfermedad() {
        return this.reporteCategoriaEnfermedad;
    }

    public void setReporteCategoriaEnfermedad(
            ReporteCategoriaEnfermedad_reportes reporteCategoriaEnfermedad) {
        this.reporteCategoriaEnfermedad = reporteCategoriaEnfermedad;
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
