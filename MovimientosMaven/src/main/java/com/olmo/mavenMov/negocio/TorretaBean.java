package com.olmo.mavenMov.negocio;

import java.util.ArrayList;
import java.util.List;

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
@Table(name = "torretas")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class TorretaBean {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	private long idTorreta;
	
	@Column(name="ubicacion")
	private String ubicacion;
	
	@Column(name="nombre")
	private String nombre;
	
	@OneToMany(mappedBy="torreta")
	private List<MovimientoBean> movimientos = new ArrayList<MovimientoBean>();
	
	public void addMovimiento(MovimientoBean movimiento) {
		if(!movimientos.contains(movimiento)) {
			movimientos.add(movimiento);
				movimiento.setTorreta(this);
			
		}
	}

	public long getIdTorreta() {
		return idTorreta;
	}

	public void setIdTorreta(long idTorreta) {
		this.idTorreta = idTorreta;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<MovimientoBean> getMovimientos() {
		return movimientos;
	}

	public void setMovimientos(List<MovimientoBean> movimientos) {
		this.movimientos = movimientos;
	}

}
