package cu.uci.cesim.hce_back.estadisticas.model.entity.auto.ris;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

// Generated May 21, 2012 5:42:06 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;


/**
 * EstadoOperacional generated by hbm2java
 */
@Entity
@Table(name = "estado_operacional", schema = "ris")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class EstadoOperacional_RIS implements java.io.Serializable {

    private long idHis;
    private String estado;
    private Long cid;
    private Long idApplication;
    private Integer id;
    private Set<Equipo_RIS> equipos = new HashSet<Equipo_RIS>(
            0);

    public EstadoOperacional_RIS() {
    }

    public EstadoOperacional_RIS(long idHis, String estado) {
        this.idHis = idHis;
        this.estado = estado;
    }

    public EstadoOperacional_RIS(long idHis, String estado, Long cid,
                                 Long idApplication, Integer id, Set<Equipo_RIS> equipos) {
        this.idHis = idHis;
        this.estado = estado;
        this.cid = cid;
        this.idApplication = idApplication;
        this.id = id;
        this.equipos = equipos;
    }

    @Id
    @Column(name = "id_his", unique = true, nullable = false)

    public long getIdHis() {
        return this.idHis;
    }

    public void setIdHis(long idHis) {
        this.idHis = idHis;
    }

    @Column(name = "estado", nullable = false)

    public String getEstado() {
        return this.estado;
    }

    public void setEstado(String estado) {
        if (estado != null)
            estado = estado.trim();
        this.estado = estado;
    }

    @Column(name = "cid")
    public Long getCid() {
        return this.cid;
    }

    public void setCid(Long cid) {
        this.cid = cid;
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

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "estadoOperacional")
    public Set<Equipo_RIS> getEquipos() {
        return this.equipos;
    }

    public void setEquipos(Set<Equipo_RIS> equipos) {
        this.equipos = equipos;
    }

}
