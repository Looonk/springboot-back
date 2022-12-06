package cu.uci.cesim.hce_back.estadisticas.model.entity.auto;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.*;

// Fernan2 5/12/2016


/**
 * SignosVitalesSC Fernan2 5/12/2016
 */
@Entity
@Table(name = "bolsas_transfusion", schema = "bancosangre")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class BolsaTransfusion_estadisticas implements java.io.Serializable {

    private long id;
    private RegistroTransfusion_estadisticas registroTransfusion;
    private long id_bolsa;
    private String serial;
    private String abo;
    private Integer cant_transfundida;

    public BolsaTransfusion_estadisticas() {
    }

    public BolsaTransfusion_estadisticas(RegistroTransfusion_estadisticas registroTransfusion, long id_bolsa, Integer cant_transfundida) {
        this.registroTransfusion = registroTransfusion;
        this.id_bolsa = id_bolsa;
        this.cant_transfundida = cant_transfundida;
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


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "registro_transfusion_id", nullable = false)

    public RegistroTransfusion_estadisticas getRegistroTransfusion() {
        return this.registroTransfusion;
    }

    public void setRegistroTransfusion(RegistroTransfusion_estadisticas registroTransfusion) {
        this.registroTransfusion = registroTransfusion;
    }


    @Column(name = "id_bolsa", nullable = false)

    public long getId_bolsa() {
        return this.id_bolsa;
    }

    public void setId_bolsa(long id_bolsa) {
        this.id_bolsa = id_bolsa;
    }

    @Column(name = "serial", nullable = false)

    public String getSerial() {
        return this.serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    @Column(name = "abo", nullable = false)

    public String getAbo() {
        return this.abo;
    }

    public void setAbo(String abo) {
        this.abo = abo;
    }

    @Column(name = "cant_transfundida", nullable = false)

    public Integer getCant_transfundida() {
        return this.cant_transfundida;
    }

    public void setCant_transfundida(Integer cant_transfundida) {
        this.cant_transfundida = cant_transfundida;
    }

}
