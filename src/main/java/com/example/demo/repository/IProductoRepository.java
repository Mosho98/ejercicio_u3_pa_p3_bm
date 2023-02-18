package com.example.demo.repository;

import java.util.List;

import com.example.demo.modelo.Item;
import com.example.demo.modelo.ProductoDTO;

public interface IProductoRepository {

	public void insertar(Item producto);
	public int stock(String barras, Integer stock);
	
	public List<Item> consultarProducto(String barras);
	
	public ProductoDTO insertarProducto(String codigoBarras);
}
