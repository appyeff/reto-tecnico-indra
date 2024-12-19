package com.example.demo.service;

import com.example.demo.controllers.request.ConversionRequest;
import com.example.demo.controllers.request.TipoCambioRequest;
import com.example.demo.controllers.response.ConversionResponse;
import com.example.demo.model.TipoDeCambio;
import com.example.demo.repository.TipoDeCambioRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ConversionService {

    private final TipoDeCambioRepository tipoDeCambioRepository;

    public ConversionResponse convertir(ConversionRequest conversionRequest) {
        TipoDeCambio tipoDeCambio = tipoDeCambioRepository
                .findByQuery(conversionRequest.getMonedaOrigen(), conversionRequest.getMonedaDestino())
                .orElseThrow(() -> new IllegalArgumentException("Tipo de cambio no disponible"));

        Double montoConCambio = conversionRequest.getMonto() * tipoDeCambio.getTipoDeCambio();
        return new ConversionResponse(conversionRequest.getMonto(), montoConCambio, conversionRequest.getMonedaOrigen(),
                conversionRequest.getMonedaDestino(), tipoDeCambio.getTipoDeCambio());
    }

    public TipoDeCambio actualizarTipoCambio(TipoCambioRequest tipoCambioRequest) {
        TipoDeCambio tipoCambio = tipoDeCambioRepository
                .findById(tipoCambioRequest.getId())
                .orElseThrow(() -> new RuntimeException("Tipo de cambio no encontrado"));

        tipoCambio.setTipoDeCambio(tipoCambioRequest.getTipoDeCambio());

        return tipoDeCambioRepository.save(tipoCambio);
    }
}
