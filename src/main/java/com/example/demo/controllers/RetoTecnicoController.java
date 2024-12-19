package com.example.demo.controllers;

import com.example.demo.controllers.request.ConversionRequest;
import com.example.demo.controllers.request.TipoCambioRequest;
import com.example.demo.controllers.response.ConversionResponse;
import com.example.demo.model.TipoDeCambio;
import com.example.demo.service.ConversionService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/tipo-cambio")
public class RetoTecnicoController {

	private final ConversionService conversionService;

    public RetoTecnicoController(ConversionService conversionService) {
        this.conversionService = conversionService;
    }

    @GetMapping("/hello")
	public String hello() {
		return "El microservicio está en ejecución";
	}

	@PostMapping
    public ResponseEntity<ConversionResponse> convertir(@RequestBody ConversionRequest ConversionRequest) {
        return ResponseEntity.ok(conversionService.convertir(ConversionRequest));
    }

    @PostMapping("/actualizar")
    public ResponseEntity<TipoDeCambio> actualizarTipoCambio(@RequestBody TipoCambioRequest tipoCambioDTO) {
        TipoDeCambio tipoCambioActualizado = conversionService.actualizarTipoCambio(tipoCambioDTO);
        return ResponseEntity.ok(tipoCambioActualizado);
    }
}
