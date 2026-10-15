package com.rapido.rider.dto;

public class CordinateDto {
	private double latitude;
	private double longitude;
	public CordinateDto(double latitude, double longitude) {
		super();
		this.latitude = latitude;
		this.longitude = longitude;
	}
	public CordinateDto() {
		super();
	}
	public double getLatitude() {
		return latitude; 
	}
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	public double getLongitude() {
		return longitude;
	}
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	
	

}
