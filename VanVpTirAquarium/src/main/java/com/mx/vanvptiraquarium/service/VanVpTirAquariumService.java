package com.mx.vanvptiraquarium.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.mx.vanvptiraquarium.dto.ValorActualNetoDto;
import com.mx.vanvptiraquarium.dto.VanTirResponse;

/**
 * 
 * Service class
 * @author AquariumMzv
 * @since 24/02/2020
 * */
@Service
public class VanVpTirAquariumService {
	
	/** 
	 * Calcula el Valor actual neto
	 * @param ValorActualNetoDto vanDto
	 * @return van double
	 * */
	public VanTirResponse calculaVan(ValorActualNetoDto vanDto) {
		
		VanTirResponse response =null;
		List<Double> listaVan = new ArrayList<Double>();
		Double qvan = null;
		Double totalVan = null;
		Double sumaVan = null;
		Double tasa = 1+vanDto.getTasaDescuento();
		
		for(int i=0; i<vanDto.getCobros().size();i++) {
			qvan = vanDto.getCobros().get(i) / Math.pow(tasa, i+1); 
			listaVan.add(qvan);
			System.out.println("Q"+i+1+" = " + vanDto.getCobros().get(i) + " / " + "(1 + k = "+ vanDto.getTasaDescuento() + ")"+i+1+" = "+ Math.pow(tasa, i+1));
			sumaVan = sumaVan + qvan;
		}
		
		totalVan = sumaVan - vanDto.getDesenvolso();
		response = llenaResponse(listaVan, sumaVan, totalVan);
		System.out.println("VAN= " + totalVan);
		System.out.println(response);
		return response;
	}
	
	/**
	 * Llena el response de calculo VAN
	 * @param List<Double> listaVan, Double sumaVan, Double totalVan
	 * @return VanTirResponse response = new VanTirResponse();
	 * */
	public VanTirResponse llenaResponse(List<Double> listaVan, Double sumaVan, Double totalVan) {
		VanTirResponse response = new VanTirResponse();
		response.setQflujo(listaVan);
		response.setSumaVan(sumaVan);
		response.setTotalVan(totalVan);
		return response;
	}
}
