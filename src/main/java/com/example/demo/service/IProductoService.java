
package com.example.demo.service;

import java.util.List;

import com.example.demo.modelo.Item;

public interface IProductoService {

	public void insertar(Item producto);
	public int stock(String barras, Integer stock);
	
	public List<Item> consultarProducto(String barras);
	
}
