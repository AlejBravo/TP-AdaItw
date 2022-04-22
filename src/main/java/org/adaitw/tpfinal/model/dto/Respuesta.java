package org.adaitw.tpfinal.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Respuesta implements Serializable {
    private int idRespuesta;
    private String contenidoRespuesta;
    private boolean verificacion;

}
