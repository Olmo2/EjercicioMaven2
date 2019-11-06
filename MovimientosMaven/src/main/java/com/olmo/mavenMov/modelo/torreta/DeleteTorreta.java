package com.olmo.mavenMov.modelo.torreta;

import javax.persistence.EntityManager;

import com.olmo.mavenMov.negocio.TorretaBean;
import com.olmo.mavenMov.util.ConnectionEntityManagerFactory;

public class DeleteTorreta {

	
	/**
	 * Borra un coche
	 * @param torreta Bean del concesionario a borrar
	 */
	public void delete(TorretaBean torreta) {
		
		// Recoge la entityManager
		EntityManager entityManager = ConnectionEntityManagerFactory.getEntityManager().createEntityManager();
		
		// Comienza la transacción
		entityManager.getTransaction().begin();
		
		// Busca al alumno por ID
		TorretaBean torretaBorrar = entityManager.find(TorretaBean.class, torreta.getIdTorreta());
		if(torretaBorrar!=null) {
			
			// Si lo encuentra, lo borra
			entityManager.remove(torretaBorrar);
		}
		// Cierra la transacción y la conexión ligera
		entityManager.getTransaction().commit();
		entityManager.close();
	}	

}
