package com.ManagementUsers.models;

public class Profile extends User{
	
	private int idProfile;
	private int code;
	private String libellé;
	
	public int getIdProfile() {
		return idProfile;
	}
	public void setIdProfile(int idProfile) {
		this.idProfile = idProfile;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getLibellé() {
		return libellé;
	}
	public void setLibellé(String libellé) {
		this.libellé = libellé;
	}
	
	public Profile() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Profile(int idProfile, int code, String  libellé) {
		
		
		this.idProfile=idProfile;
		this.code=code;
		this.libellé=libellé;
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "\nidProfile=" + idProfile + "\ncode=" + code + "\nlibellé=" + libellé ;
	}

	

	

}
