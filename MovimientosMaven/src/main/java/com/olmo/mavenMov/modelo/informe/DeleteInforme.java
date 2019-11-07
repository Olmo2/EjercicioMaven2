package com.olmo.mavenMov.modelo.informe;

import javax.persistence.EntityManager;

import com.olmo.mavenMov.negocio.InformeBean;
import com.olmo.mavenMov.util.ConnectionEntityManagerFactory;

public class DeleteInforme {
	/**
	 * Borra un coche
	 * @param informe Bean del concesionario a borrar
	 */
	public void delete(InformeBean informe) {
		
		// Recoge la entityManager
		EntityManager entityManager = ConnectionEntityManagerFactory.getEntityManager().createEntityManager();
		
		// Comienza la transacción
		entityManager.getTransaction().begin();
		
		// Busca al alumno por ID
		InformeBean informeBorrar = entityManager.find(InformeBean.class, informe.getIdInforme());
		if(informeBorrar!=null) {
			
			// Si lo encuentra, lo borra
			entityManager.remove(informeBorrar);
		}
		// Cierra la transacción y la conexión ligera
		entityManager.getTransaction().commit();
		entityManager.close();
	}	


}
