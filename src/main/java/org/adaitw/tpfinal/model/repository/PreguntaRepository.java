package org.adaitw.tpfinal.model.repository;

import org.adaitw.tpfinal.model.entity.ConceptoEntity;
import org.adaitw.tpfinal.model.entity.PreguntaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PreguntaRepository extends JpaRepository<PreguntaEntity, Integer> {

   /* @Query(value= "select q.contenidoPregunta from PreguntaEntity q join q.concepto c where c.nombreConcepto like %:nombreConcepto%")
    List<String> findPreguntasByNombreConcepto(@Param("nombreConcepto") String nombreConcepto);*/

    String findPreguntaEntitiesByConcepto_NombreConcepto(ConceptoEntity concepto);
}
