package com.olmo.mavenMov.modelo.biologo;

import javax.persistence.EntityManager;

import com.olmo.mavenMov.negocio.BiologoBean;
import com.olmo.mavenMov.util.ConnectionEntityManagerFactory;

public class CreateBiologo {

	
public void create(BiologoBean biologo) {
		
		// Recoge la conexión
		EntityManager entityManager = ConnectionEntityManagerFactory.getEntityManager().createEntityManager();
		
		// empieza la transacción, persistimos y cerramos
		entityManager.getTransaction().begin();
		entityManager.persist(biologo);
		entityManager.getTransaction().commit();
		entityManager.close();
	}
}
