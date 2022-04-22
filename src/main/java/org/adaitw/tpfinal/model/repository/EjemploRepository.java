package org.adaitw.tpfinal.model.repository;

import org.adaitw.tpfinal.model.entity.EjemploEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EjemploRepository extends JpaRepository<EjemploEntity, Long> {
}
