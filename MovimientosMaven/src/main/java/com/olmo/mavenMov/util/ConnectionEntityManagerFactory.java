package com.olmo.mavenMov.util;


import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;



public class ConnectionEntityManagerFactory {

	private static EntityManagerFactory entityManagerFactory = null;
	
	private ConnectionEntityManagerFactory() {
		
		entityManagerFactory = Persistence.createEntityManagerFactory("com.olmo.mavenMov.H2");
	}
	
	
	
	public static EntityManagerFactory getEntityManager() {
		
		if(entityManagerFactory==null) {
			
			new ConnectionEntityManagerFactory();
		}
		return entityManagerFactory;
	}
}
