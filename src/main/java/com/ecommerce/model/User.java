package com.ecommerce.model;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity

@Table(name = "users")
public class User implements Serializable  {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	@Column(name = "email")
    private String email;
	
	@Column(name = "username")
	 private String username;
	
	@Column(name = "password")
    private String password;
	

    
    
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	public User(String email, String password, String confirmPassword) {
		super();
		this.email = email;
		this.password = password;
		this.username = username;
	}
	
	
	public User(Long id, String email, String name, String password, String confirmPassword) {
		super();
		this.id = id;
		this.email = email;
		this.username = username;
		this.password = password;
		
	}
    
    

}
