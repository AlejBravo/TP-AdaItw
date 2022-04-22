package org.adaitw.tpfinal.model.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name="respuestas")
public class RespuestaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_respuesta", nullable=false)
    private int idRespuesta;

    @Column(name = "contenido_respuestas", nullable=false)
    private String contenidoRespuesta;

    @Column(name = "es_correcta", nullable=false)
    private boolean verificacion;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_pregunta")
    private PreguntaEntity pregunta;

}
