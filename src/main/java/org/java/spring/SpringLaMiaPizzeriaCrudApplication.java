package org.java.spring;

import org.java.spring.pojo.Pizza;
import org.java.spring.serv.PizzaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringLaMiaPizzeriaCrudApplication implements CommandLineRunner {
	
	@Autowired
	private PizzaService pizzaService;

	public static void main(String[] args) {
		SpringApplication.run(SpringLaMiaPizzeriaCrudApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		
		int num = 1;
		pizzaService.save(new Pizza("Pizza " + num++, "una pizza buona", 9.90f + 0.1f, "https://upload.wikimedia.org/wikipedia/commons/thumb/1/11/Pizza_marinara.jpg/260px-Pizza_marinara.jpg" ));
		pizzaService.save(new Pizza("Pizza " + num++, "una pizza buona", 9.90f + 0.2f, "https://upload.wikimedia.org/wikipedia/commons/thumb/1/11/Pizza_marinara.jpg/260px-Pizza_marinara.jpg" ));
		pizzaService.save(new Pizza("Pizza " + num++, "una pizza buona", 9.90f + 0.3f, "https://upload.wikimedia.org/wikipedia/commons/thumb/1/11/Pizza_marinara.jpg/260px-Pizza_marinara.jpg" ));
		pizzaService.save(new Pizza("Pizza " + num++, "una pizza buona", 9.90f + 0.4f, "https://upload.wikimedia.org/wikipedia/commons/thumb/1/11/Pizza_marinara.jpg/260px-Pizza_marinara.jpg" ));
		pizzaService.save(new Pizza("Pizza " + num++, "una pizza buona", 9.90f + 0.5f, "https://upload.wikimedia.org/wikipedia/commons/thumb/1/11/Pizza_marinara.jpg/260px-Pizza_marinara.jpg" ));
	}

}
