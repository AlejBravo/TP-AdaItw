package org.adaitw.tpfinal.service;

import org.adaitw.tpfinal.model.dto.Concepto;

import java.util.List;

public interface ConceptoService {

    List<Concepto> findAllConceptos();

    String crearConcepto(Concepto concepto);

    String eliminarConcepto(Long id);

    String actualizarConcepto(Concepto conceptoActualizado);

}
