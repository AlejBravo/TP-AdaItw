package org.adaitw.tpfinal.controller;

import org.adaitw.tpfinal.model.dto.Concepto;
import org.adaitw.tpfinal.model.entity.ConceptoEntity;

import java.util.List;

public interface ConceptoController {

    List<Concepto> findfindAllConceptos();

    String crearConcepto(Concepto concepto);

    String eliminarConcepto(Long id);

    String actualizarConcepto(Long id, Concepto conceptoNuevo);


}

