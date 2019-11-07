package com.olmo.mavenMov.modelo.especie;

import javax.persistence.EntityManager;

import com.olmo.mavenMov.negocio.EspecieBean;
import com.olmo.mavenMov.util.ConnectionEntityManagerFactory;

public class DeleteEspecie {
	/**
	 * Borra un coche
	 * @param especie Bean del concesionario a borrar
	 */
	public void delete(EspecieBean especie) {
		
		// Recoge la entityManager
		EntityManager entityManager = ConnectionEntityManagerFactory.getEntityManager().createEntityManager();
		
		// Comienza la transacción
		entityManager.getTransaction().begin();
		
		// Busca al alumno por ID
		EspecieBean especieBorrar = entityManager.find(EspecieBean.class, especie.getIdEspecie());
		if(especieBorrar!=null) {
			
			// Si lo encuentra, lo borra
			entityManager.remove(especieBorrar);
		}
		// Cierra la transacción y la conexión ligera
		entityManager.getTransaction().commit();
		entityManager.close();
	}	

}
