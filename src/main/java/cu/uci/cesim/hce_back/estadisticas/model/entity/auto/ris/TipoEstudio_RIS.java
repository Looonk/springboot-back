package cu.uci.cesim.hce_back.estadisticas.model.entity.auto.ris;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

// Generated May 21, 2012 5:42:06 PM by Hibernate Tools 3.4.0.CR1

import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;


/**
 * TipoEstudio generated by hbm2java
 */
@Entity
@Table(name = "tipo_estudio", schema = "ris")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class TipoEstudio_RIS implements java.io.Serializable {

    private long idHis;
    private Modalidad_RIS modalidad;
    private String estudio;
    private String observaciones;
    private boolean esContrastado;
    private Long cid;
    private String indicaciones;
    private String contraindicaciones;
    private Long idApplication;
    private Integer id;
    private Set<EquipoEstudioServicio_RIS> equipoEstudioServicios = new HashSet<EquipoEstudioServicio_RIS>(
            0);
    private Set<Estudio_RIS> estudios = new HashSet<Estudio_RIS>(
            0);

    public TipoEstudio_RIS() {
    }

    public TipoEstudio_RIS(long idHis, String estudio,
                           boolean esContrastado) {
        this.idHis = idHis;
        this.estudio = estudio;
        this.esContrastado = esContrastado;
    }

    public TipoEstudio_RIS(long idHis,
                           Modalidad_RIS modalidad, String estudio,
                           String observaciones, boolean esContrastado, Long cid,
                           String indicaciones, String contraindicaciones, Long idApplication,
                           Integer id,
                           Set<EquipoEstudioServicio_RIS> equipoEstudioServicios,
                           Set<Estudio_RIS> estudios) {
        this.idHis = idHis;
        this.modalidad = modalidad;
        this.estudio = estudio;
        this.observaciones = observaciones;
        this.esContrastado = esContrastado;
        this.cid = cid;
        this.indicaciones = indicaciones;
        this.contraindicaciones = contraindicaciones;
        this.idApplication = idApplication;
        this.id = id;
        this.equipoEstudioServicios = equipoEstudioServicios;
        this.estudios = estudios;
    }

    @Id
    @Column(name = "id_his", unique = true, nullable = false)

    public long getIdHis() {
        return this.idHis;
    }

    public void setIdHis(long idHis) {
        this.idHis = idHis;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_modalidad")
    public Modalidad_RIS getModalidad() {
        return this.modalidad;
    }

    public void setModalidad(Modalidad_RIS modalidad) {
        this.modalidad = modalidad;
    }

    @Column(name = "estudio", nullable = false, length = 50)

    @Length(max = 50)
    public String getEstudio() {
        return this.estudio;
    }

    public void setEstudio(String estudio) {
        if (estudio != null)
            estudio = estudio.trim();
        this.estudio = estudio;
    }

    @Column(name = "observaciones", length = 500)
    @Length(max = 500)
    public String getObservaciones() {
        return this.observaciones;
    }

    public void setObservaciones(String observaciones) {
        if (observaciones != null)
            observaciones = observaciones.trim();
        this.observaciones = observaciones;
    }

    @Column(name = "es_contrastado", nullable = false)

    public boolean isEsContrastado() {
        return this.esContrastado;
    }

    public void setEsContrastado(boolean esContrastado) {
        this.esContrastado = esContrastado;
    }

    @Column(name = "cid")
    public Long getCid() {
        return this.cid;
    }

    public void setCid(Long cid) {
        this.cid = cid;
    }

    @Column(name = "indicaciones")
    public String getIndicaciones() {
        return this.indicaciones;
    }

    public void setIndicaciones(String indicaciones) {
        if (indicaciones != null)
            indicaciones = indicaciones.trim();
        this.indicaciones = indicaciones;
    }

    @Column(name = "contraindicaciones")
    public String getContraindicaciones() {
        return this.contraindicaciones;
    }

    public void setContraindicaciones(String contraindicaciones) {
        if (contraindicaciones != null)
            contraindicaciones = contraindicaciones.trim();
        this.contraindicaciones = contraindicaciones;
    }

    @Column(name = "id_application")
    public Long getIdApplication() {
        return this.idApplication;
    }

    public void setIdApplication(Long idApplication) {
        this.idApplication = idApplication;
    }

    @Column(name = "id")
    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "tipoEstudio")
    public Set<EquipoEstudioServicio_RIS> getEquipoEstudioServicios() {
        return this.equipoEstudioServicios;
    }

    public void setEquipoEstudioServicios(
            Set<EquipoEstudioServicio_RIS> equipoEstudioServicios) {
        this.equipoEstudioServicios = equipoEstudioServicios;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "tipoEstudio")
    public Set<Estudio_RIS> getEstudios() {
        return this.estudios;
    }

    public void setEstudios(Set<Estudio_RIS> estudios) {
        this.estudios = estudios;
    }

}
