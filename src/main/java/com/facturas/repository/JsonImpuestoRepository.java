package com.facturas.repository;

import java.io.InputStream;
import java.util.List;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import com.facturas.model.Impuesto;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

@Primary
@Repository
public class JsonImpuestoRepository implements ImpuestoRepository{
    private final List<Impuesto> impuestos;

    public JsonImpuestoRepository() throws Exception {
        ObjectMapper mapper = new ObjectMapper();

        InputStream is = getClass().getClassLoader().getResourceAsStream("impuestos.json");

        if (is == null) {
            throw new IllegalStateException("No se encontró el archivo impuestos.json");
        }

        this.impuestos = mapper.readValue(is, new TypeReference<List<Impuesto>>() {});
    }

    @Override
	public double obtenerImpuestoPorPais(String pais){
        return this.impuestos.stream()
            .filter(impuesto -> impuesto.getPais().equalsIgnoreCase(pais))
            .map(Impuesto::getImpuesto)
            .findFirst()
            .orElseThrow(() -> new RuntimeException("País no encontrado: " + pais));
    }
    
}
