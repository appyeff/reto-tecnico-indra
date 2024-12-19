package com.example.demo.repository;

import com.example.demo.model.TipoDeCambio;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface TipoDeCambioRepository extends JpaRepository<TipoDeCambio, Long> {
    Optional<TipoDeCambio> findByMonedaOrigenAndMonedaDestino(String monedaOrigen, String monedaDestino);

    @Query(value = "SELECT * FROM TIPODECAMBIO WHERE moneda_origen = :monedaOrigen AND moneda_destino = :monedaDestino", nativeQuery = true)
    Optional<TipoDeCambio> findByQuery(@Param("monedaOrigen") String monedaOrigen, @Param("monedaDestino") String monedaDestino);
}
