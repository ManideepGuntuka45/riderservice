package com.rapido.rider.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Rider {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String ridername;
	@Column(unique = true)
	private long ridermobno;
	@Column(unique = true)
	private String ridermail;
	private String ridergender;
	private double wallet;
	private int noofrides;
	@Column(unique = true)
	private String license;
	private String riderstatus;
	@OneToOne(cascade = CascadeType.ALL)
	private Vehicle vehcile;
	public Rider() {
		super();
	}
	public Rider(int id, String ridername, long ridermobno, String ridermail, String ridergender, double wallet,
			int noofrides, String license, String riderstatus, Vehicle vehcile) {
		super();
		this.id = id;
		this.ridername = ridername;
		this.ridermobno = ridermobno;
		this.ridermail = ridermail;
		this.ridergender = ridergender;
		this.wallet = wallet;
		this.noofrides = noofrides;
		this.license = license;
		this.riderstatus = riderstatus;
		this.vehcile = vehcile;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRidername() {
		return ridername;
	}
	public void setRidername(String ridername) {
		this.ridername = ridername;
	}
	public long getRidermobno() {
		return ridermobno;
	}
	public void setRidermobno(long ridermobno) {
		this.ridermobno = ridermobno;
	}
	public String getRidermail() {
		return ridermail;
	}
	public void setRidermail(String ridermail) {
		this.ridermail = ridermail;
	}
	public String getRidergender() {
		return ridergender;
	}
	public void setRidergender(String ridergender) {
		this.ridergender = ridergender;
	}
	public double getWallet() {
		return wallet;
	}
	public void setWallet(double wallet) {
		this.wallet = wallet;
	}
	public int getNoofrides() {
		return noofrides;
	}
	public void setNoofrides(int noofrides) {
		this.noofrides = noofrides;
	}
	public String getLicense() {
		return license;
	}
	public void setLicense(String license) {
		this.license = license;
	}
	public String getRiderstatus() {
		return riderstatus;
	}
	public void setRiderstatus(String riderstatus) {
		this.riderstatus = riderstatus;
	}
	public Vehicle getVehcile() {
		return vehcile;
	}
	public void setVehcile(Vehicle vehcile) {
		this.vehcile = vehcile;
	}
	
	
	

}
