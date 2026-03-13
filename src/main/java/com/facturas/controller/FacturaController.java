package com.facturas.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.facturas.model.*;
import com.facturas.service.FacturaService;

@RestController
public class FacturaController {
    @Autowired
    private FacturaService facturaServicer;

    @PostMapping("/facturas")
    public Map<String, Object> calculateFinalPrice(@RequestBody Factura factura) {
        Map<String, Object> body = new HashMap<>();
        body = this.facturaServicer.calcularPrecioFinal(factura);
        return body;
    }
}
