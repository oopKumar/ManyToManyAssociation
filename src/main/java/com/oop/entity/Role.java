package com.oop.entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "ROLE_DTLS")
@Data

public class Role implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer role_Id;
	private String role_Name;

	@ManyToMany(mappedBy = "likedRoles")
	Set<User> likesUsers = new HashSet<User>();

	public Role(String role_Name) {
		this.role_Name = role_Name;

	}
	public Role() {
		
	}

}
