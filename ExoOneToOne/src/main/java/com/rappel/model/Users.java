package com.rappel.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.Email;
import javax.validation.constraints.Size;

@Entity
public class Users {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Email
	@Size(min = 1, max = 100)
	@Column(unique = true)
	private String email;
	@Column(length = 65)
	private String first_name;
	@Column(length = 65)
	private String last_name;
	@Size(min = 8, max = 128)
	private String password;
	
	@OneToOne(mappedBy = "user")
	private User_profiles user_profile;

	
	

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public User_profiles getUser_profile() {
		return user_profile;
	}

	public void setUser_profile(User_profiles user_profile) {
		this.user_profile = user_profile;
	}
	
	

}
