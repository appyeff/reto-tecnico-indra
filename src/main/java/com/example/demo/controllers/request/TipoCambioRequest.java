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
public class TipoCambioRequest implements Serializable {

    private Long id;
    private Double tipoDeCambio;
}
