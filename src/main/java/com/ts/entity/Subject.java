package com.ts.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Subject {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	
	private String subjectName;


	public Subject() {
		super();
	}


	public Subject( String subjectName) {
		super();
		this.subjectName = subjectName;
	}
	
	
	
	
}

