package org.adaitw.tpfinal.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Concepto implements Serializable {
    private Long idConcepto;
    private int idCapitulo;
    private String nombreConcepto;
    private String contenidoConcepto;
    private int numeroConcepto;

    public void setNumeroConcepto(Long numeroConcepto) {
    }
}
