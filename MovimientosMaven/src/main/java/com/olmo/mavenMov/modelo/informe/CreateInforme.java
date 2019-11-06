package com.olmo.mavenMov.modelo.informe;

import javax.persistence.EntityManager;

import com.olmo.mavenMov.negocio.InformeBean;
import com.olmo.mavenMov.util.ConnectionEntityManagerFactory;

public class CreateInforme {
	
public void create(InformeBean informe) {
		
		// Recoge la conexión
		EntityManager entityManager = ConnectionEntityManagerFactory.getEntityManager().createEntityManager();
		
		// empieza la transacción, persistimos y cerramos
		entityManager.getTransaction().begin();
		entityManager.persist(informe);
		entityManager.getTransaction().commit();
		entityManager.close();
	}

}
