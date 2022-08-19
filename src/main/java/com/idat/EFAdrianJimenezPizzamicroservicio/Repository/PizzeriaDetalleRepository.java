package com.idat.EFAdrianJimenezPizzamicroservicio.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.idat.EFAdrianJimenezPizzamicroservicio.DTO.Pizzeria;
import com.idat.EFAdrianJimenezPizzamicroservicio.Entity.PizzeriaDetalle;

public interface PizzeriaDetalleRepository extends JpaRepository<PizzeriaDetalle, Integer>{

	void save(Pizzeria pizzeria);

}
