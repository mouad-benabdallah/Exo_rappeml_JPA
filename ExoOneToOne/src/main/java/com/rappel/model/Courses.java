package com.rappel.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Courses {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String abbreviation;
	private double fee;
	private int modules;
	private String titre;
	
	@ManyToMany()
	private Set<Students> student ;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getAbbreviation() {
		return abbreviation;
	}

	public void setAbbreviation(String abbreviation) {
		this.abbreviation = abbreviation;
	}

	public double getFee() {
		return fee;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}

	public int getModules() {
		return modules;
	}

	public void setModules(int modules) {
		this.modules = modules;
	}


	public String getTitre() {
		return titre;
	}

	public Set<Students> getStudent() {
		return student;
	}

	public void setStudent(Set<Students> student) {
		this.student = student;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	

}
