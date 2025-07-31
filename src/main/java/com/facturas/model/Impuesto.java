package com.facturas.model;

import org.springframework.stereotype.Component;

@Component
public class Impuesto {
    private String pais;
    private double impuesto;

    public Impuesto(){ }

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public double getImpuesto() {
		return impuesto;
	}

	public void setImpuesto(double impuesto) {
		this.impuesto = impuesto;
	}
}
