package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Item;
import com.example.demo.repository.IProductoRepository;

@Service
public class ProductoServiceImpl implements IProductoService{
	
	@Autowired 
	private IProductoRepository iProductoRepository;

	@Override
	public void insertar(Item producto) {
		// TODO Auto-generated method stub
		this.iProductoRepository.insertar(producto);
	}

	@Override
	public int stock(String barras, Integer stock) {
		// TODO Auto-generated method stub
		return this.iProductoRepository.stock(barras, stock);
	}

	@Override
	public List<Item> consultarProducto(String barras) {
		// TODO Auto-generated method stub
		return this.iProductoRepository.consultarProducto(barras);
	}

	public void consultarStock(String barras) {
		
		Item producto = new Item();
		
		if(producto.getStock()!=0) {
			this.stock(barras, producto.getStock());
		}else {
			System.out.println("No existe");
		}
		
	}
	
}
