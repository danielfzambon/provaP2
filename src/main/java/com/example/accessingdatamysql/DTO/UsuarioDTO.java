package com.example.accessingdatamysql.DTO;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class UsuarioDTO {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;

	private String nome;

	private String email;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getId() {
		return id;
	}

	@Override
	public String toString() {
		return "UsuarioDTO [id=" + id + ", nome=" + nome + ", email=" + email + "]";
	}


}
