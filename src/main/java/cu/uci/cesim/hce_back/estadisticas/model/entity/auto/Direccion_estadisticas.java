package cu.uci.cesim.hce_back.estadisticas.model.entity.auto;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

// Generated Apr 18, 2012 10:46:48 AM by Hibernate Tools 3.4.0.CR1

/**
 * Direccion generated by hbm2java
 */
@Entity
@Table(name = "direccion", schema = "hc_local")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Direccion_estadisticas implements java.io.Serializable {

    private long id;
    private Integer version;
    private Municipio_estadisticas municipio;
    private Nacion_estadisticas nacion;
    private Localidad_estadisticas localidad;
    private Estado_estadisticas estado;
    private String localidad_1;
    private String nombreVia;
    private Long idTipoZona;
    private Long idTipoVia;
    private Long idTipoEdificacion;
    private Boolean eliminado;
    private Long cid;
    private String codigoPostal;
    private String puntoReferencia;
    private String nombreZona;
    private String nombreEdificacion;
    private String piso;
    private String numero;
    private Set<Persona_estadisticas> personasForIdLugarNacimiento = new HashSet<Persona_estadisticas>(
            0);
    private Set<CertificadoDefuncion_estadisticas> certificadoDefuncionsForIdLugarMuerte = new HashSet<CertificadoDefuncion_estadisticas>(
            0);
    private Set<Persona_estadisticas> personasForIdDireccionParticular = new HashSet<Persona_estadisticas>(
            0);
    private Set<Persona_estadisticas> personasForIdLugarResidencia = new HashSet<Persona_estadisticas>(
            0);
    private Set<CertificadoDefuncion_estadisticas> certificadoDefuncionsForIdDireccion = new HashSet<CertificadoDefuncion_estadisticas>(
            0);
    private Set<PersonaHist_estadisticas> personaHistsForIdLugarResidencia = new HashSet<PersonaHist_estadisticas>(
            0);
    private Set<PersonaHist_estadisticas> personaHistsForIdLugarNacimiento = new HashSet<PersonaHist_estadisticas>(
            0);
    private Set<PersonaHist_estadisticas> personaHistsForIdDireccionParticular = new HashSet<PersonaHist_estadisticas>(
            0);

    public Direccion_estadisticas() {
    }

    public Direccion_estadisticas(long id) {
        this.id = id;
    }

    public Direccion_estadisticas(
            long id,
            Municipio_estadisticas municipio,
            Nacion_estadisticas nacion,
            Localidad_estadisticas localidad,
            Estado_estadisticas estado,
            String localidad_1,
            String nombreVia,
            Long idTipoZona,
            Long idTipoVia,
            Long idTipoEdificacion,
            Boolean eliminado,
            Long cid,
            String codigoPostal,
            String puntoReferencia,
            String nombreZona,
            String nombreEdificacion,
            String piso,
            String numero,
            Set<Persona_estadisticas> personasForIdLugarNacimiento,
            Set<CertificadoDefuncion_estadisticas> certificadoDefuncionsForIdLugarMuerte,
            Set<Persona_estadisticas> personasForIdDireccionParticular,
            Set<Persona_estadisticas> personasForIdLugarResidencia,
            Set<CertificadoDefuncion_estadisticas> certificadoDefuncionsForIdDireccion,
            Set<PersonaHist_estadisticas> personaHistsForIdLugarResidencia,
            Set<PersonaHist_estadisticas> personaHistsForIdLugarNacimiento,
            Set<PersonaHist_estadisticas> personaHistsForIdDireccionParticular) {
        this.id = id;
        this.municipio = municipio;
        this.nacion = nacion;
        this.localidad = localidad;
        this.estado = estado;
        this.localidad_1 = localidad_1;
        this.nombreVia = nombreVia;
        this.idTipoZona = idTipoZona;
        this.idTipoVia = idTipoVia;
        this.idTipoEdificacion = idTipoEdificacion;
        this.eliminado = eliminado;
        this.cid = cid;
        this.codigoPostal = codigoPostal;
        this.puntoReferencia = puntoReferencia;
        this.nombreZona = nombreZona;
        this.nombreEdificacion = nombreEdificacion;
        this.piso = piso;
        this.numero = numero;
        this.personasForIdLugarNacimiento = personasForIdLugarNacimiento;
        this.certificadoDefuncionsForIdLugarMuerte = certificadoDefuncionsForIdLugarMuerte;
        this.personasForIdDireccionParticular = personasForIdDireccionParticular;
        this.personasForIdLugarResidencia = personasForIdLugarResidencia;
        this.certificadoDefuncionsForIdDireccion = certificadoDefuncionsForIdDireccion;
        this.personaHistsForIdLugarResidencia = personaHistsForIdLugarResidencia;
        this.personaHistsForIdLugarNacimiento = personaHistsForIdLugarNacimiento;
        this.personaHistsForIdDireccionParticular = personaHistsForIdDireccionParticular;
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
    @JoinColumn(name = "id_municipio")
    public Municipio_estadisticas getMunicipio() {
        return this.municipio;
    }

    public void setMunicipio(Municipio_estadisticas municipio) {
        this.municipio = municipio;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_nacion")
    public Nacion_estadisticas getNacion() {
        return this.nacion;
    }

    public void setNacion(Nacion_estadisticas nacion) {
        this.nacion = nacion;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_parroquia")
    public Localidad_estadisticas getLocalidad() {
        return this.localidad;
    }

    public void setLocalidad(Localidad_estadisticas localidad) {
        this.localidad = localidad;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_estado")
    public Estado_estadisticas getEstado() {
        return this.estado;
    }

    public void setEstado(Estado_estadisticas estado) {
        this.estado = estado;
    }

    @Column(name = "localidad")
    public String getLocalidad_1() {
        return this.localidad_1;
    }

    public void setLocalidad_1(String localidad_1) {
        if (localidad_1 != null)
            localidad_1 = localidad_1.trim();
        this.localidad_1 = localidad_1;
    }

    @Column(name = "nombre_via")
    public String getNombreVia() {
        return this.nombreVia;
    }

    public void setNombreVia(String nombreVia) {
        if (nombreVia != null)
            nombreVia = nombreVia.trim();
        this.nombreVia = nombreVia;
    }

    @Column(name = "id_tipo_zona")
    public Long getIdTipoZona() {
        return this.idTipoZona;
    }

    public void setIdTipoZona(Long idTipoZona) {
        this.idTipoZona = idTipoZona;
    }

    @Column(name = "id_tipo_via")
    public Long getIdTipoVia() {
        return this.idTipoVia;
    }

    public void setIdTipoVia(Long idTipoVia) {
        this.idTipoVia = idTipoVia;
    }

    @Column(name = "id_tipo_edificacion")
    public Long getIdTipoEdificacion() {
        return this.idTipoEdificacion;
    }

    public void setIdTipoEdificacion(Long idTipoEdificacion) {
        this.idTipoEdificacion = idTipoEdificacion;
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

    @Column(name = "codigo_postal")
    public String getCodigoPostal() {
        return this.codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        if (codigoPostal != null)
            codigoPostal = codigoPostal.trim();
        this.codigoPostal = codigoPostal;
    }

    @Column(name = "punto_referencia")
    public String getPuntoReferencia() {
        return this.puntoReferencia;
    }

    public void setPuntoReferencia(String puntoReferencia) {
        if (puntoReferencia != null)
            puntoReferencia = puntoReferencia.trim();
        this.puntoReferencia = puntoReferencia;
    }

    @Column(name = "nombre_zona")
    public String getNombreZona() {
        return this.nombreZona;
    }

    public void setNombreZona(String nombreZona) {
        if (nombreZona != null)
            nombreZona = nombreZona.trim();
        this.nombreZona = nombreZona;
    }

    @Column(name = "nombre_edificacion")
    public String getNombreEdificacion() {
        return this.nombreEdificacion;
    }

    public void setNombreEdificacion(String nombreEdificacion) {
        if (nombreEdificacion != null)
            nombreEdificacion = nombreEdificacion.trim();
        this.nombreEdificacion = nombreEdificacion;
    }

    @Column(name = "piso")
    public String getPiso() {
        return this.piso;
    }

    public void setPiso(String piso) {
        if (piso != null)
            piso = piso.trim();
        this.piso = piso;
    }

    @Column(name = "numero")
    public String getNumero() {
        return this.numero;
    }

    public void setNumero(String numero) {
        if (numero != null)
            numero = numero.trim();
        this.numero = numero;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "direccionByIdLugarNacimiento")
    public Set<Persona_estadisticas> getPersonasForIdLugarNacimiento() {
        return this.personasForIdLugarNacimiento;
    }

    public void setPersonasForIdLugarNacimiento(
            Set<Persona_estadisticas> personasForIdLugarNacimiento) {
        this.personasForIdLugarNacimiento = personasForIdLugarNacimiento;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "direccionByIdLugarMuerte")
    public Set<CertificadoDefuncion_estadisticas> getCertificadoDefuncionsForIdLugarMuerte() {
        return this.certificadoDefuncionsForIdLugarMuerte;
    }

    public void setCertificadoDefuncionsForIdLugarMuerte(
            Set<CertificadoDefuncion_estadisticas> certificadoDefuncionsForIdLugarMuerte) {
        this.certificadoDefuncionsForIdLugarMuerte = certificadoDefuncionsForIdLugarMuerte;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "direccionByIdDireccionParticular")
    public Set<Persona_estadisticas> getPersonasForIdDireccionParticular() {
        return this.personasForIdDireccionParticular;
    }

    public void setPersonasForIdDireccionParticular(
            Set<Persona_estadisticas> personasForIdDireccionParticular) {
        this.personasForIdDireccionParticular = personasForIdDireccionParticular;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "direccionByIdLugarResidencia")
    public Set<Persona_estadisticas> getPersonasForIdLugarResidencia() {
        return this.personasForIdLugarResidencia;
    }

    public void setPersonasForIdLugarResidencia(
            Set<Persona_estadisticas> personasForIdLugarResidencia) {
        this.personasForIdLugarResidencia = personasForIdLugarResidencia;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "direccionByIdDireccion")
    public Set<CertificadoDefuncion_estadisticas> getCertificadoDefuncionsForIdDireccion() {
        return this.certificadoDefuncionsForIdDireccion;
    }

    public void setCertificadoDefuncionsForIdDireccion(
            Set<CertificadoDefuncion_estadisticas> certificadoDefuncionsForIdDireccion) {
        this.certificadoDefuncionsForIdDireccion = certificadoDefuncionsForIdDireccion;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "direccionByIdLugarResidencia")
    public Set<PersonaHist_estadisticas> getPersonaHistsForIdLugarResidencia() {
        return this.personaHistsForIdLugarResidencia;
    }

    public void setPersonaHistsForIdLugarResidencia(
            Set<PersonaHist_estadisticas> personaHistsForIdLugarResidencia) {
        this.personaHistsForIdLugarResidencia = personaHistsForIdLugarResidencia;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "direccionByIdLugarNacimiento")
    public Set<PersonaHist_estadisticas> getPersonaHistsForIdLugarNacimiento() {
        return this.personaHistsForIdLugarNacimiento;
    }

    public void setPersonaHistsForIdLugarNacimiento(
            Set<PersonaHist_estadisticas> personaHistsForIdLugarNacimiento) {
        this.personaHistsForIdLugarNacimiento = personaHistsForIdLugarNacimiento;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "direccionByIdDireccionParticular")
    public Set<PersonaHist_estadisticas> getPersonaHistsForIdDireccionParticular() {
        return this.personaHistsForIdDireccionParticular;
    }

    public void setPersonaHistsForIdDireccionParticular(
            Set<PersonaHist_estadisticas> personaHistsForIdDireccionParticular) {
        this.personaHistsForIdDireccionParticular = personaHistsForIdDireccionParticular;
    }

}