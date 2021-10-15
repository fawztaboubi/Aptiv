package com.Management.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

@Entity
@Table(name="Response")
public class Response {
	//in this response we will get data from frontend
		//the manager should first approve, when he approves (click accept) a user is created
		//created(default constrcutor) and then define "identifiant" and "password"
		//data to be bind from front to end:access rights and id and job and kolchay
		
		@javax.persistence.Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		@Column(name="Id", nullable=false, unique=true, length=11)
		public int Id;
		
		@Column(name="Identifiant", nullable=false, unique=true, length=11)
		public int Identifiant;
		
		@Column(name="Password",nullable=false, unique=false, length=20)
		public String Password;

}
