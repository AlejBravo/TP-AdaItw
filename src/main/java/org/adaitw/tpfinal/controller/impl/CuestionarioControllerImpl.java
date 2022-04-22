package org.adaitw.tpfinal.controller.impl;

import org.adaitw.tpfinal.controller.CuestionarioController;
import org.adaitw.tpfinal.model.dto.Cuestionario;
import org.adaitw.tpfinal.model.entity.ConceptoEntity;
import org.adaitw.tpfinal.service.CuestionarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cuestionario")
public class CuestionarioControllerImpl implements CuestionarioController {

    @Autowired
    CuestionarioService cuestionarioService;

    @Override
    @GetMapping("/por/concepto")
    public Boolean validacionRespuesta(Long idRespuesta, Long idPregunta) {
        return null;
    }

    @Override
    @GetMapping("/por/{nombreConcepto}")
    public Cuestionario findPreguntasporConcepto(@PathVariable(name = "nombreConcepto") ConceptoEntity nombreConcepto) {
        return cuestionarioService.findPreguntasporConcepto(nombreConcepto);
    }

}
