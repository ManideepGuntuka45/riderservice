package com.rapido.rider.dto;

public class Vehicledto {
	private String type;
	private String vehicleno;
	private String name;
	private String model;
	public Vehicledto() {
		super();
	}
	public Vehicledto(String type, String vehicleno, String name, String model) {
		super();
		this.type = type;
		this.vehicleno = vehicleno;
		this.name = name;
		this.model = model;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getVehicleno() {
		return vehicleno;
	}
	public void setVehicleno(String vehicleno) {
		this.vehicleno = vehicleno;
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
