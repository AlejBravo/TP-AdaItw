package org.adaitw.tpfinal.controller.impl;

import org.adaitw.tpfinal.controller.ConceptoController;
import org.adaitw.tpfinal.model.dto.Concepto;
import org.adaitw.tpfinal.model.entity.ConceptoEntity;
import org.adaitw.tpfinal.service.ConceptoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/concepto")
public class ConceptoControllerImpl implements ConceptoController {

    @Autowired
    ConceptoService conceptoService;

    @Override
    @GetMapping("/conceptos")
    public List<Concepto> findfindAllConceptos() {
        return conceptoService.findAllConceptos();
    }

    @Override
    @PostMapping("/crear")
    public String crearConcepto(@RequestBody Concepto concepto) {
        return conceptoService.crearConcepto(concepto);
    }

    @Override
    @DeleteMapping("/eliminar/{id}")
    public String eliminarConcepto(@PathVariable Long id) {
        return conceptoService.eliminarConcepto(id);
    }

    @Override
    @PostMapping ("/actualizar/{id}")
    public String actualizarConcepto(@PathVariable("id") Long id, @RequestBody Concepto conceptoNuevo) {
        return conceptoService.actualizarConcepto(conceptoNuevo);
    }
}