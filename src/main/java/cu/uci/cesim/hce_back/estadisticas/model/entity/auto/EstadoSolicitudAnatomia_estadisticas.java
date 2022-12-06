package cu.uci.cesim.hce_back.estadisticas.model.entity.auto;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

// Generated Apr 18, 2012 10:46:48 AM by Hibernate Tools 3.4.0.CR1


/**
 * EstadoSolicitudAnatomia generated by hbm2java
 */
@Entity
@Table(name = "estado_solicitud_anatomia", schema = "nomencladores", uniqueConstraints = @UniqueConstraint(columnNames = "codigo"))
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class EstadoSolicitudAnatomia_estadisticas implements
        java.io.Serializable {

    private long id;
    private Integer version;
    private String valor;
    private Boolean eliminado;
    private Long cid;
    private String codigo;
    private Set<SolicitudCitologiaGinecologica_estadisticas> solicitudCitologiaGinecologicas = new HashSet<SolicitudCitologiaGinecologica_estadisticas>(
            0);
    private Set<SolicitudCitologia_estadisticas> solicitudCitologias = new HashSet<SolicitudCitologia_estadisticas>(
            0);
    private Set<SolicitudBiopsia_estadisticas> solicitudBiopsias = new HashSet<SolicitudBiopsia_estadisticas>(
            0);
    private Set<SolicitudAutopsia_estadisticas> solicitudAutopsias = new HashSet<SolicitudAutopsia_estadisticas>(
            0);

    public EstadoSolicitudAnatomia_estadisticas() {
    }

    public EstadoSolicitudAnatomia_estadisticas(long id, String valor,
                                                String codigo) {
        this.id = id;
        this.valor = valor;
        this.codigo = codigo;
    }

    public EstadoSolicitudAnatomia_estadisticas(
            long id,
            String valor,
            Boolean eliminado,
            Long cid,
            String codigo,
            Set<SolicitudCitologiaGinecologica_estadisticas> solicitudCitologiaGinecologicas,
            Set<SolicitudCitologia_estadisticas> solicitudCitologias,
            Set<SolicitudBiopsia_estadisticas> solicitudBiopsias,
            Set<SolicitudAutopsia_estadisticas> solicitudAutopsias) {
        this.id = id;
        this.valor = valor;
        this.eliminado = eliminado;
        this.cid = cid;
        this.codigo = codigo;
        this.solicitudCitologiaGinecologicas = solicitudCitologiaGinecologicas;
        this.solicitudCitologias = solicitudCitologias;
        this.solicitudBiopsias = solicitudBiopsias;
        this.solicitudAutopsias = solicitudAutopsias;
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

    @Column(name = "valor", nullable = false)

    public String getValor() {
        return this.valor;
    }

    public void setValor(String valor) {
        if (valor != null)
            valor = valor.trim();
        this.valor = valor;
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

    @Column(name = "codigo", unique = true, nullable = false, length = 5)

    @Length(max = 5)
    public String getCodigo() {
        return this.codigo;
    }

    public void setCodigo(String codigo) {
        if (codigo != null)
            codigo = codigo.trim();
        this.codigo = codigo;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "estadoSolicitudAnatomia")
    public Set<SolicitudCitologiaGinecologica_estadisticas> getSolicitudCitologiaGinecologicas() {
        return this.solicitudCitologiaGinecologicas;
    }

    public void setSolicitudCitologiaGinecologicas(
            Set<SolicitudCitologiaGinecologica_estadisticas> solicitudCitologiaGinecologicas) {
        this.solicitudCitologiaGinecologicas = solicitudCitologiaGinecologicas;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "estadoSolicitudAnatomia")
    public Set<SolicitudCitologia_estadisticas> getSolicitudCitologias() {
        return this.solicitudCitologias;
    }

    public void setSolicitudCitologias(
            Set<SolicitudCitologia_estadisticas> solicitudCitologias) {
        this.solicitudCitologias = solicitudCitologias;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "estadoSolicitudAnatomia")
    public Set<SolicitudBiopsia_estadisticas> getSolicitudBiopsias() {
        return this.solicitudBiopsias;
    }

    public void setSolicitudBiopsias(
            Set<SolicitudBiopsia_estadisticas> solicitudBiopsias) {
        this.solicitudBiopsias = solicitudBiopsias;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "estadoSolicitudAnatomia")
    public Set<SolicitudAutopsia_estadisticas> getSolicitudAutopsias() {
        return this.solicitudAutopsias;
    }

    public void setSolicitudAutopsias(
            Set<SolicitudAutopsia_estadisticas> solicitudAutopsias) {
        this.solicitudAutopsias = solicitudAutopsias;
    }

}
