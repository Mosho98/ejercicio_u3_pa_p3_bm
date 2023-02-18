package com.example.demo.repository;

import java.util.List;

import com.example.demo.modelo.Item;

public interface IDetalleRepository {

	public void insertarFactura(List<Item> productos, String cedulaCliente, String numeroVenta);
}
