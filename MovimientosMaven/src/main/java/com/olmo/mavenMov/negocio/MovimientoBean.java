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
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "movimientos")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class MovimientoBean {

		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		@Column
		private long idMoviemiento;
		
		@Column(name="tipo")
		private String tipo;
		
		@Column(name="hora")
		private String hora;
		
		@Column(name="fecha")
		private String fecha;
		
		@ManyToOne(cascade = CascadeType.MERGE)
		@JoinColumn(name="movimientos")
		private IndividuoBean individuo;
		
		@ManyToOne(cascade=CascadeType.MERGE)
		@JoinColumn(name="torreta")
		private TorretaBean torreta;
		
		@ManyToMany(mappedBy="movimientos",cascade = CascadeType.MERGE)
		private List<InformeBean> informes = new ArrayList<InformeBean>();
		
		

		public void addInforme(InformeBean informe) {

			if (!informes.contains(informe)) {

				informes.add(informe);

				// decirle al coche que añada este concesionario
				List<MovimientoBean> movimientos = informe.getMovimientos();
				if (!movimientos.contains(this)) {

					movimientos.add(this);
				}
			}
		}

		public long getIdMoviemiento() {
			return idMoviemiento;
		}

		public void setIdMoviemiento(long idMoviemiento) {
			this.idMoviemiento = idMoviemiento;
		}

		public String getTipo() {
			return tipo;
		}

		public void setTipo(String tipo) {
			this.tipo = tipo;
		}

		public String getHora() {
			return hora;
		}

		public void setHora(String hora) {
			this.hora = hora;
		}

		public String getFecha() {
			return fecha;
		}

		public void setFecha(String fecha) {
			this.fecha = fecha;
		}

		

		public IndividuoBean getIndividuo() {
			return individuo;
		}

		public void setIndividuo(IndividuoBean individuo) {
			this.individuo = individuo;
		}

		

		public TorretaBean getTorreta() {
			return torreta;
		}

		public void setTorreta(TorretaBean torreta) {
			this.torreta = torreta;
		}

		public List<InformeBean> getInformes() {
			return informes;
		}

		public void setInformes(List<InformeBean> informes) {
			this.informes = informes;
		}

}
