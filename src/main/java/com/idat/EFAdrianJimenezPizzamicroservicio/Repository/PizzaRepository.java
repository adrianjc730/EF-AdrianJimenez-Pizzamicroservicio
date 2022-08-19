package com.idat.EFAdrianJimenezPizzamicroservicio.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.idat.EFAdrianJimenezPizzamicroservicio.Entity.Pizza;

public interface PizzaRepository extends JpaRepository<Pizza, Integer>{

}
