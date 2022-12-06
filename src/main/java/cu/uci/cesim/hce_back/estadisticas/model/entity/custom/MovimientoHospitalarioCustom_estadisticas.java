package cu.uci.cesim.hce_back.estadisticas.model.entity.custom;

import java.util.Date;

public class MovimientoHospitalarioCustom_estadisticas {

    private Long idEntidad;
    private String nombreEntidad;
    private Long idServicio;
    private String nombreServicio;
    private Date fecha;
    private int diasCama;

    public Long getIdEntidad() {
        return idEntidad;
    }

    public void setIdEntidad(Long idEntidad) {
        this.idEntidad = idEntidad;
    }

    public String getNombreEntidad() {
        return nombreEntidad;
    }

    public void setNombreEntidad(String nombreEntidad) {
        this.nombreEntidad = nombreEntidad;
    }

    public Long getIdServicio() {
        return idServicio;
    }

    public void setIdServicio(Long idServicio) {
        this.idServicio = idServicio;
    }

    public String getNombreServicio() {
        return nombreServicio;
    }

    public void setNombreServicio(String nombreServicio) {
        this.nombreServicio = nombreServicio;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getDiasCama() {
        return diasCama;
    }

    public void setDiasCama(int diasCama) {
        this.diasCama = diasCama;
    }
}
