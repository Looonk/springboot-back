package cu.uci.cesim.hce_back.estadisticas.model.entity.auto.ris;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

// Generated May 21, 2012 5:42:06 PM by Hibernate Tools 3.4.0.CR1

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;


/**
 * Medico generated by hbm2java
 */
@Entity
@Table(name = "medico", schema = "comun")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Medico_RIS implements java.io.Serializable {

    private long id;
    private Integer version;
    private Usuario_RIS usuario;
    private String matriculaMinisterio;
    private Boolean eliminado;
    private Long cid;
    private String matriculaColegioMedico;
    private Date fechaGraduacion;
    private Set<CitaRis_RIS> citaRises = new HashSet<CitaRis_RIS>(
            0);

    public Medico_RIS() {
    }

    public Medico_RIS(Usuario_RIS usuario) {
        this.usuario = usuario;
    }

    public Medico_RIS(Usuario_RIS usuario,
                      String matriculaMinisterio, Boolean eliminado, Long cid,
                      String matriculaColegioMedico, Date fechaGraduacion,
                      Set<CitaRis_RIS> citaRises) {
        this.usuario = usuario;
        this.matriculaMinisterio = matriculaMinisterio;
        this.eliminado = eliminado;
        this.cid = cid;
        this.matriculaColegioMedico = matriculaColegioMedico;
        this.fechaGraduacion = fechaGraduacion;
        this.citaRises = citaRises;
    }

    @GenericGenerator(name = "generator", strategy = "foreign", parameters = @Parameter(name = "property", value = "usuario"))
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

    public Usuario_RIS getUsuario() {
        return this.usuario;
    }

    public void setUsuario(Usuario_RIS usuario) {
        this.usuario = usuario;
    }

    @Column(name = "matricula_ministerio", length = 20)
    @Length(max = 20)
    public String getMatriculaMinisterio() {
        return this.matriculaMinisterio;
    }

    public void setMatriculaMinisterio(String matriculaMinisterio) {
        if (matriculaMinisterio != null)
            matriculaMinisterio = matriculaMinisterio.trim();
        this.matriculaMinisterio = matriculaMinisterio;
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

    @Column(name = "matricula_colegio_medico", length = 20)
    @Length(max = 20)
    public String getMatriculaColegioMedico() {
        return this.matriculaColegioMedico;
    }

    public void setMatriculaColegioMedico(String matriculaColegioMedico) {
        if (matriculaColegioMedico != null)
            matriculaColegioMedico = matriculaColegioMedico.trim();
        this.matriculaColegioMedico = matriculaColegioMedico;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "fecha_graduacion", length = 13)
    public Date getFechaGraduacion() {
        return this.fechaGraduacion;
    }

    public void setFechaGraduacion(Date fechaGraduacion) {
        this.fechaGraduacion = fechaGraduacion;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "medico")
    public Set<CitaRis_RIS> getCitaRises() {
        return this.citaRises;
    }

    public void setCitaRises(Set<CitaRis_RIS> citaRises) {
        this.citaRises = citaRises;
    }

}
