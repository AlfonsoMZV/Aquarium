package com.aquariumvanvptir.client.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import com.aquariumvanvptir.client.dto.ValorActualNetoDto;
import com.aquariumvanvptir.client.dto.VanTirResponse;

@FeignClient("VanVpTirAquarium")
public interface IVanVpTirAquariumService {
	
	@RequestMapping("/getVan")
    public VanTirResponse getVan(ValorActualNetoDto request);	
	
}
