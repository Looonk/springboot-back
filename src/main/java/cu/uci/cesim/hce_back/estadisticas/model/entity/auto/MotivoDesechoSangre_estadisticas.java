package cu.uci.cesim.hce_back.estadisticas.model.entity.auto;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

// Generated Apr 18, 2012 10:46:48 AM by Hibernate Tools 3.4.0.CR1


/**
 * MotivoDesechoSangre generated by hbm2java
 */
@Entity
@Table(name = "motivo_desecho_sangre", schema = "nomencladores")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class MotivoDesechoSangre_estadisticas implements java.io.Serializable {

    private long id;
    private Integer version;
    private String motivo;
    private Boolean eliminado;
    private Long cid;
    private String codigo;
    private Set<DesechoSangre_estadisticas> desechoSangres = new HashSet<DesechoSangre_estadisticas>(
            0);

    public MotivoDesechoSangre_estadisticas() {
    }

    public MotivoDesechoSangre_estadisticas(long id, String motivo,
                                            String codigo) {
        this.id = id;
        this.motivo = motivo;
        this.codigo = codigo;
    }

    public MotivoDesechoSangre_estadisticas(long id, String motivo,
                                            Boolean eliminado, Long cid, String codigo,
                                            Set<DesechoSangre_estadisticas> desechoSangres) {
        this.id = id;
        this.motivo = motivo;
        this.eliminado = eliminado;
        this.cid = cid;
        this.codigo = codigo;
        this.desechoSangres = desechoSangres;
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

    @Column(name = "motivo", nullable = false, length = 30)

    @Length(max = 30)
    public String getMotivo() {
        return this.motivo;
    }

    public void setMotivo(String motivo) {
        if (motivo != null)
            motivo = motivo.trim();
        this.motivo = motivo;
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

    @Column(name = "codigo", nullable = false)

    public String getCodigo() {
        return this.codigo;
    }

    public void setCodigo(String codigo) {
        if (codigo != null)
            codigo = codigo.trim();
        this.codigo = codigo;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "motivoDesechoSangre")
    public Set<DesechoSangre_estadisticas> getDesechoSangres() {
        return this.desechoSangres;
    }

    public void setDesechoSangres(Set<DesechoSangre_estadisticas> desechoSangres) {
        this.desechoSangres = desechoSangres;
    }

}