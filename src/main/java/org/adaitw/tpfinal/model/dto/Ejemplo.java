package org.adaitw.tpfinal.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Ejemplo implements Serializable {
    private int idEjemplos;
    private String contenidoEjemplo;
    private String descripcionEjemplo;
}
