package cu.uci.cesim.hce_back.estadisticas.model.entity.auto;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

// Generated Apr 18, 2012 10:46:48 AM by Hibernate Tools 3.4.0.CR1


/**
 * BolsaSangre generated by hbm2java
 */
@Entity
@Table(name = "bolsa_sangre", schema = "publico")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class BolsaSangre_estadisticas implements java.io.Serializable {

    private long id;
    private Integer version;
    private Funcionalidad_estadisticas funcionalidad;
    private GrupoSanguineo_estadisticas grupoSanguineo;
    private String serial;
    private String segmento;
    private Date creada;
    private Date vence;
    private long idComponente;
    private boolean etiquetada;
    private boolean serologias;
    private Boolean eliminado;
    private Long cid;
    private Boolean uso;
    private Boolean serPos;
    private Integer cantidad;
    private String valoresSerologias;
    private Set<BolsaSangreInEntrega_estadisticas> bolsaSangreInEntregas = new HashSet<BolsaSangreInEntrega_estadisticas>(
            0);
    private Set<MovimientoSanguineo_estadisticas> movimientoSanguineos = new HashSet<MovimientoSanguineo_estadisticas>(
            0);

    public BolsaSangre_estadisticas() {
    }

    public BolsaSangre_estadisticas(long id, String serial, String segmento,
                                    long idComponente, boolean etiquetada, boolean serologias) {
        this.id = id;
        this.serial = serial;
        this.segmento = segmento;
        this.idComponente = idComponente;
        this.etiquetada = etiquetada;
        this.serologias = serologias;
    }

    public BolsaSangre_estadisticas(long id,
                                    Funcionalidad_estadisticas funcionalidad,
                                    GrupoSanguineo_estadisticas grupoSanguineo, String serial,
                                    String segmento, Date creada, Date vence, long idComponente,
                                    boolean etiquetada, boolean serologias, Boolean eliminado,
                                    Long cid, Boolean uso, Boolean serPos, Integer cantidad,
                                    String valoresSerologias,
                                    Set<BolsaSangreInEntrega_estadisticas> bolsaSangreInEntregas,
                                    Set<MovimientoSanguineo_estadisticas> movimientoSanguineos) {
        this.id = id;
        this.funcionalidad = funcionalidad;
        this.grupoSanguineo = grupoSanguineo;
        this.serial = serial;
        this.segmento = segmento;
        this.creada = creada;
        this.vence = vence;
        this.idComponente = idComponente;
        this.etiquetada = etiquetada;
        this.serologias = serologias;
        this.eliminado = eliminado;
        this.cid = cid;
        this.uso = uso;
        this.serPos = serPos;
        this.cantidad = cantidad;
        this.valoresSerologias = valoresSerologias;
        this.bolsaSangreInEntregas = bolsaSangreInEntregas;
        this.movimientoSanguineos = movimientoSanguineos;
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
    @JoinColumn(name = "id_entidad")
    public Funcionalidad_estadisticas getFuncionalidad() {
        return this.funcionalidad;
    }

    public void setFuncionalidad(Funcionalidad_estadisticas funcionalidad) {
        this.funcionalidad = funcionalidad;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_grupo")
    public GrupoSanguineo_estadisticas getGrupoSanguineo() {
        return this.grupoSanguineo;
    }

    public void setGrupoSanguineo(GrupoSanguineo_estadisticas grupoSanguineo) {
        this.grupoSanguineo = grupoSanguineo;
    }

    @Column(name = "serial", nullable = false, length = 15)

    @Length(max = 15)
    public String getSerial() {
        return this.serial;
    }

    public void setSerial(String serial) {
        if (serial != null)
            serial = serial.trim();
        this.serial = serial;
    }

    @Column(name = "segmento", nullable = false, length = 30)

    @Length(max = 30)
    public String getSegmento() {
        return this.segmento;
    }

    public void setSegmento(String segmento) {
        if (segmento != null)
            segmento = segmento.trim();
        this.segmento = segmento;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "creada", length = 13)
    public Date getCreada() {
        return this.creada;
    }

    public void setCreada(Date creada) {
        this.creada = creada;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "vence", length = 13)
    public Date getVence() {
        return this.vence;
    }

    public void setVence(Date vence) {
        this.vence = vence;
    }

    @Column(name = "id_componente", nullable = false)

    public long getIdComponente() {
        return this.idComponente;
    }

    public void setIdComponente(long idComponente) {
        this.idComponente = idComponente;
    }

    @Column(name = "etiquetada", nullable = false)

    public boolean isEtiquetada() {
        return this.etiquetada;
    }

    public void setEtiquetada(boolean etiquetada) {
        this.etiquetada = etiquetada;
    }

    @Column(name = "serologias", nullable = false)

    public boolean isSerologias() {
        return this.serologias;
    }

    public void setSerologias(boolean serologias) {
        this.serologias = serologias;
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

    @Column(name = "uso")
    public Boolean getUso() {
        return this.uso;
    }

    public void setUso(Boolean uso) {
        this.uso = uso;
    }

    @Column(name = "ser_pos")
    public Boolean getSerPos() {
        return this.serPos;
    }

    public void setSerPos(Boolean serPos) {
        this.serPos = serPos;
    }

    @Column(name = "cantidad")
    public Integer getCantidad() {
        return this.cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    @Column(name = "valores_serologias")
    public String getValoresSerologias() {
        return this.valoresSerologias;
    }

    public void setValoresSerologias(String valoresSerologias) {
        if (valoresSerologias != null)
            valoresSerologias = valoresSerologias.trim();
        this.valoresSerologias = valoresSerologias;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "bolsaSangre")
    public Set<BolsaSangreInEntrega_estadisticas> getBolsaSangreInEntregas() {
        return this.bolsaSangreInEntregas;
    }

    public void setBolsaSangreInEntregas(
            Set<BolsaSangreInEntrega_estadisticas> bolsaSangreInEntregas) {
        this.bolsaSangreInEntregas = bolsaSangreInEntregas;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "bolsaSangre")
    public Set<MovimientoSanguineo_estadisticas> getMovimientoSanguineos() {
        return this.movimientoSanguineos;
    }

    public void setMovimientoSanguineos(
            Set<MovimientoSanguineo_estadisticas> movimientoSanguineos) {
        this.movimientoSanguineos = movimientoSanguineos;
    }

}