package com.idat.EFAdrianJimenezPizzamicroservicio.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.idat.EFAdrianJimenezPizzamicroservicio.DTO.Cliente;
import com.idat.EFAdrianJimenezPizzamicroservicio.Entity.ClienteDetalle;

public interface ClienteDetalleRepository extends JpaRepository<ClienteDetalle, Integer>{

	void save(Cliente cliente);

}
