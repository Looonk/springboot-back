package cu.uci.cesim.hce_back.visorhc.model.entity.auto;

// Generated May 10, 2013 1:18:35 PM by Hibernate Tools 3.4.0.CR1

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Version;

/**
 * HcTipoDocumento generated by hbm2java
 */
@Entity
@Table(name = "hc_tipo_documento", schema = "hc")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class HcTipoDocumento_visorhc implements java.io.Serializable {

    private long id;
    private Integer version;
    private String titulo;
    private String classToString;
    private String pathToFtl;
    private String codeSystem;
    private String code;
    private String templateId;
    private Long cid;
    @JsonIgnore
    private Set<HcDocumentoClinico_visorhc> hcDocumentoClinicos = new HashSet<HcDocumentoClinico_visorhc>(
            0);

    public HcTipoDocumento_visorhc() {
    }

    public HcTipoDocumento_visorhc(long id, String titulo,
                                   String classToString, String pathToFtl, String codeSystem,
                                   String code) {
        this.id = id;
        this.titulo = titulo;
        this.classToString = classToString;
        this.pathToFtl = pathToFtl;
        this.codeSystem = codeSystem;
        this.code = code;
    }

    public HcTipoDocumento_visorhc(long id, String titulo,
                                   String classToString, String pathToFtl, String codeSystem,
                                   String code, String templateId, Long cid,
                                   Set<HcDocumentoClinico_visorhc> hcDocumentoClinicos) {
        this.id = id;
        this.titulo = titulo;
        this.classToString = classToString;
        this.pathToFtl = pathToFtl;
        this.codeSystem = codeSystem;
        this.code = code;
        this.templateId = templateId;
        this.cid = cid;
        this.hcDocumentoClinicos = hcDocumentoClinicos;
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

    @Column(name = "titulo", nullable = false)
    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        if (titulo != null)
            titulo = titulo.trim();
        this.titulo = titulo;
    }

    @Column(name = "class_to_string", nullable = false)
    public String getClassToString() {
        return this.classToString;
    }

    public void setClassToString(String classToString) {
        if (classToString != null)
            classToString = classToString.trim();
        this.classToString = classToString;
    }

    @Column(name = "path_to_ftl", nullable = false)
    public String getPathToFtl() {
        return this.pathToFtl;
    }

    public void setPathToFtl(String pathToFtl) {
        if (pathToFtl != null)
            pathToFtl = pathToFtl.trim();
        this.pathToFtl = pathToFtl;
    }

    @Column(name = "code_system", nullable = false)
    public String getCodeSystem() {
        return this.codeSystem;
    }

    public void setCodeSystem(String codeSystem) {
        if (codeSystem != null)
            codeSystem = codeSystem.trim();
        this.codeSystem = codeSystem;
    }

    @Column(name = "code", nullable = false)
    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        if (code != null)
            code = code.trim();
        this.code = code;
    }

    @Column(name = "template_id")
    public String getTemplateId() {
        return this.templateId;
    }

    public void setTemplateId(String templateId) {
        if (templateId != null)
            templateId = templateId.trim();
        this.templateId = templateId;
    }

    @Column(name = "cid")
    public Long getCid() {
        return this.cid;
    }

    public void setCid(Long cid) {
        this.cid = cid;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "hcTipoDocumento")
    public Set<HcDocumentoClinico_visorhc> getHcDocumentoClinicos() {
        return this.hcDocumentoClinicos;
    }

    public void setHcDocumentoClinicos(
            Set<HcDocumentoClinico_visorhc> hcDocumentoClinicos) {
        this.hcDocumentoClinicos = hcDocumentoClinicos;
    }

}
