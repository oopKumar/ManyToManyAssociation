package com.oop.entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="USER_DTLS")
@Data
public class User implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer user_Id;
	private String user_Name;
	
	
	@ManyToMany
	@JoinTable(
	  name = "role_like", 
	  joinColumns = @JoinColumn(name = "user_id"), 
	  inverseJoinColumns = @JoinColumn(name = "role_id"))
	Set<Role> likedRoles = new HashSet<Role>();
	
	public User(String user_Name) {
		this.user_Name = user_Name;
		
	}
	public User(){
		
	}

}
