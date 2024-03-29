package cu.uci.cesim.hce_back.estadisticas.model.entity.auto;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.*;
import java.util.Date;

// Generated Apr 18, 2012 10:46:48 AM by Hibernate Tools 3.4.0.CR1


/**
 * TratamientoTerapeutico generated by hbm2java
 */
@Entity
@Table(name = "tratamiento_terapeutico", schema = "bancosangre")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class TratamientoTerapeutico_estadisticas implements
        java.io.Serializable {

    private long id;
    private Integer version;
    private Funcionalidad_estadisticas funcionalidadByIdEntidad;
    private Funcionalidad_estadisticas funcionalidadByIdFuncionalidad;
    private TipoTratHemoterapia_estadisticas tipoTratHemoterapia;
    private Enfermera_estadisticas enfermera;
    private HojaFrontal_estadisticas hojaFrontal;
    private String observaciones;
    private Boolean eliminado;
    private Long cid;
    private Date fecha;

    public TratamientoTerapeutico_estadisticas() {
    }

    public TratamientoTerapeutico_estadisticas(long id,
                                               Funcionalidad_estadisticas funcionalidadByIdFuncionalidad,
                                               TipoTratHemoterapia_estadisticas tipoTratHemoterapia,
                                               Enfermera_estadisticas enfermera,
                                               HojaFrontal_estadisticas hojaFrontal, String observaciones,
                                               Date fecha) {
        this.id = id;
        this.funcionalidadByIdFuncionalidad = funcionalidadByIdFuncionalidad;
        this.tipoTratHemoterapia = tipoTratHemoterapia;
        this.enfermera = enfermera;
        this.hojaFrontal = hojaFrontal;
        this.observaciones = observaciones;
        this.fecha = fecha;
    }

    public TratamientoTerapeutico_estadisticas(long id,
                                               Funcionalidad_estadisticas funcionalidadByIdEntidad,
                                               Funcionalidad_estadisticas funcionalidadByIdFuncionalidad,
                                               TipoTratHemoterapia_estadisticas tipoTratHemoterapia,
                                               Enfermera_estadisticas enfermera,
                                               HojaFrontal_estadisticas hojaFrontal, String observaciones,
                                               Boolean eliminado, Long cid, Date fecha) {
        this.id = id;
        this.funcionalidadByIdEntidad = funcionalidadByIdEntidad;
        this.funcionalidadByIdFuncionalidad = funcionalidadByIdFuncionalidad;
        this.tipoTratHemoterapia = tipoTratHemoterapia;
        this.enfermera = enfermera;
        this.hojaFrontal = hojaFrontal;
        this.observaciones = observaciones;
        this.eliminado = eliminado;
        this.cid = cid;
        this.fecha = fecha;
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
    @JoinColumn(name = "id_entidad")
    public Funcionalidad_estadisticas getFuncionalidadByIdEntidad() {
        return this.funcionalidadByIdEntidad;
    }

    public void setFuncionalidadByIdEntidad(
            Funcionalidad_estadisticas funcionalidadByIdEntidad) {
        this.funcionalidadByIdEntidad = funcionalidadByIdEntidad;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_funcionalidad", nullable = false)

    public Funcionalidad_estadisticas getFuncionalidadByIdFuncionalidad() {
        return this.funcionalidadByIdFuncionalidad;
    }

    public void setFuncionalidadByIdFuncionalidad(
            Funcionalidad_estadisticas funcionalidadByIdFuncionalidad) {
        this.funcionalidadByIdFuncionalidad = funcionalidadByIdFuncionalidad;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_tipo", nullable = false)

    public TipoTratHemoterapia_estadisticas getTipoTratHemoterapia() {
        return this.tipoTratHemoterapia;
    }

    public void setTipoTratHemoterapia(
            TipoTratHemoterapia_estadisticas tipoTratHemoterapia) {
        this.tipoTratHemoterapia = tipoTratHemoterapia;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_enfermera", nullable = false)

    public Enfermera_estadisticas getEnfermera() {
        return this.enfermera;
    }

    public void setEnfermera(Enfermera_estadisticas enfermera) {
        this.enfermera = enfermera;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_hoja_frontal", nullable = false)

    public HojaFrontal_estadisticas getHojaFrontal() {
        return this.hojaFrontal;
    }

    public void setHojaFrontal(HojaFrontal_estadisticas hojaFrontal) {
        this.hojaFrontal = hojaFrontal;
    }

    @Column(name = "observaciones", nullable = false)

    public String getObservaciones() {
        return this.observaciones;
    }

    public void setObservaciones(String observaciones) {
        if (observaciones != null)
            observaciones = observaciones.trim();
        this.observaciones = observaciones;
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

    @Temporal(TemporalType.DATE)
    @Column(name = "fecha", nullable = false, length = 13)

    public Date getFecha() {
        return this.fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

}
