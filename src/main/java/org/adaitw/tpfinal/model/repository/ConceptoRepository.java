package org.adaitw.tpfinal.model.repository;

import org.adaitw.tpfinal.model.entity.ConceptoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ConceptoRepository extends JpaRepository <ConceptoEntity, Long> {

    /*@Query(value = "select c.nombreConcepto from ConceptoEntity c where c.nombreConcepto like %:nombreConcepto")
    String findNombreConcepto(@Param("nombreConcepto") String nombreConcepto);*/

    String findAllByNombreConcepto(ConceptoEntity concepto);

    String getAllByContenidoConcepto(ConceptoEntity concepto);

}
