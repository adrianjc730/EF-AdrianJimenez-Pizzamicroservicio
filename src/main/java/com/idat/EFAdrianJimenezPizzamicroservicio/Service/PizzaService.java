package com.idat.EFAdrianJimenezPizzamicroservicio.Service;

import com.idat.EFAdrianJimenezPizzamicroservicio.DTO.Cliente;
import com.idat.EFAdrianJimenezPizzamicroservicio.DTO.Pizzeria;

public interface PizzaService {
	void guardarCliente(Cliente cliente);
	void guardarPizzeria(Pizzeria pizzeria);
	void asignarPizzeriaPizza();
	void asignarClientePizza();
}
