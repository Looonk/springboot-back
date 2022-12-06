package cu.uci.cesim.hce_back.estadisticas.model.entity.quirofano;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import cu.uci.cesim.hce_back.estadisticas.model.entity.auto.CipProcedimiento_estadisticas;

import javax.persistence.*;

@Entity
@Table(name = "procedimiento_in_informe_operatorio", schema = "quirofano")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class ProcedimientoInInformeOperatorio_estadisticas implements
        java.io.Serializable {

    private long id;
    private Integer version;
    private InformeOperatorio_estadisticas informeOperatorio;
    private CipProcedimiento_estadisticas procedimiento;
    private String observaciones;
    private Boolean eliminado;
    private Long cid;


    public ProcedimientoInInformeOperatorio_estadisticas(long id, Integer version,
                                                         InformeOperatorio_estadisticas informeOperatorio,
                                                         CipProcedimiento_estadisticas procedimiento, String observaciones,
                                                         Boolean eliminado, Long cid) {
        super();
        this.id = id;
        this.version = version;
        this.informeOperatorio = informeOperatorio;
        this.procedimiento = procedimiento;
        this.observaciones = observaciones;
        this.eliminado = eliminado;
        this.cid = cid;
    }

    public ProcedimientoInInformeOperatorio_estadisticas() {
    }

    public ProcedimientoInInformeOperatorio_estadisticas(long id) {
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

    @Version
    @Column(name = "version")
    public Integer getVersion() {
        return this.version;
    }

    public void setVersion(Integer version) {
        this.version = version;
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

    @Column(name = "observaciones")
    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_procedimiento")
    public CipProcedimiento_estadisticas getProcedimiento() {
        return procedimiento;
    }

    public void setProcedimiento(CipProcedimiento_estadisticas procedimiento) {
        this.procedimiento = procedimiento;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_informe_operatorio")
    public InformeOperatorio_estadisticas getInformeOperatorio() {
        return informeOperatorio;
    }

    public void setInformeOperatorio(InformeOperatorio_estadisticas informeOperatorio) {
        this.informeOperatorio = informeOperatorio;
    }


}
