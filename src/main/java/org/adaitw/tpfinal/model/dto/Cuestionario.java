package org.adaitw.tpfinal.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.adaitw.tpfinal.model.entity.RespuestaEntity;

import java.io.Serializable;
import java.util.List;

@Data
public class Cuestionario implements Serializable {
    private String concepto;
    private List<String> preguntas;
    private List<String> respuestas;

    public Cuestionario(String concepto, String preguntas, List<RespuestaEntity> respuestas) {
    }

    public Cuestionario(String concepto, String preguntas) {
    }
}
