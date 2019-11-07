package com.olmo.mavenMov.negocio;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "individuos")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class IndividuoBean {


			@Id
			@GeneratedValue(strategy = GenerationType.AUTO)
			@Column
			private long idIndividuo;
			
			@Column(name="peso")
			private int peso;
			
			@Column(name="dimensiones")
			private String dimensiones;
			
			@OneToMany(mappedBy="individuo", cascade= CascadeType.ALL)
			private List<MovimientoBean> movimientos = new ArrayList<MovimientoBean>();
			
			@ManyToOne(cascade= CascadeType.ALL)
			private EspecieBean especie;
			
			public void addMovimiento(MovimientoBean movimiento) {

				if (!movimientos.contains(movimiento)) {

					movimientos.add(movimiento);
					movimiento.setIndividuo(this);
				}
			}

			public long getIdIndividuo() {
				return idIndividuo;
			}

			public void setIdIndividuo(long idIndividuo) {
				this.idIndividuo = idIndividuo;
			}

			public int getPeso() {
				return peso;
			}

			public void setPeso(int peso) {
				this.peso = peso;
			}

			public String getDimensiones() {
				return dimensiones;
			}

			public void setDimensiones(String dimensiones) {
				this.dimensiones = dimensiones;
			}

			public List<MovimientoBean> getMovimientos() {
				return movimientos;
			}

			public void setMovimientos(List<MovimientoBean> movimientos) {
				this.movimientos = movimientos;
			}

			public EspecieBean getEspecie() {
				return especie;
			}

			public void setEspecie(EspecieBean especie) {
				this.especie = especie;
			}
			
			
			
			
			
}
