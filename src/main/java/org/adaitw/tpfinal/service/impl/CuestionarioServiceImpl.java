package org.adaitw.tpfinal.service.impl;

import org.adaitw.tpfinal.model.dto.Cuestionario;
import org.adaitw.tpfinal.model.entity.ConceptoEntity;
import org.adaitw.tpfinal.model.entity.PreguntaEntity;
import org.adaitw.tpfinal.model.entity.RespuestaEntity;
import org.adaitw.tpfinal.model.repository.ConceptoRepository;
import org.adaitw.tpfinal.model.repository.PreguntaRepository;
import org.adaitw.tpfinal.model.repository.RespuestaRepository;
import org.adaitw.tpfinal.service.CuestionarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CuestionarioServiceImpl implements CuestionarioService {

    @Autowired
    ConceptoRepository conceptoRepository;

    @Autowired
    PreguntaRepository preguntaRepository;

    @Autowired
    RespuestaRepository respuestaRepository;

    @Override
    public List<RespuestaEntity> obtenerRespuestas() {
        List<RespuestaEntity> respuestas = respuestaRepository.findAll();
        return respuestas;
    }

    @Override
    public List<PreguntaEntity> obtenerPreguntas() {
        List<PreguntaEntity> preguntas = preguntaRepository.findAll();
        return preguntas;
    }
    @Override
    public Cuestionario findPreguntasporConcepto(ConceptoEntity nombreConcepto) {
        String concepto = conceptoRepository.findAllByNombreConcepto(nombreConcepto);
        String preguntas = preguntaRepository.findPreguntaEntitiesByConcepto_NombreConcepto(nombreConcepto);
       // List<RespuestaEntity> respuestas = respuestaRepository.findAllByPreguntaIdPregunta();

        return new Cuestionario(concepto, preguntas);
    }
}

