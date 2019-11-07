package com.olmo.mavenMov.inicio;


import com.olmo.mavenMov.modelo.biologo.CreateBiologo;
import com.olmo.mavenMov.modelo.especie.CreateEspecie;
import com.olmo.mavenMov.modelo.individuo.CreateIndividuo;
import com.olmo.mavenMov.modelo.informe.CreateInforme;
import com.olmo.mavenMov.modelo.movimiento.CreateMovimiento;
import com.olmo.mavenMov.modelo.torreta.CreateTorreta;
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
		
		/* Los informes se añaden más adelante
		 * Las Torretas se añaden mas adelante
		 * */
		
		MovimientoBean migrar = new MovimientoBean();
		migrar.setTipo("Migracion");
//		migracion.setIndividuo(silvestre);
		
		MovimientoBean reproducir = new MovimientoBean();
		reproducir.setTipo("Reproduccion");
//		reproduccion.setIndividuo(felix);
		
		
		MovimientoBean atacar = new MovimientoBean();
		atacar.setTipo("Ataque");
//		ataque.setIndividuo(soldado);
		
		MovimientoBean anidar = new MovimientoBean(); 
		anidar.setTipo("Anidar");
//		anidar.setIndividuo(cerebro);
		
		
		/**********************************************************************************/
		
		TorretaBean torretaNorte = new TorretaBean();
		torretaNorte.setNombre("Torreta Norte");
		
		TorretaBean torretaSur = new TorretaBean();
		torretaSur.setNombre("Torreta Sur");
		
		TorretaBean torretaP = new TorretaBean();
		torretaP.setNombre("Torreta del planeta P");
		
		
		/**********************************************************************************/
		
		/*
		 * Los Movimientos se añaden más adelante
		 * */
		
		InformeBean informeGato = new InformeBean();
		informeGato.setFecha("Junio");
		
		InformeBean informeInsecto = new InformeBean();
		informeInsecto.setFecha("Agosto");
		
		
		
		/**********************************************************************************/
		
		
		BiologoBean juan = new BiologoBean();
		juan.setNombre("Juan");
		
		BiologoBean rico = new BiologoBean();
		rico.setNombre("Rico");
		
		
		/*
		 * **************************************************
		 * A Ñ A D I E N D O    I N F O R M A C I Ó N
		 * **************************************************
		 */		
		
		migrar.addInforme(informeGato);
		atacar.addInforme(informeInsecto);
		anidar.addInforme(informeInsecto);
		
		insecto.addIndividuo(soldado);
		insecto.addIndividuo(cerebro);
		
		soldado.addMovimiento(atacar);
		cerebro.addMovimiento(anidar);
		
		
		gato.addIndividuo(silvestre);
		gato.addIndividuo(felix);
		gato.addIndividuo(tom);
		
		silvestre.addMovimiento(migrar);
		felix.addMovimiento(reproducir);
		
		torretaNorte.addMovimiento(migrar);
		torretaSur.addMovimiento(reproducir);
		torretaSur.addMovimiento(migrar);
		torretaP.addMovimiento(atacar);
		
		informeGato.addBiologo(juan);
		informeInsecto.addBiologo(rico);
		
		
		/*
		 * **************************************************
		 * P E R S I S T I E N D O    L O S     D A T O S
		 * **************************************************
		 */
		
		
		CreateEspecie createEspecie = new CreateEspecie();
		createEspecie.create(insecto);
		createEspecie.create(gato);
		createEspecie.create(dodo);
		
		CreateIndividuo createIndividuo = new CreateIndividuo();
		createIndividuo.create(cerebro);
		createIndividuo.create(soldado);
		createIndividuo.create(felix);
		createIndividuo.create(tom);
		createIndividuo.create(silvestre);
		
		CreateMovimiento createMovimiento = new CreateMovimiento();
		createMovimiento.create(anidar);
		createMovimiento.create(atacar);
		createMovimiento.create(reproducir);
		createMovimiento.create(migrar);
		
		CreateTorreta createTorreta = new CreateTorreta();
		createTorreta.create(torretaP);
		createTorreta.create(torretaSur);
		createTorreta.create(torretaNorte);
		
		CreateInforme createInforme = new CreateInforme();
		createInforme.create(informeInsecto);
		createInforme.create(informeGato);
		
		CreateBiologo createBiologo  = new CreateBiologo();
		createBiologo.create(rico);
		createBiologo.create(juan);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
