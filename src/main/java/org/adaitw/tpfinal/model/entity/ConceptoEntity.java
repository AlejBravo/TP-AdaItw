package org.adaitw.tpfinal.model.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.adaitw.tpfinal.model.dto.Pregunta;

import javax.persistence.*;
import java.util.List;


@Entity
@Getter @Setter
@Table(name="conceptos")
public class ConceptoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_concepto")
    private Long idConcepto;

    @Column(name = "id_capitulo")
    private int idCapitulo;

    @Column(name = "nombre_concepto", nullable=false)
    private String nombreConcepto;

    @Column(name = "contenido_concepto", nullable=false)
    private String contenidoConcepto;

    @Column(name = "numero_concepto", nullable=false)
    private Long numeroConcepto;

    @OneToMany(mappedBy = "concepto", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<PreguntaEntity> preguntas;

}
