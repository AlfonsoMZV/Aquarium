package com.aquariumvanvptir.client.dto;

import java.util.List;

import lombok.Data;

@Data
public class VanTirResponse {
	
	private List<Double> qflujo;
	private Double sumaVan;
	private Double totalVan;
	
}
