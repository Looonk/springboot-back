package cu.uci.cesim.hce_back.estadisticas.model.entity.auto;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

// Generated Apr 18, 2012 10:46:48 AM by Hibernate Tools 3.4.0.CR1


/**
 * CipProcedimiento generated by hbm2java
 */
@Entity
@Table(name = "cip_procedimiento", schema = "estandares")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class CipProcedimiento_estadisticas implements java.io.Serializable {

    private long id;
    private Integer version;
    private CipCategoria_estadisticas cipCategoria;
    private String codigo;
    private String valor;
    private Boolean eliminado;
    private Long cid;
    private Set<SolicitudIntervencion_estadisticas> solicitudIntervencions = new HashSet<SolicitudIntervencion_estadisticas>(
            0);
    private Set<SolicitudCausas_estadisticas> solicitudCausases = new HashSet<SolicitudCausas_estadisticas>(
            0);

    public CipProcedimiento_estadisticas() {
    }

    public CipProcedimiento_estadisticas(long id,
                                         CipCategoria_estadisticas cipCategoria, String codigo, String valor) {
        this.id = id;
        this.cipCategoria = cipCategoria;
        this.codigo = codigo;
        this.valor = valor;
    }

    public CipProcedimiento_estadisticas(long id,
                                         CipCategoria_estadisticas cipCategoria, String codigo,
                                         String valor, Boolean eliminado, Long cid,
                                         Set<SolicitudIntervencion_estadisticas> solicitudIntervencions,
                                         Set<SolicitudCausas_estadisticas> solicitudCausases) {
        this.id = id;
        this.cipCategoria = cipCategoria;
        this.codigo = codigo;
        this.valor = valor;
        this.eliminado = eliminado;
        this.cid = cid;
        this.solicitudIntervencions = solicitudIntervencions;
        this.solicitudCausases = solicitudCausases;
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
    @JoinColumn(name = "id_categoria", nullable = false)

    public CipCategoria_estadisticas getCipCategoria() {
        return this.cipCategoria;
    }

    public void setCipCategoria(CipCategoria_estadisticas cipCategoria) {
        this.cipCategoria = cipCategoria;
    }

    @Column(name = "codigo", nullable = false)
    public String getCodigo() {
        return this.codigo;
    }

    public void setCodigo(String codigo) {
        if (codigo != null)
            codigo = codigo.trim();
        this.codigo = codigo;
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

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "cipProcedimiento")
    public Set<SolicitudIntervencion_estadisticas> getSolicitudIntervencions() {
        return this.solicitudIntervencions;
    }

    public void setSolicitudIntervencions(
            Set<SolicitudIntervencion_estadisticas> solicitudIntervencions) {
        this.solicitudIntervencions = solicitudIntervencions;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "cipProcedimiento")
    public Set<SolicitudCausas_estadisticas> getSolicitudCausases() {
        return this.solicitudCausases;
    }

    public void setSolicitudCausases(
            Set<SolicitudCausas_estadisticas> solicitudCausases) {
        this.solicitudCausases = solicitudCausases;
    }

}
