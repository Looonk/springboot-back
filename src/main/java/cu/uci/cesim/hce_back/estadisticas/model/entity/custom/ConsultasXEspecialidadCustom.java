package cu.uci.cesim.hce_back.estadisticas.model.entity.custom;

import cu.uci.cesim.hce_back.estadisticas.model.entity.auto.Especialidad_estadisticas;

public class ConsultasXEspecialidadCustom {

    private Especialidad_estadisticas especialidad_estadisticas;
    private int planificadas;
    private int realizadas;

    public ConsultasXEspecialidadCustom(Especialidad_estadisticas especialidad_estadisticas, int planificadas, int realizadas) {
        this.especialidad_estadisticas = especialidad_estadisticas;
        this.planificadas = planificadas;
        this.realizadas = realizadas;
    }

    public Especialidad_estadisticas getEspecialidad_estadisticas() {
        return especialidad_estadisticas;
    }

    public void setEspecialidad_estadisticas(Especialidad_estadisticas especialidad_estadisticas) {
        this.especialidad_estadisticas = especialidad_estadisticas;
    }

    public int getPlanificadas() {
        return planificadas;
    }

    public void setPlanificadas(int planificadas) {
        this.planificadas = planificadas;
    }

    public int getRealizadas() {
        return realizadas;
    }

    public void setRealizadas(int realizadas) {
        this.realizadas = realizadas;
    }
}
