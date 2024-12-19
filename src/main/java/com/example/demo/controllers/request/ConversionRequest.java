package com.example.demo.controllers.request;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class ConversionRequest implements Serializable {

    private Double monto;
    private String monedaOrigen;
    private String monedaDestino;
}
