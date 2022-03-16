package com.rappel.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Students {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private int age;
	private String grade;
	private String name;
	
	@ManyToMany(fetch = FetchType.LAZY, 
			cascade = {CascadeType.PERSIST,CascadeType.MERGE},mappedBy = "student")
	private Set<Courses> course = new HashSet<>();

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Courses> getCourse() {
		return course;
	}

	public void setCourse(Set<Courses> course) {
		this.course = course;
	}
	
	

}
