package cu.uci.cesim.hce_back.estadisticas.model.entity.quirofano;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import cu.uci.cesim.hce_back.estadisticas.model.entity.auto.ServicioInEntidad_estadisticas;
import cu.uci.cesim.hce_back.estadisticas.model.entity.auto.SolicitudCausas_estadisticas;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import javax.persistence.*;
import java.util.Set;

// Generated Jan 3, 2013 4:54:45 PM by Hibernate Tools 3.4.0.CR1


/**
 * ServicioQuirurgico generated by hbm2java
 */
@Entity
@Table(name = "servicio_quirurgico", schema = "publico")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class ServicioQuirurgico_estadisticas implements java.io.Serializable {

    private long id;
    private Integer version;
    private ServicioInEntidad_estadisticas servicioInEntidad;
    private Boolean especializado;
    private Boolean eliminado;
    private Long cid;
//	private Set<SolicitudCausas_estadisticas> solicitudCausases = new HashSet<SolicitudCausas_estadisticas>(
//			0);
//	private Set<DistribucionEnfermerosQuirofano> distribucionEnfermerosQuirofanos = new HashSet<DistribucionEnfermerosQuirofano_quirofano>(
//			0);
//	private Set<ProcedimientoInSolicitudIntv_es> procedimientoInSolicitudIntvs = new HashSet<ProcedimientoInSolicitudIntv_quirofano>(
//			0);

    public ServicioQuirurgico_estadisticas() {
    }

    public ServicioQuirurgico_estadisticas(
            ServicioInEntidad_estadisticas servicioInEntidad) {
        this.servicioInEntidad = servicioInEntidad;
    }

    public ServicioQuirurgico_estadisticas(
            ServicioInEntidad_estadisticas servicioInEntidad,
            Boolean especializado,
            Boolean eliminado,
            Long cid,
            Set<SolicitudCausas_estadisticas> solicitudCausases/*,
			Set<DistribucionEnfermerosQuirofano_es> distribucionEnfermerosQuirofanos,
			Set<ProcedimientoInSolicitudIntv_es> procedimientoInSolicitudIntvs*/) {
        this.servicioInEntidad = servicioInEntidad;
        this.especializado = especializado;
        this.eliminado = eliminado;
        this.cid = cid;
//		this.solicitudCausases = solicitudCausases;
//		this.distribucionEnfermerosQuirofanos = distribucionEnfermerosQuirofanos;
//		this.procedimientoInSolicitudIntvs = procedimientoInSolicitudIntvs;
    }

    @GenericGenerator(name = "generator", strategy = "foreign", parameters = @Parameter(name = "property", value = "servicioInEntidad"))
    @Id
    @GeneratedValue(generator = "generator")
    @Column(name = "id", unique = true, nullable = false)
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

    @OneToOne(fetch = FetchType.LAZY)
    @PrimaryKeyJoinColumn

    public ServicioInEntidad_estadisticas getServicioInEntidad() {
        return this.servicioInEntidad;
    }

    public void setServicioInEntidad(
            ServicioInEntidad_estadisticas servicioInEntidad) {
        this.servicioInEntidad = servicioInEntidad;
    }

    @Column(name = "especializado")
    public Boolean getEspecializado() {
        return this.especializado;
    }

    public void setEspecializado(Boolean especializado) {
        this.especializado = especializado;
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

//	@OneToMany(fetch = FetchType.LAZY, mappedBy = "servicioQuirurgico")
//	public Set<SolicitudCausas_estadisticas> getSolicitudCausases() {
//		return this.solicitudCausases;
//	}
//
//	public void setSolicitudCausases(
//			Set<SolicitudCausas_estadisticas> solicitudCausases) {
//		this.solicitudCausases = solicitudCausases;
//	}

//	@OneToMany(fetch = FetchType.LAZY, mappedBy = "servicioQuirurgico")
//	public Set<DistribucionEnfermerosQuirofano_e> getDistribucionEnfermerosQuirofanos() {
//		return this.distribucionEnfermerosQuirofanos;
//	}
//
//	public void setDistribucionEnfermerosQuirofanos(
//			Set<DistribucionEnfermerosQuirofano_quirofano> distribucionEnfermerosQuirofanos) {
//		this.distribucionEnfermerosQuirofanos = distribucionEnfermerosQuirofanos;
//	}
//
//	@OneToMany(fetch = FetchType.LAZY, mappedBy = "servicioQuirurgico")
//	public Set<ProcedimientoInSolicitudIntv_quirofano> getProcedimientoInSolicitudIntvs() {
//		return this.procedimientoInSolicitudIntvs;
//	}
//
//	public void setProcedimientoInSolicitudIntvs(
//			Set<ProcedimientoInSolicitudIntv_es> procedimientoInSolicitudIntvs) {
//		this.procedimientoInSolicitudIntvs = procedimientoInSolicitudIntvs;
//	}

}