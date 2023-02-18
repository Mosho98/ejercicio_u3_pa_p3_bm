package com.example.demo;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.modelo.Item;
import com.example.demo.service.IProductoService;

@SpringBootApplication
public class EjercicioU3PaP3BmApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(EjercicioU3PaP3BmApplication.class, args);
	}
	
	@Autowired 
	private IProductoService iProductoService;

	@Override
	public void run(String... args) throws Exception {
		
		Item p1 = new Item();
		
		p1.setCodigoBarras("p1");
		p1.setNombre("Coca Cola");
		p1.setPrecioU(new BigDecimal(2.50));
		p1.setStock(5);
		p1.setTipo("Bebida");
		
		this.iProductoService.insertar(p1);
		
	}

}
