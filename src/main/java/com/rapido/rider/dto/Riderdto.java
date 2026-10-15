package com.rapido.rider.dto;

public class Riderdto {
	private String name;
	private int mobno;
	private String gender;
	private String email;
	private String license;
	private Vehicledto vd;	
	private String riderstatus;
	public Riderdto() {
		super();
	}
	public Riderdto(String name, int mobno, String gender, String email, String license, Vehicledto vd,
			String riderstatus) {
		super();
		this.name = name;
		this.mobno = mobno;
		this.gender = gender;
		this.email = email;
		this.license = license;
		this.vd = vd;
		this.riderstatus = riderstatus;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMobno() {
		return mobno;
	}
	public void setMobno(int mobno) {
		this.mobno = mobno;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getLicense() {
		return license;
	}
	public void setLicense(String license) {
		this.license = license;
	}
	public Vehicledto getVd() {
		return vd;
	}
	public void setVd(Vehicledto vd) {
		this.vd = vd;
	}
	public String getRiderstatus() {
		return riderstatus;
	}
	public void setRiderstatus(String riderstatus) {
		this.riderstatus = riderstatus;
	}
	
	
	
	
	

}
