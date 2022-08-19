package com.idat.EFAdrianJimenezPizzamicroservicio.Client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.idat.EFAdrianJimenezPizzamicroservicio.DTO.Pizzeria;

@FeignClient(name="idat-pizzeria", url="localhost:8080")
public interface OPenFeignPizzeria {

	@GetMapping("/api/pizzeria/v1/listar")
	public List<Pizzeria> listaPizzeriaSeleccionados();
}
