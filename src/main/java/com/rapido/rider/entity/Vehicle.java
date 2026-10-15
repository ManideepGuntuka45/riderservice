package com.rapido.rider.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Vehicle {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String vehciletype;
	@Column(unique = true)
	private String vehcileno;
	private String name;
	private String model;
	public Vehicle() {
		super();
	}
	public Vehicle(int id, String vehciletype, String vehcileno, String name, String model) {
		super();
		this.id = id;
		this.vehciletype = vehciletype;
		this.vehcileno = vehcileno;
		this.name = name;
		this.model = model;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getVehciletype() {
		return vehciletype;
	}
	public void setVehciletype(String vehciletype) {
		this.vehciletype = vehciletype;
	}
	public String getVehcileno() {
		return vehcileno;
	}
	public void setVehcileno(String vehcileno) {
		this.vehcileno = vehcileno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	
	
	

}
