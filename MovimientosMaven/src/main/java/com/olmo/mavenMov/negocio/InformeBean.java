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
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="informes")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class InformeBean {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	private long idInforme;
	
	@Column(name="fecha")
	private String fecha;
	
	@ManyToMany(mappedBy="informes",cascade= CascadeType.MERGE)
	private List<MovimientoBean> movimientos = new ArrayList<MovimientoBean>();
	
	@ManyToMany(mappedBy="informes",cascade = CascadeType.MERGE)
	private List<BiologoBean> biologos = new ArrayList<BiologoBean>();
	
	public void addBiologo(BiologoBean biologo) {

		if (!biologos.contains(biologo)) {

			biologos.add(biologo);

			// decirle al coche que añada este concesionario
			List<InformeBean> informes = biologo.getInformes();
			if (!informes.contains(this)) {

				informes.add(this);
			}
		}
	}

	public long getIdInforme() {
		return idInforme;
	}

	public void setIdInforme(long idInforme) {
		this.idInforme = idInforme;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public List<MovimientoBean> getMovimientos() {
		return movimientos;
	}

	public void setMovimientos(List<MovimientoBean> movimientos) {
		this.movimientos = movimientos;
	}

	public List<BiologoBean> getBiologos() {
		return biologos;
	}

	public void setBiologos(List<BiologoBean> biologos) {
		this.biologos = biologos;
	}
	
	

}
