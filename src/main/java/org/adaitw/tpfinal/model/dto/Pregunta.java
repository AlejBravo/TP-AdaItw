package org.adaitw.tpfinal.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Pregunta implements Serializable {
    private int idPregunta;
    private String contenidoPregunta;

}
