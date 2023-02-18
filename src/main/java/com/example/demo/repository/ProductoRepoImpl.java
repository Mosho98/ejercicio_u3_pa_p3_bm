package com.example.demo.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Item;
import com.example.demo.modelo.ProductoDTO;


import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class ProductoRepoImpl implements IProductoRepository{

	@PersistenceContext 
	private EntityManager entityManager;
	
	@Override
	public void insertar(Item producto) {
		// TODO Auto-generated method stub
		this.entityManager.persist(producto);
	}

	@Override
	public int stock(String barras, Integer stock) {
		Query myQuery = this.entityManager.createQuery("UPDATE from Item i where :datoBarras = :datoStock");
		myQuery.setParameter("datoBarras", barras);
		myQuery.setParameter("datoStock", stock);
		return (int) myQuery.getSingleResult();
	}

	@Override
	public List<Item> consultarProducto(String barras) {
		TypedQuery<Item> myQuery = this.entityManager.createNamedQuery("Item.consultarBarras", Item.class);
		myQuery.setParameter("datoBarras", barras);
		return myQuery.getResultList();
	}

	@Override
	public ProductoDTO insertarProducto(String cantidad) {
		TypedQuery<ProductoDTO> myTypedQuery = this.entityManager
				.createQuery("select NEW com.example.demo.modelo.ProductoDTO(p.codigoBarras, p.cantidad)  from Producto p where p.codigoBarras = :datoBarras", ProductoDTO.class);
		myTypedQuery.setParameter("datoBarras", cantidad);
		
		return myTypedQuery.getSingleResult();
	}

}
