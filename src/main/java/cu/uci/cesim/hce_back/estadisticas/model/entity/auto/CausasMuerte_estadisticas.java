package cu.uci.cesim.hce_back.estadisticas.model.entity.auto;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.*;

// Generated Apr 18, 2012 10:46:48 AM by Hibernate Tools 3.4.0.CR1


/**
 * CausasMuerte generated by hbm2java
 */
@Entity
@Table(name = "causas_muerte", schema = "hc_local")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class CausasMuerte_estadisticas implements java.io.Serializable {

    private long id;
    private int version;
    private CertificadoDefuncion_estadisticas certificadoDefuncion;
    private TipoCausaMuerte_estadisticas tipoCausaMuerte;
    private Cie_estadisticas cie;
    private long cid;
    private boolean eliminado;
    private Boolean reordenado;

    public CausasMuerte_estadisticas() {
    }

    public CausasMuerte_estadisticas(long id,
                                     CertificadoDefuncion_estadisticas certificadoDefuncion,
                                     TipoCausaMuerte_estadisticas tipoCausaMuerte, Cie_estadisticas cie,
                                     long cid, boolean eliminado) {
        this.id = id;
        this.certificadoDefuncion = certificadoDefuncion;
        this.tipoCausaMuerte = tipoCausaMuerte;
        this.cie = cie;
        this.cid = cid;
        this.eliminado = eliminado;
    }

    public CausasMuerte_estadisticas(long id,
                                     CertificadoDefuncion_estadisticas certificadoDefuncion,
                                     TipoCausaMuerte_estadisticas tipoCausaMuerte, Cie_estadisticas cie,
                                     long cid, boolean eliminado, Boolean reordenado) {
        this.id = id;
        this.certificadoDefuncion = certificadoDefuncion;
        this.tipoCausaMuerte = tipoCausaMuerte;
        this.cie = cie;
        this.cid = cid;
        this.eliminado = eliminado;
        this.reordenado = reordenado;
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
    @Column(name = "version", nullable = false)

    public int getVersion() {
        return this.version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_fallecimiento", nullable = false)

    public CertificadoDefuncion_estadisticas getCertificadoDefuncion() {
        return this.certificadoDefuncion;
    }

    public void setCertificadoDefuncion(
            CertificadoDefuncion_estadisticas certificadoDefuncion) {
        this.certificadoDefuncion = certificadoDefuncion;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_tipo_causa", nullable = false)

    public TipoCausaMuerte_estadisticas getTipoCausaMuerte() {
        return this.tipoCausaMuerte;
    }

    public void setTipoCausaMuerte(TipoCausaMuerte_estadisticas tipoCausaMuerte) {
        this.tipoCausaMuerte = tipoCausaMuerte;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_cie", nullable = false)

    public Cie_estadisticas getCie() {
        return this.cie;
    }

    public void setCie(Cie_estadisticas cie) {
        this.cie = cie;
    }

    @Column(name = "cid", nullable = false)

    public long getCid() {
        return this.cid;
    }

    public void setCid(long cid) {
        this.cid = cid;
    }

    @Column(name = "eliminado", nullable = false)

    public boolean isEliminado() {
        return this.eliminado;
    }

    public void setEliminado(boolean eliminado) {
        this.eliminado = eliminado;
    }

    @Column(name = "reordenado")
    public Boolean getReordenado() {
        return this.reordenado;
    }

    public void setReordenado(Boolean reordenado) {
        this.reordenado = reordenado;
    }

}