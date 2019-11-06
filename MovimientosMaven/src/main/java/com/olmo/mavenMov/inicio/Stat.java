package com.olmo.mavenMov.inicio;

import com.olmo.mavenMov.negocio.*;

public class Stat {

	public static void main(String[] args) {
		

		/*
		 * ********************************
		 * C R E A N D O    O B J E T O S
		 * ********************************
		 */
		
		EspecieBean insecto = new EspecieBean();
		insecto.setNombre("Insecto Planeta P");
		
		EspecieBean gato = new EspecieBean();
		gato.setNombre("Gato Animado");
		
		EspecieBean dodo = new EspecieBean();
		dodo.setNombre("Dodo");
		
		
		/*
		 * INDIVIDUOS DE LA ESPECIE LINCE
		 * Añadimos la especie mas adelate con el metodo add de EspecieBean
		 * Añadimos los movimientos mas adelante con el metodo add de IndividuoBean
		 */
		IndividuoBean silvestre = new IndividuoBean();
		silvestre.setDimensiones("2");
		
		IndividuoBean tom = new IndividuoBean();
		tom.setDimensiones("2");
		
		IndividuoBean felix = new IndividuoBean();
		felix.setDimensiones("2");
		
		/*
		 * INDIVIDUOS DE LA ESPECIE INSECTO
		 * Añadimos la especie mas adelate con el metodo add de EspecieBean
		 * Añadimos los movimientos mas adelante con el metodo add de IndividuoBean
		 */
		
		IndividuoBean soldado = new IndividuoBean();
		soldado.setDimensiones("3");
		
		IndividuoBean cerebro = new IndividuoBean();
		cerebro.setDimensiones("3");
		
		
		/*
		 * INDIVIDUOS DE LA ESPECIE DODO
		 * Añadimos la especie mas adelate con el metodo add de EspecieBean
		 * Añadimos los movimientos mas adelante con el metodo add de IndividuoBean
		 * Spoiler: no hay dodos
		 */
		
		/**********************************************************************************/
		
		/*Los informes se añaden más adelante*/
		MovimientoBean migracion = new MovimientoBean();
		migracion.setTipo("Migracion");
		migracion.setIndividuo(silvestre);
		
		
		
		
		
		
		
		
	}

}
