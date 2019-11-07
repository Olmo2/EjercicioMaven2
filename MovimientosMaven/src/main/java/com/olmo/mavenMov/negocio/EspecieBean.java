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
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table(name = "especies")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class EspecieBean {
	
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		@Column
		private long idEspecie;
		
		@Column(name="nombre")
		private String nombre;
		
		@Column(name="tipo")
		private String tipo;
		
		@Column(name="caracteristicas")
		private String caracteristicas;
		
		@OneToMany(mappedBy="especie",cascade =CascadeType.ALL)
		private List<IndividuoBean> individuos = new ArrayList<IndividuoBean>();
		
		public void addIndividuo(IndividuoBean individuo) {

			if (!individuos.contains(individuo)) {

				individuos.add(individuo);
				individuo.setEspecie(this);
			}
		}

		public long getIdEspecie() {
			return idEspecie;
		}

		public void setIdEspecie(long idEspecie) {
			this.idEspecie = idEspecie;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public String getTipo() {
			return tipo;
		}

		public void setTipo(String tipo) {
			this.tipo = tipo;
		}

		public String getCaracteristicas() {
			return caracteristicas;
		}

		public void setCaracteristicas(String caracteristicas) {
			this.caracteristicas = caracteristicas;
		}

		public List<IndividuoBean> getIndividuos() {
			return individuos;
		}

		public void setIndividuos(List<IndividuoBean> individuos) {
			this.individuos = individuos;
		}
		

}
