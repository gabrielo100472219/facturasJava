package com.facturas.model;

import org.springframework.stereotype.Component;

@Component
public class Factura {
    private String pais;
    private double precioBase;

    public Factura(){ }

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public double getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}
}
