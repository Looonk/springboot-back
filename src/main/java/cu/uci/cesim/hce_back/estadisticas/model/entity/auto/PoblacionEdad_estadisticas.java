package cu.uci.cesim.hce_back.estadisticas.model.entity.auto;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

// Generated Apr 18, 2012 10:46:48 AM by Hibernate Tools 3.4.0.CR1

/**
 * PoblacionEdad generated by hbm2java
 */
@Entity
@Table(name = "poblacion_edad", schema = "estadisticas")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class PoblacionEdad_estadisticas implements java.io.Serializable {

    private long id;
    private Integer version;
    private Sexo_estadisticas sexo;
    private PoblacionStatus_estadisticas poblacionStatus;
    private Boolean desglosada;
    private Long valor;
    private Boolean eliminado;
    private Long cid;
    private Integer edad;
    private Set<EdadDesglosada_estadisticas> edadDesglosadas = new HashSet<EdadDesglosada_estadisticas>(
            0);

    public PoblacionEdad_estadisticas() {
    }

    public PoblacionEdad_estadisticas(long id) {
        this.id = id;
    }

    public PoblacionEdad_estadisticas(long id, Sexo_estadisticas sexo,
                                      PoblacionStatus_estadisticas poblacionStatus, Boolean desglosada,
                                      Long valor, Boolean eliminado, Long cid, Integer edad,
                                      Set<EdadDesglosada_estadisticas> edadDesglosadas) {
        this.id = id;
        this.sexo = sexo;
        this.poblacionStatus = poblacionStatus;
        this.desglosada = desglosada;
        this.valor = valor;
        this.eliminado = eliminado;
        this.cid = cid;
        this.edad = edad;
        this.edadDesglosadas = edadDesglosadas;
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
    @JoinColumn(name = "id_sexo")
    public Sexo_estadisticas getSexo() {
        return this.sexo;
    }

    public void setSexo(Sexo_estadisticas sexo) {
        this.sexo = sexo;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_poblacion_status")
    public PoblacionStatus_estadisticas getPoblacionStatus() {
        return this.poblacionStatus;
    }

    public void setPoblacionStatus(PoblacionStatus_estadisticas poblacionStatus) {
        this.poblacionStatus = poblacionStatus;
    }

    @Column(name = "desglosada")
    public Boolean getDesglosada() {
        return this.desglosada;
    }

    public void setDesglosada(Boolean desglosada) {
        this.desglosada = desglosada;
    }

    @Column(name = "valor")
    public Long getValor() {
        return this.valor;
    }

    public void setValor(Long valor) {
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

    @Column(name = "edad")
    public Integer getEdad() {
        return this.edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "poblacionEdad")
    public Set<EdadDesglosada_estadisticas> getEdadDesglosadas() {
        return this.edadDesglosadas;
    }

    public void setEdadDesglosadas(
            Set<EdadDesglosada_estadisticas> edadDesglosadas) {
        this.edadDesglosadas = edadDesglosadas;
    }

}