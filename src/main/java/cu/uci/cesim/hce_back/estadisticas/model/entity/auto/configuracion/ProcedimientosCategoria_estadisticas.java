package cu.uci.cesim.hce_back.estadisticas.model.entity.auto.configuracion;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

// Generated Oct 26, 2017 9:28:14 AM by Hibernate Tools 3.2.4.GA

import cu.uci.cesim.hce_back.estadisticas.model.entity.auto.CipProcedimiento_estadisticas;

import javax.persistence.*;

/**
 * ProcedimientosCategoria generated by hbm2java
 */
@Entity
@Table(name = "procedimientos_categoria", schema = "estadisticas")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class ProcedimientosCategoria_estadisticas implements java.io.Serializable {

    private long id;
    private CipProcedimiento_estadisticas cipProcedimiento;
    private EstcategoriaProcedimientos_estadisticas estcategoriaProcedimientos;

    public ProcedimientosCategoria_estadisticas() {
    }

    public ProcedimientosCategoria_estadisticas(long id) {
        this.id = id;
    }

    public ProcedimientosCategoria_estadisticas(long id,
                                                CipProcedimiento_estadisticas cipProcedimiento,
                                                EstcategoriaProcedimientos_estadisticas estcategoriaProcedimientos) {
        this.id = id;
        this.cipProcedimiento = cipProcedimiento;
        this.estcategoriaProcedimientos = estcategoriaProcedimientos;
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

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "procedimiento")
    public CipProcedimiento_estadisticas getCipProcedimiento() {
        return this.cipProcedimiento;
    }

    public void setCipProcedimiento(CipProcedimiento_estadisticas cipProcedimiento) {
        this.cipProcedimiento = cipProcedimiento;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "categoria")
    public EstcategoriaProcedimientos_estadisticas getEstcategoriaProcedimientos() {
        return this.estcategoriaProcedimientos;
    }

    public void setEstcategoriaProcedimientos(
            EstcategoriaProcedimientos_estadisticas estcategoriaProcedimientos) {
        this.estcategoriaProcedimientos = estcategoriaProcedimientos;
    }

}
