package com.ManagementUsers.models;



public class Person {
	
	private int matricule;
	private String lastName;
	private String firstName;
	private String email;
	private String phone;
	private float  salary;
	
	public int getMatricule() {
		return matricule++;
	}
	public void setMatricule(int matricule) {
		this.matricule = matricule;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	
	public Person(int matricule, String lastName, String firstName, String email, String phone, float salary) {
		super();
		this.matricule = matricule;
		this.lastName = lastName;
		this.firstName = firstName;
		this.email = email;
		this.phone = phone;
		this.salary = salary;
	}
	
	public Person() {
		
	}
	
	@Override
	public String toString() {
		return "\nmatricule=" + matricule + "\nlastName=" + lastName + "\nfirstName=" + firstName + "\nemail="
				+ email + "\nphone=" + phone + "\nsalary=" + salary ;
	}
	
	public float  calculerSalaire (float salaryN, float increase) {

		return salaryN * (increase/100);			
	}


}
