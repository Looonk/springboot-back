package cu.uci.cesim.hce_back.estadisticas.model.entity.auto.ris;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

// Generated May 21, 2012 5:42:06 PM by Hibernate Tools 3.4.0.CR1

import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;


/**
 * Solicitud generated by hbm2java
 */
@Entity
@Table(name = "solicitud", schema = "ris")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Solicitud_RIS implements java.io.Serializable {

    private int id;
    private HojaFrontal_RIS hojaFrontal;
    private Procedencia_RIS procedencia;
    private String numeroSolicitud;
    private Date fecha;
    private String nombreUsuario;
    private Long cid;
    private Set<CitaRis_RIS> citaRises = new HashSet<CitaRis_RIS>(
            0);

    public Solicitud_RIS() {
    }

    public Solicitud_RIS(int id, HojaFrontal_RIS hojaFrontal,
                         Procedencia_RIS procedencia) {
        this.id = id;
        this.hojaFrontal = hojaFrontal;
        this.procedencia = procedencia;
    }

    public Solicitud_RIS(int id, HojaFrontal_RIS hojaFrontal,
                         Procedencia_RIS procedencia, String numeroSolicitud,
                         Date fecha, String nombreUsuario, Long cid,
                         Set<CitaRis_RIS> citaRises) {
        this.id = id;
        this.hojaFrontal = hojaFrontal;
        this.procedencia = procedencia;
        this.numeroSolicitud = numeroSolicitud;
        this.fecha = fecha;
        this.nombreUsuario = nombreUsuario;
        this.cid = cid;
        this.citaRises = citaRises;
    }

    @Id
    @Column(name = "id", unique = true, nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_paciente", nullable = false)

    public HojaFrontal_RIS getHojaFrontal() {
        return this.hojaFrontal;
    }

    public void setHojaFrontal(HojaFrontal_RIS hojaFrontal) {
        this.hojaFrontal = hojaFrontal;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_procedencia", nullable = false)

    public Procedencia_RIS getProcedencia() {
        return this.procedencia;
    }

    public void setProcedencia(Procedencia_RIS procedencia) {
        this.procedencia = procedencia;
    }

    @Column(name = "numero_solicitud", length = 225)
    @Length(max = 225)
    public String getNumeroSolicitud() {
        return this.numeroSolicitud;
    }

    public void setNumeroSolicitud(String numeroSolicitud) {
        if (numeroSolicitud != null)
            numeroSolicitud = numeroSolicitud.trim();
        this.numeroSolicitud = numeroSolicitud;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "fecha", length = 13)
    public Date getFecha() {
        return this.fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Column(name = "nombre_usuario", length = 25)
    @Length(max = 25)
    public String getNombreUsuario() {
        return this.nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        if (nombreUsuario != null)
            nombreUsuario = nombreUsuario.trim();
        this.nombreUsuario = nombreUsuario;
    }

    @Column(name = "cid")
    public Long getCid() {
        return this.cid;
    }

    public void setCid(Long cid) {
        this.cid = cid;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "solicitud")
    public Set<CitaRis_RIS> getCitaRises() {
        return this.citaRises;
    }

    public void setCitaRises(Set<CitaRis_RIS> citaRises) {
        this.citaRises = citaRises;
    }

}
