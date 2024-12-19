package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TipoCambioDto {

    private String monedaOrigen;
    private String monedaDestino;
    private Double tipoCambio;
}
