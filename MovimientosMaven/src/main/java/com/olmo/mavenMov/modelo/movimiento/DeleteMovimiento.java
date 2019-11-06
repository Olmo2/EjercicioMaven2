package com.olmo.mavenMov.modelo.movimiento;

import javax.persistence.EntityManager;

import com.olmo.mavenMov.negocio.MovimientoBean;
import com.olmo.mavenMov.util.ConnectionEntityManagerFactory;



public class DeleteMovimiento {
	
	/**
	 * Borra un coche
	 * @param movimiento Bean del concesionario a borrar
	 */
	public void delete(MovimientoBean movimiento) {
		
		// Recoge la entityManager
		EntityManager entityManager = ConnectionEntityManagerFactory.getEntityManager().createEntityManager();
		
		// Comienza la transacción
		entityManager.getTransaction().begin();
		
		// Busca al alumno por ID
		MovimientoBean movimientoBorrar = entityManager.find(MovimientoBean.class, movimiento.getIdMoviemiento());
		if(movimientoBorrar!=null) {
			
			// Si lo encuentra, lo borra
			entityManager.remove(movimientoBorrar);
		}
		// Cierra la transacción y la conexión ligera
		entityManager.getTransaction().commit();
		entityManager.close();
	}	

}
