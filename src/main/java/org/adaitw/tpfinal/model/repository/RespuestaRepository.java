package org.adaitw.tpfinal.model.repository;

import org.adaitw.tpfinal.model.entity.ConceptoEntity;
import org.adaitw.tpfinal.model.entity.PreguntaEntity;
import org.adaitw.tpfinal.model.entity.RespuestaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RespuestaRepository extends JpaRepository<RespuestaEntity, Long> {

  /* @Query(value = "select r.contenidoRespuesta from RespuestaEntity r join r.pregunta q join q.concepto c where c.nombreConcepto")
    String findRespuestasbyNombreConcepto(@Param("nombreConcepto") String nombreConcepto);*/

    //List<RespuestaEntity> findAllByPreguntaIdPregunta(Integer id);

}
