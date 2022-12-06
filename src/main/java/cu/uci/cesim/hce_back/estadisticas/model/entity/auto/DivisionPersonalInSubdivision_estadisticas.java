package cu.uci.cesim.hce_back.estadisticas.model.entity.auto;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.*;

// Generated Apr 18, 2012 10:46:48 AM by Hibernate Tools 3.4.0.CR1


/**
 * DivisionPersonalInSubdivision generated by hbm2java
 */
@Entity
@Table(name = "division_personal_in_subdivision", schema = "nomencladores")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class DivisionPersonalInSubdivision_estadisticas implements
        java.io.Serializable {

    private long id;
    private DivisionPersonal_estadisticas divisionPersonal;
    private SubdivisionPersonal_estadisticas subdivisionPersonal;

    public DivisionPersonalInSubdivision_estadisticas() {
    }

    public DivisionPersonalInSubdivision_estadisticas(long id,
                                                      DivisionPersonal_estadisticas divisionPersonal,
                                                      SubdivisionPersonal_estadisticas subdivisionPersonal) {
        this.id = id;
        this.divisionPersonal = divisionPersonal;
        this.subdivisionPersonal = subdivisionPersonal;
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
    @JoinColumn(name = "id_division_personal", nullable = false)

    public DivisionPersonal_estadisticas getDivisionPersonal() {
        return this.divisionPersonal;
    }

    public void setDivisionPersonal(
            DivisionPersonal_estadisticas divisionPersonal) {
        this.divisionPersonal = divisionPersonal;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_subdivision_personal", nullable = false)

    public SubdivisionPersonal_estadisticas getSubdivisionPersonal() {
        return this.subdivisionPersonal;
    }

    public void setSubdivisionPersonal(
            SubdivisionPersonal_estadisticas subdivisionPersonal) {
        this.subdivisionPersonal = subdivisionPersonal;
    }

}