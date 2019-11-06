package com.olmo.mavenMov.modelo.especie;

import javax.persistence.EntityManager;

import com.olmo.mavenMov.negocio.EspecieBean;
import com.olmo.mavenMov.util.ConnectionEntityManagerFactory;

public class CreateEspecie {

	
public void create(EspecieBean especie) {
		
		// Recoge la conexión
		EntityManager entityManager = ConnectionEntityManagerFactory.getEntityManager().createEntityManager();
		
		// empieza la transacción, persistimos y cerramos
		entityManager.getTransaction().begin();
		entityManager.persist(especie);
		entityManager.getTransaction().commit();
		entityManager.close();
	}
}
