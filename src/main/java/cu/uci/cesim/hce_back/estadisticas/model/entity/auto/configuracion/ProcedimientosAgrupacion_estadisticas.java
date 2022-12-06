package cu.uci.cesim.hce_back.estadisticas.model.entity.auto.configuracion;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.*;

/**
 * @author OSwald
 */
@Entity
@Table(name = "procedimientos_agrupacion", schema = "estadisticas")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class ProcedimientosAgrupacion_estadisticas implements java.io.Serializable {

    private Long id;
    private String codigoProcedimiento;
    private String descripcionProcedimiento;
    private AgrupacionProcedimientos_estadisticas agrupacionProcedimiento;


    public ProcedimientosAgrupacion_estadisticas() {
    }

    public ProcedimientosAgrupacion_estadisticas(Long id) {
        this.id = id;
    }


    @Id
    @Column(name = "id", unique = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "codigo_procedimiento")
    public String getCodigoProcedimiento() {
        return codigoProcedimiento;
    }

    public void setCodigoProcedimiento(String codigoProcedimiento) {
        this.codigoProcedimiento = codigoProcedimiento;
    }


    @Column(name = "descripcion_procedimiento")
    public String getDescripcionProcedimiento() {
        return descripcionProcedimiento;
    }

    public void setDescripcionProcedimiento(String descripcionProcedimiento) {
        this.descripcionProcedimiento = descripcionProcedimiento;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "agrupacion_procedimiento")
    public AgrupacionProcedimientos_estadisticas getAgrupacionProcedimiento() {
        return agrupacionProcedimiento;
    }

    public void setAgrupacionProcedimiento(
            AgrupacionProcedimientos_estadisticas agrupacionProcedimiento) {
        this.agrupacionProcedimiento = agrupacionProcedimiento;
    }
}
