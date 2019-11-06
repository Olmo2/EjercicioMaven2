package com.olmo.mavenMov.modelo.biologo;

import javax.persistence.EntityManager;

import com.olmo.mavenMov.negocio.BiologoBean;
import com.olmo.mavenMov.util.ConnectionEntityManagerFactory;

public class DeleteBiologo {

	
	/**
	 * Borra un biologo
	 * @param biologo Bean del concesionario a borrar
	 */
	public void delete(BiologoBean biologo) {
		
		// Recoge la entityManager
		EntityManager entityManager = ConnectionEntityManagerFactory.getEntityManager().createEntityManager();
		
		// Comienza la transacción
		entityManager.getTransaction().begin();
		
		// Busca al alumno por ID
		BiologoBean biologoBorrar = entityManager.find(BiologoBean.class, biologo.getIdBiologo());
		if(biologoBorrar!=null) {
			
			// Si lo encuentra, lo borra
			entityManager.remove(biologoBorrar);
		}
		// Cierra la transacción y la conexión ligera
		entityManager.getTransaction().commit();
		entityManager.close();
	}	

}
