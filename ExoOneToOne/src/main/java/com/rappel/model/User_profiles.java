package com.rappel.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class User_profiles {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(length = 100, nullable = false)
	private String adress1;
	@Column(length = 100, nullable = true)
	private String adress2;
	@Column(length = 100)
	private String city, country;
	@Temporal(TemporalType.DATE)
	private Date dob;
	@Enumerated(EnumType.STRING)
	@Column(length = 10,nullable = false)
	private Gender gender;
	@Column(length = 15)
	private String phone_num;
	@Column(length = 100)
	private String state, street;
	@Column(length = 32,nullable = false)
	private String zip_code;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "user_id",referencedColumnName = "id")
	private Users user;

	

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAdress1() {
		return adress1;
	}

	public void setAdress1(String adress1) {
		this.adress1 = adress1;
	}

	public String getAdress2() {
		return adress2;
	}

	public void setAdress2(String adress2) {
		this.adress2 = adress2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getPhone_num() {
		return phone_num;
	}

	public void setPhone_num(String phone_num) {
		this.phone_num = phone_num;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getZip_code() {
		return zip_code;
	}

	public void setZip_code(String zip_code) {
		this.zip_code = zip_code;
	}

	public Users getUser() {
		return user;
	}

	public void setUser(Users user) {
		this.user = user;
	}
	

}
