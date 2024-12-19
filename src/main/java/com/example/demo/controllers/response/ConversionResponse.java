package com.example.demo.controllers.response;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class ConversionResponse implements Serializable {

    private Double monto;
    private Double montoConCambio;
    private String monedaOrigen;
    private String monedaDestino;
    private Double tipoDeCambio;
}
