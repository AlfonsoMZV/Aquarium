package com.aquariumvanvptir.client.dto;

import java.util.List;

import lombok.Data;

@Data
public class ValorActualNetoDto {
	
	private List<Double> cobros;
	private Double tasaDescuento;
	private Double desenvolso;
	
}
