package com.ManagementUsers.models;

public class Profile extends User{
	
	private int idProfile;
	private int code;
	private String libell�;
	
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
	public String getLibell�() {
		return libell�;
	}
	public void setLibell�(String libell�) {
		this.libell� = libell�;
	}
	
	public Profile() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Profile(int idProfile, int code, String  libell�) {
		
		
		this.idProfile=idProfile;
		this.code=code;
		this.libell�=libell�;
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "\nidProfile=" + idProfile + "\ncode=" + code + "\nlibell�=" + libell� ;
	}

	

	

}
