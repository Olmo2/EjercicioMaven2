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
@Table(name = "biologos")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class BiologoBean {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	private long idBiologo;

	@Column(name="fecha")
	private String fecha;
	
	@Column(name="nombre")
	private String provincia;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="direccion")
	private String direccion;
	
	@ManyToMany(cascade= CascadeType.MERGE)
	private List<InformeBean> informes = new ArrayList<InformeBean>();

	public long getIdBiologo() {
		return idBiologo;
	}

	public void setIdBiologo(long idBiologo) {
		this.idBiologo = idBiologo;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public List<InformeBean> getInformes() {
		return informes;
	}

	public void setInformes(List<InformeBean> informes) {
		this.informes = informes;
	}
	
	
}
