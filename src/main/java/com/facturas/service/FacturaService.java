package com.facturas.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.facturas.repository.JsonImpuestoRepository;
import com.facturas.model.Factura;

@Service
public class FacturaService {
    @Autowired
    private JsonImpuestoRepository repo;

    public Map<String, Object> calcularPrecioFinal(Factura factura) {
        Map<String, Object> result = new HashMap<>();
        double impuesto = this.repo.obtenerImpuestoPorPais(factura.getPais());
        double precioFinal = (1 - impuesto) * factura.getPrecioBase();
        result.put("pais", factura.getPais());
        result.put("precioBase", factura.getPrecioBase());
        result.put("impuesto", impuesto);
        result.put("precioFinal", precioFinal);
        return result; 
    }    
}
