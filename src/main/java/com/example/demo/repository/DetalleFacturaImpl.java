
package com.example.demo.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Item;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class DetalleFacturaImpl implements IDetalleRepository{

	@PersistenceContext 
	private EntityManager entityManager;

	@Override
	public void insertarFactura(List<Item> productos, String cedulaCliente, String numeroVenta) {
		this.entityManager.persist(numeroVenta);
		
	}
	
	
}
