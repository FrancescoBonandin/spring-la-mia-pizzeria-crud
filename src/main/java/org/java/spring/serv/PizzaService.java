package org.java.spring.serv;

import java.util.List;

import org.java.spring.pojo.Pizza;
import org.java.spring.repo.PizzaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PizzaService {

	
	@Autowired
	private PizzaRepository pizzaRepository;
	
	public List<Pizza> findAll() {
		
		return pizzaRepository.findAll();
	}
	public Pizza findById(int id) {
		
		return pizzaRepository.findById(id).get();
	}
	public void save(Pizza pizza) {
		
		pizzaRepository.save(pizza);
	}
}
