package cu.uci.cesim.hce_back.estadisticas.model.entity.auto;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.*;
import java.util.Date;

// Generated Apr 18, 2012 10:46:48 AM by Hibernate Tools 3.4.0.CR1


/**
 * PersonaHist generated by hbm2java
 */
@Entity
@Table(name = "persona_hist", schema = "estadisticas")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class PersonaHist_estadisticas implements java.io.Serializable {

    private long id;
    private Integer version;
    private DivisionPersonal_estadisticas divisionPersonal;
    private FactorSanguineo_estadisticas factorSanguineo;
    private Sociedad_estadisticas sociedad;
    private Division_estadisticas division;
    private Sexo_estadisticas sexo;
    private Direccion_estadisticas direccionByIdLugarNacimiento;
    private EstadoCivil_estadisticas estadoCivil;
    private EstadoLaboral_estadisticas estadoLaboral;
    private GrupoPersonal_estadisticas grupoPersonal;
    private TipoNomina_estadisticas tipoNomina;
    private Persona_estadisticas persona;
    private Direccion_estadisticas direccionByIdLugarResidencia;
    private ManoDominante_estadisticas manoDominante;
    private TipoZonaLaboral_estadisticas tipoZonaLaboral;
    private TipoHojaFrontal_estadisticas tipoHojaFrontal;
    private Direccion_estadisticas direccionByIdDireccionParticular;
    private GrupoSanguineo_estadisticas grupoSanguineo;
    private SubdivisionPersonal_estadisticas subdivisionPersonal;
    private Formacion_estadisticas formacion;
    private Nacion_estadisticas nacion;
    private UnidadOrganizativa_estadisticas unidadOrganizativa;
    private Status_estadisticas status;
    private Posicion_estadisticas posicion;
    private Date fechaRegistro;
    private Long cid;
    private Boolean eliminado;
    private String descripcionDesconocido;
    private Date fechaHojaFrontalCreada;
    private Boolean desconocido;
    private String noHc;
    private String cedula;
    private String telefonoOficina;
    private String numeroPersonal;
    private Boolean aseguradoIvss;
    private Integer numHijos;
    private Date tiempoServicio;
    private Date fechaNacimiento;
    private Long idRaza;
    private Long idEtnia;

    public PersonaHist_estadisticas() {
    }

    public PersonaHist_estadisticas(long id) {
        this.id = id;
    }

    public PersonaHist_estadisticas(long id,
                                    DivisionPersonal_estadisticas divisionPersonal,
                                    FactorSanguineo_estadisticas factorSanguineo,
                                    Sociedad_estadisticas sociedad, Division_estadisticas division,
                                    Sexo_estadisticas sexo,
                                    Direccion_estadisticas direccionByIdLugarNacimiento,
                                    EstadoCivil_estadisticas estadoCivil,
                                    EstadoLaboral_estadisticas estadoLaboral,
                                    GrupoPersonal_estadisticas grupoPersonal,
                                    TipoNomina_estadisticas tipoNomina, Persona_estadisticas persona,
                                    Direccion_estadisticas direccionByIdLugarResidencia,
                                    ManoDominante_estadisticas manoDominante,
                                    TipoZonaLaboral_estadisticas tipoZonaLaboral,
                                    TipoHojaFrontal_estadisticas tipoHojaFrontal,
                                    Direccion_estadisticas direccionByIdDireccionParticular,
                                    GrupoSanguineo_estadisticas grupoSanguineo,
                                    SubdivisionPersonal_estadisticas subdivisionPersonal,
                                    Formacion_estadisticas formacion, Nacion_estadisticas nacion,
                                    UnidadOrganizativa_estadisticas unidadOrganizativa,
                                    Status_estadisticas status, Posicion_estadisticas posicion,
                                    Date fechaRegistro, Long cid, Boolean eliminado,
                                    String descripcionDesconocido, Date fechaHojaFrontalCreada,
                                    Boolean desconocido, String noHc, String cedula,
                                    String telefonoOficina, String numeroPersonal,
                                    Boolean aseguradoIvss, Integer numHijos, Date tiempoServicio,
                                    Date fechaNacimiento, Long idRaza, Long idEtnia) {
        this.id = id;
        this.divisionPersonal = divisionPersonal;
        this.factorSanguineo = factorSanguineo;
        this.sociedad = sociedad;
        this.division = division;
        this.sexo = sexo;
        this.direccionByIdLugarNacimiento = direccionByIdLugarNacimiento;
        this.estadoCivil = estadoCivil;
        this.estadoLaboral = estadoLaboral;
        this.grupoPersonal = grupoPersonal;
        this.tipoNomina = tipoNomina;
        this.persona = persona;
        this.direccionByIdLugarResidencia = direccionByIdLugarResidencia;
        this.manoDominante = manoDominante;
        this.tipoZonaLaboral = tipoZonaLaboral;
        this.tipoHojaFrontal = tipoHojaFrontal;
        this.direccionByIdDireccionParticular = direccionByIdDireccionParticular;
        this.grupoSanguineo = grupoSanguineo;
        this.subdivisionPersonal = subdivisionPersonal;
        this.formacion = formacion;
        this.nacion = nacion;
        this.unidadOrganizativa = unidadOrganizativa;
        this.status = status;
        this.posicion = posicion;
        this.fechaRegistro = fechaRegistro;
        this.cid = cid;
        this.eliminado = eliminado;
        this.descripcionDesconocido = descripcionDesconocido;
        this.fechaHojaFrontalCreada = fechaHojaFrontalCreada;
        this.desconocido = desconocido;
        this.noHc = noHc;
        this.cedula = cedula;
        this.telefonoOficina = telefonoOficina;
        this.numeroPersonal = numeroPersonal;
        this.aseguradoIvss = aseguradoIvss;
        this.numHijos = numHijos;
        this.tiempoServicio = tiempoServicio;
        this.fechaNacimiento = fechaNacimiento;
        this.idRaza = idRaza;
        this.idEtnia = idEtnia;
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
    @JoinColumn(name = "id_division_personal")
    public DivisionPersonal_estadisticas getDivisionPersonal() {
        return this.divisionPersonal;
    }

    public void setDivisionPersonal(
            DivisionPersonal_estadisticas divisionPersonal) {
        this.divisionPersonal = divisionPersonal;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_factor_sanguineo")
    public FactorSanguineo_estadisticas getFactorSanguineo() {
        return this.factorSanguineo;
    }

    public void setFactorSanguineo(FactorSanguineo_estadisticas factorSanguineo) {
        this.factorSanguineo = factorSanguineo;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_sociedad")
    public Sociedad_estadisticas getSociedad() {
        return this.sociedad;
    }

    public void setSociedad(Sociedad_estadisticas sociedad) {
        this.sociedad = sociedad;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_division")
    public Division_estadisticas getDivision() {
        return this.division;
    }

    public void setDivision(Division_estadisticas division) {
        this.division = division;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_sexo")
    public Sexo_estadisticas getSexo() {
        return this.sexo;
    }

    public void setSexo(Sexo_estadisticas sexo) {
        this.sexo = sexo;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_lugar_nacimiento")
    public Direccion_estadisticas getDireccionByIdLugarNacimiento() {
        return this.direccionByIdLugarNacimiento;
    }

    public void setDireccionByIdLugarNacimiento(
            Direccion_estadisticas direccionByIdLugarNacimiento) {
        this.direccionByIdLugarNacimiento = direccionByIdLugarNacimiento;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_estado_civil")
    public EstadoCivil_estadisticas getEstadoCivil() {
        return this.estadoCivil;
    }

    public void setEstadoCivil(EstadoCivil_estadisticas estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_estado_laboral")
    public EstadoLaboral_estadisticas getEstadoLaboral() {
        return this.estadoLaboral;
    }

    public void setEstadoLaboral(EstadoLaboral_estadisticas estadoLaboral) {
        this.estadoLaboral = estadoLaboral;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_grupo_personal")
    public GrupoPersonal_estadisticas getGrupoPersonal() {
        return this.grupoPersonal;
    }

    public void setGrupoPersonal(GrupoPersonal_estadisticas grupoPersonal) {
        this.grupoPersonal = grupoPersonal;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_area_personal")
    public TipoNomina_estadisticas getTipoNomina() {
        return this.tipoNomina;
    }

    public void setTipoNomina(TipoNomina_estadisticas tipoNomina) {
        this.tipoNomina = tipoNomina;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_persona")
    public Persona_estadisticas getPersona() {
        return this.persona;
    }

    public void setPersona(Persona_estadisticas persona) {
        this.persona = persona;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_lugar_residencia")
    public Direccion_estadisticas getDireccionByIdLugarResidencia() {
        return this.direccionByIdLugarResidencia;
    }

    public void setDireccionByIdLugarResidencia(
            Direccion_estadisticas direccionByIdLugarResidencia) {
        this.direccionByIdLugarResidencia = direccionByIdLugarResidencia;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_mano_dominante")
    public ManoDominante_estadisticas getManoDominante() {
        return this.manoDominante;
    }

    public void setManoDominante(ManoDominante_estadisticas manoDominante) {
        this.manoDominante = manoDominante;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_tipo_zona_laboral")
    public TipoZonaLaboral_estadisticas getTipoZonaLaboral() {
        return this.tipoZonaLaboral;
    }

    public void setTipoZonaLaboral(TipoZonaLaboral_estadisticas tipoZonaLaboral) {
        this.tipoZonaLaboral = tipoZonaLaboral;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_tipo_hoja_frontal")
    public TipoHojaFrontal_estadisticas getTipoHojaFrontal() {
        return this.tipoHojaFrontal;
    }

    public void setTipoHojaFrontal(TipoHojaFrontal_estadisticas tipoHojaFrontal) {
        this.tipoHojaFrontal = tipoHojaFrontal;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_direccion_particular")
    public Direccion_estadisticas getDireccionByIdDireccionParticular() {
        return this.direccionByIdDireccionParticular;
    }

    public void setDireccionByIdDireccionParticular(
            Direccion_estadisticas direccionByIdDireccionParticular) {
        this.direccionByIdDireccionParticular = direccionByIdDireccionParticular;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_grupo_sanguineo")
    public GrupoSanguineo_estadisticas getGrupoSanguineo() {
        return this.grupoSanguineo;
    }

    public void setGrupoSanguineo(GrupoSanguineo_estadisticas grupoSanguineo) {
        this.grupoSanguineo = grupoSanguineo;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_subdivision_personal")
    public SubdivisionPersonal_estadisticas getSubdivisionPersonal() {
        return this.subdivisionPersonal;
    }

    public void setSubdivisionPersonal(
            SubdivisionPersonal_estadisticas subdivisionPersonal) {
        this.subdivisionPersonal = subdivisionPersonal;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_formacion")
    public Formacion_estadisticas getFormacion() {
        return this.formacion;
    }

    public void setFormacion(Formacion_estadisticas formacion) {
        this.formacion = formacion;
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
    @JoinColumn(name = "id_unidad_organizativa")
    public UnidadOrganizativa_estadisticas getUnidadOrganizativa() {
        return this.unidadOrganizativa;
    }

    public void setUnidadOrganizativa(
            UnidadOrganizativa_estadisticas unidadOrganizativa) {
        this.unidadOrganizativa = unidadOrganizativa;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_status")
    public Status_estadisticas getStatus() {
        return this.status;
    }

    public void setStatus(Status_estadisticas status) {
        this.status = status;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_posicion")
    public Posicion_estadisticas getPosicion() {
        return this.posicion;
    }

    public void setPosicion(Posicion_estadisticas posicion) {
        this.posicion = posicion;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "fecha_registro", length = 29, nullable = false)

    public Date getFechaRegistro() {
        return this.fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    @Column(name = "cid")
    public Long getCid() {
        return this.cid;
    }

    public void setCid(Long cid) {
        this.cid = cid;
    }

    @Column(name = "eliminado")
    public Boolean getEliminado() {
        return this.eliminado;
    }

    public void setEliminado(Boolean eliminado) {
        this.eliminado = eliminado;
    }

    @Column(name = "descripcion_desconocido")
    public String getDescripcionDesconocido() {
        return this.descripcionDesconocido;
    }

    public void setDescripcionDesconocido(String descripcionDesconocido) {
        if (descripcionDesconocido != null)
            descripcionDesconocido = descripcionDesconocido.trim();
        this.descripcionDesconocido = descripcionDesconocido;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "fecha_hoja_frontal_creada", length = 13)
    public Date getFechaHojaFrontalCreada() {
        return this.fechaHojaFrontalCreada;
    }

    public void setFechaHojaFrontalCreada(Date fechaHojaFrontalCreada) {
        this.fechaHojaFrontalCreada = fechaHojaFrontalCreada;
    }

    @Column(name = "desconocido")
    public Boolean getDesconocido() {
        return this.desconocido;
    }

    public void setDesconocido(Boolean desconocido) {
        this.desconocido = desconocido;
    }

    @Column(name = "no_hc")
    public String getNoHc() {
        return this.noHc;
    }

    public void setNoHc(String noHc) {
        if (noHc != null)
            noHc = noHc.trim();
        this.noHc = noHc;
    }

    @Column(name = "cedula")
    public String getCedula() {
        return this.cedula;
    }

    public void setCedula(String cedula) {
        if (cedula != null)
            cedula = cedula.trim();
        this.cedula = cedula;
    }

    @Column(name = "telefono_oficina")
    public String getTelefonoOficina() {
        return this.telefonoOficina;
    }

    public void setTelefonoOficina(String telefonoOficina) {
        if (telefonoOficina != null)
            telefonoOficina = telefonoOficina.trim();
        this.telefonoOficina = telefonoOficina;
    }

    @Column(name = "numero_personal")
    public String getNumeroPersonal() {
        return this.numeroPersonal;
    }

    public void setNumeroPersonal(String numeroPersonal) {
        if (numeroPersonal != null)
            numeroPersonal = numeroPersonal.trim();
        this.numeroPersonal = numeroPersonal;
    }

    @Column(name = "asegurado_ivss")
    public Boolean getAseguradoIvss() {
        return this.aseguradoIvss;
    }

    public void setAseguradoIvss(Boolean aseguradoIvss) {
        this.aseguradoIvss = aseguradoIvss;
    }

    @Column(name = "num_hijos")
    public Integer getNumHijos() {
        return this.numHijos;
    }

    public void setNumHijos(Integer numHijos) {
        this.numHijos = numHijos;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "tiempo_servicio", length = 13)
    public Date getTiempoServicio() {
        return this.tiempoServicio;
    }

    public void setTiempoServicio(Date tiempoServicio) {
        this.tiempoServicio = tiempoServicio;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "fecha_nacimiento", length = 13)
    public Date getFechaNacimiento() {
        return this.fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Column(name = "id_raza")
    public Long getIdRaza() {
        return this.idRaza;
    }

    public void setIdRaza(Long idRaza) {
        this.idRaza = idRaza;
    }

    @Column(name = "id_etnia")
    public Long getIdEtnia() {
        return this.idEtnia;
    }

    public void setIdEtnia(Long idEtnia) {
        this.idEtnia = idEtnia;
    }

}