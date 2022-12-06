package cu.uci.cesim.hce_back.estadisticas.model.entity.auto.configuracion;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.*;


@Entity
@Table(name = "diagnostico_agrupacion", schema = "estadisticas")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class diagnostico_agrupacion implements java.io.Serializable {

    private long id;
    private Integer version;
    private String codigo_enfermedad;
    private String descripcion_enfermedad;
    private agrupacion_enfermedades agrupacion_enfermedad;

    @Id
    @Column(name = "id", unique = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public diagnostico_agrupacion() {

    }

    public diagnostico_agrupacion(long id) {
        this.id = id;
    }

    @Column(name = "codigo_enfermedad")
    public void setCodigo_enfermedad(String codigo_enfermedad) {
        this.codigo_enfermedad = codigo_enfermedad;
    }

    public String getCodigo_enfermedad() {
        return codigo_enfermedad;
    }

    @Column(name = "descripcion_enfermedad")
    public String getDescripcion_enfermedad() {
        return descripcion_enfermedad;
    }

    public void setDescripcion_enfermedad(String descripcion_enfermedad) {
        this.descripcion_enfermedad = descripcion_enfermedad;
    }


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "agrupacion_enfermedad")
    public agrupacion_enfermedades getAgrupacion_enfermedad() {
        return agrupacion_enfermedad;
    }


    public void setAgrupacion_enfermedad(
            agrupacion_enfermedades agrupacion_enfermedad) {
        this.agrupacion_enfermedad = agrupacion_enfermedad;
    }


}
