package org.adaitw.tpfinal.service;

import org.adaitw.tpfinal.model.dto.Cuestionario;
import org.adaitw.tpfinal.model.entity.ConceptoEntity;
import org.adaitw.tpfinal.model.entity.PreguntaEntity;
import org.adaitw.tpfinal.model.entity.RespuestaEntity;

import java.util.List;

public interface CuestionarioService {

    List<PreguntaEntity> obtenerPreguntas();

    List<RespuestaEntity> obtenerRespuestas();

  Cuestionario findPreguntasporConcepto(ConceptoEntity nombreConcepto);

}
