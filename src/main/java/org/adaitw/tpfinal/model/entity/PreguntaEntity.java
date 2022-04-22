package org.adaitw.tpfinal.model.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name="preguntas")
public class PreguntaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pregunta", nullable=false)
    private int idPregunta;

    @Column(name = "contenido_pregunta", nullable=false)
    private String contenidoPregunta;

    @OneToMany(mappedBy = "pregunta", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<RespuestaEntity> respuestas = new ArrayList<RespuestaEntity>();

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_concepto")
    private ConceptoEntity concepto;
}
