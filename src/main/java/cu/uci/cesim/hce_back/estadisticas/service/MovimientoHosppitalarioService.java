package cu.uci.cesim.hce_back.estadisticas.service;

import cu.uci.cesim.hce_back.estadisticas.model.repository.CamasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovimientoHosppitalarioService {

    @Autowired
    private CamasRepository camasRepository;

    public int DiasCamasActualEntidad(Long idEntidad) {
        int diasCama = 0;
        diasCama = camasRepository.totalDiasCamaActualEntidad(idEntidad);

        return diasCama;
    }

    public int DiasCamasActualServicio(Long idEntidad, Long idServicio) {
        int diasCama = 0;
        diasCama = camasRepository.totalDiasCamaActualServicio(idEntidad, idServicio);

        return diasCama;
    }
}
