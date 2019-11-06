package com.olmo.mavenMov.modelo.movimiento;

import javax.persistence.EntityManager;

import com.olmo.mavenMov.negocio.MovimientoBean;
import com.olmo.mavenMov.util.ConnectionEntityManagerFactory;



public class CreateMovimiento {
public void create(MovimientoBean movimiento) {
		
		// Recoge la conexión
		EntityManager entityManager = ConnectionEntityManagerFactory.getEntityManager().createEntityManager();
		
		// empieza la transacción, persistimos y cerramos
		entityManager.getTransaction().begin();
		entityManager.persist(movimiento);
		entityManager.getTransaction().commit();
		entityManager.close();
	}
}
