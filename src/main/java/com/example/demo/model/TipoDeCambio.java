package com.example.demo.model;

import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "TipoDeCambio")
@AllArgsConstructor
@Builder
@Data
@NoArgsConstructor
public class TipoDeCambio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "moneda_origen")
    private String monedaOrigen;
    @Column(name = "moneda_destino")
    private String monedaDestino;
    @Column(name = "tipo_cambio")
    private Double tipoDeCambio;
}