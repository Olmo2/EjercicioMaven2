package com.olmo.mavenMov.modelo.individuo;

import javax.persistence.EntityManager;

import com.olmo.mavenMov.negocio.IndividuoBean;
import com.olmo.mavenMov.util.ConnectionEntityManagerFactory;

public class DeleteIndividuo {
	
	/**
	 * Borra un coche
	 * @param Individuo Bean del concesionario a borrar
	 */
	public void delete(IndividuoBean Individuo) {
		
		// Recoge la entityManager
		EntityManager entityManager = ConnectionEntityManagerFactory.getEntityManager().createEntityManager();
		
		// Comienza la transacción
		entityManager.getTransaction().begin();
		
		// Busca al alumno por ID
		IndividuoBean individuoBorrar = entityManager.find(IndividuoBean.class, Individuo.getIdIndividuo());
		if(individuoBorrar!=null) {
			
			// Si lo encuentra, lo borra
			entityManager.remove(individuoBorrar);
		}
		// Cierra la transacción y la conexión ligera
		entityManager.getTransaction().commit();
		entityManager.close();
	}	


}
