package org.adaitw.tpfinal.model.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name="ejemplos")
public class EjemploEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_ejemplos")
    private int idEjemplos;

    @Column(name = "contenido_ejemplo")
    private String contenidoEjemplo;

    @Column(name = "descripcion_ejemplo")
    private String descripcionEjemplo;


}
