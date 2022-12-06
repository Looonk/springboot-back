package cu.uci.cesim.hce_back.visorhc.controller;

import cu.uci.cesim.hce_back.visorhc.model.entity.auto.HcDocumentoClinico_visorhc;
import cu.uci.cesim.hce_back.visorhc.model.entity.auto.HcPersona_visorhc;
import cu.uci.cesim.hce_back.visorhc.service.HcPersonaService;
import cu.uci.cesim.hce_back.visorhc.service.HcDocumentoClinicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ehr/search/")
public class BuscarDocumentoClinicoController {

    @Autowired
    HcPersonaService hcPersonaService;

    @Autowired
    HcDocumentoClinicoService hcDocumentoClinicoService;

    @RequestMapping("/persona/{numeroHc}")
    public List<HcPersona_visorhc> SearchPersonaNumeroHc(@PathVariable String numeroHc) {
        List<HcPersona_visorhc> personas = hcPersonaService.SearchHcPersonas(numeroHc);

        return personas;
    }

    @RequestMapping("/documentos/{idPersona}")
    public List<HcDocumentoClinico_visorhc> SearchDocumentosPersona(@PathVariable Long idPersona) {
        List<HcDocumentoClinico_visorhc> documentos = hcDocumentoClinicoService.DocumentosPersona(idPersona);

        return documentos;
    }

    @RequestMapping(value = "/documentos", method = RequestMethod.GET)
    public List<HcDocumentoClinico_visorhc> SearchDocumentosPersona(@RequestParam String numeroHc) {
        List<HcDocumentoClinico_visorhc> documentos = hcDocumentoClinicoService.DocumentosPersona(numeroHc);

        return documentos;
    }

    @RequestMapping(value = "/persona/", method = RequestMethod.GET)
    public List<HcPersona_visorhc> SearchPersona(@RequestParam(name = "nombre", required = false) String nombre, @RequestParam(name = "apellido1", required = false) String apellido1, @RequestParam(name = "apellido2", required = false) String apellido2, @RequestParam(name = "noidentidad", required = false) String noidentidad) {
        List<HcPersona_visorhc> personas = hcPersonaService.SearchHcPersonas(nombre, apellido1, apellido2, noidentidad);

        return personas;
    }
}
