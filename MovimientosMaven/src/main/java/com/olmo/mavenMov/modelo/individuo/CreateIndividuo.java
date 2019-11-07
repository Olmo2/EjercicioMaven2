package com.olmo.mavenMov.modelo.individuo;

import javax.persistence.EntityManager;

import com.olmo.mavenMov.negocio.IndividuoBean;
import com.olmo.mavenMov.util.ConnectionEntityManagerFactory;

public class CreateIndividuo {

	
public void create(IndividuoBean individuo) {
		
		// Recoge la conexión
		EntityManager entityManager = ConnectionEntityManagerFactory.getEntityManager().createEntityManager();
		
		// empieza la transacción, persistimos y cerramos
		entityManager.getTransaction().begin();
		entityManager.persist(individuo);
		entityManager.getTransaction().commit();
		entityManager.close();
	}
}


