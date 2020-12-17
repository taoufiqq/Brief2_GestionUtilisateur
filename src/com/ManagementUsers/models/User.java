package com.ManagementUsers.models;




public class User extends Person{
	
	private String login;
	private String password;
	private String srvice;
	
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getSrvice() {
		return srvice;
	}
	public void setSrvice(String srvice) {
		this.srvice = srvice;
	}
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public User(int matricule, String lastName, String firstName, String email, String phone, float salary,
			String login, String password, String service) {
		
		super(matricule, lastName, firstName, email, phone, salary);
		
		this.login=login;
		this.password=password;
		this.srvice=service;
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "\nlogin=" + login + "\npassword=" + password + "\nsrvice=" + srvice 
				+ super.toString();
	}
	
	public float  calculerSalaire (float salaryN, float increase) {
		
		return super.calculerSalaire(salaryN, increase);
	}
   

}
