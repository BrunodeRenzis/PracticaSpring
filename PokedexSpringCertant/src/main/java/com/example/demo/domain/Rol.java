package com.example.demo.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

import lombok.Data;

@Entity
@Data
@Table(name="rol")
public class Rol implements Serializable{
	private static final long serialVersionUID=4L;
	
	public Rol()
	{
		
	}
	
	public Rol(long idRol, @NotEmpty String userRol, long userId) {
		super();
		this.idRol = idRol;
		this.userRol = userRol;
		this.userId = userId;
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idRol")
	private long idRol;
	
	@NotEmpty
	@Column(name="userRol")
	private String userRol;
	
	@Column(name="userId")
	private long userId;
}
