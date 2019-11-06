package com.olmo.mavenMov.modelo.torreta;

import javax.persistence.EntityManager;

import com.olmo.mavenMov.negocio.TorretaBean;
import com.olmo.mavenMov.util.ConnectionEntityManagerFactory;

public class CreateTorreta {
public void create(TorretaBean torreta) {
		
		// Recoge la conexión
		EntityManager entityManager = ConnectionEntityManagerFactory.getEntityManager().createEntityManager();
		
		// empieza la transacción, persistimos y cerramos
		entityManager.getTransaction().begin();
		entityManager.persist(torreta);
		entityManager.getTransaction().commit();
		entityManager.close();
	}
}
