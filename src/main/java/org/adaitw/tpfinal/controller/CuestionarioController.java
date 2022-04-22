package org.adaitw.tpfinal.controller;

import org.adaitw.tpfinal.model.dto.Cuestionario;
import org.adaitw.tpfinal.model.entity.ConceptoEntity;

public interface CuestionarioController {

   Boolean validacionRespuesta(Long idRespuesta, Long idPregunta);

   Cuestionario findPreguntasporConcepto(ConceptoEntity nombreConcepto);

}
