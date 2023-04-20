package com.example.demo.model;


public class LoginData {

	private String email;
	private String password;
	public String getemail() {
		return email;
	}
	public void setemail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public LoginData(String email, String password) {
		super();
		this.email = email;
		this.password = password;
		
	}
	
}

//filter: blur(5px); style requirement
