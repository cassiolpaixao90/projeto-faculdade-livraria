package br.com.cassiolpaixao.lojaweb.entity;

import java.io.Serializable;

public class Pessoa implements Serializable {

	private static final long serialVersionUID = 1L;
	private int id;
	private String login;
	private String senha;

	public Pessoa() {
	}

	public Pessoa(String login, String senha) {
		this.login = login;
		this.senha = senha;
	}

	public Pessoa(String login) {
		this.login = login;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

}
