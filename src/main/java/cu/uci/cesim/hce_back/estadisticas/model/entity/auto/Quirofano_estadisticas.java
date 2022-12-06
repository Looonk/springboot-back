package cu.uci.cesim.hce_back.estadisticas.model.entity.auto;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

// Generated Apr 18, 2012 10:46:48 AM by Hibernate Tools 3.4.0.CR1


/**
 * Quirofano generated by hbm2java
 */
@Entity
@Table(name = "quirofano", schema = "publico")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Quirofano_estadisticas implements java.io.Serializable {

    private long id;
    private Integer version;
    private String valor;
    private Boolean eliminado;
    private Long cid;
    private Long estado;
    private Long tipoQuirofano;
    private Set<SolicitudIntervencion_estadisticas> solicitudIntervencions = new HashSet<SolicitudIntervencion_estadisticas>(
            0);

    public Quirofano_estadisticas() {
    }

    public Quirofano_estadisticas(long id, String valor) {
        this.id = id;
        this.valor = valor;
    }

    public Quirofano_estadisticas(long id, String valor, Boolean eliminado,
                                  Long cid, Long estado, Long tipoQuirofano,
                                  Set<SolicitudIntervencion_estadisticas> solicitudIntervencions) {
        this.id = id;
        this.valor = valor;
        this.eliminado = eliminado;
        this.cid = cid;
        this.estado = estado;
        this.tipoQuirofano = tipoQuirofano;
        this.solicitudIntervencions = solicitudIntervencions;
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

    @Column(name = "estado")
    public Long getEstado() {
        return this.estado;
    }

    public void setEstado(Long estado) {
        this.estado = estado;
    }

    @Column(name = "tipo_quirofano")
    public Long getTipoQuirofano() {
        return this.tipoQuirofano;
    }

    public void setTipoQuirofano(Long tipoQuirofano) {
        this.tipoQuirofano = tipoQuirofano;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "quirofano")
    public Set<SolicitudIntervencion_estadisticas> getSolicitudIntervencions() {
        return this.solicitudIntervencions;
    }

    public void setSolicitudIntervencions(
            Set<SolicitudIntervencion_estadisticas> solicitudIntervencions) {
        this.solicitudIntervencions = solicitudIntervencions;
    }

}
