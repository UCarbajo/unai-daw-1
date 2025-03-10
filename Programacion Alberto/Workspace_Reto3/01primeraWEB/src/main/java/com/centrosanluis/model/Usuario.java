package com.centrosanluis.model;

public class Usuario {

	private String name, lastName, mail, userName, passWord;
	private int phoneNumber;
	private Rol rol;

	public Usuario() {
		super();
	}

	public Usuario(String userName, String passWord) {
		super();
		this.userName = userName;
		this.passWord = passWord;
	}
	
	public Usuario(String name, String lastName, String mail, String userName, String passWord, int phoneNumber, Rol rol) {
		super();
		this.name = name;
		this.lastName = lastName;
		this.mail = mail;
		this.userName = userName;
		this.passWord = passWord;
		this.phoneNumber = phoneNumber;
		this.rol = rol;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public Rol getRol() {
		return rol;
	}

	public void setRol(Rol rol) {
		this.rol = rol;
	}

	@Override
	public String toString() {
		// TODO EL StringBuilder ES MEJOR PARA EL RENDIMIENTO
		StringBuilder str = new StringBuilder();
		str.append(name).append(" ").append(lastName).append(" ").append(mail).append(" ").append(userName).append(" ").append(passWord).append(" ").append(phoneNumber);
		return str.toString();
	}

}
