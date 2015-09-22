package br.sc.senai.usuarios.model;

import java.io.Serializable;

public class Usuario implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String nome;
	private String senha;
	private boolean ativo;
	
	
	public Usuario(){
		
	}
	
	public Usuario(String nome, String senha, boolean ativo) {
		this.nome = nome;
		this.senha = senha;
		this.ativo = ativo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public boolean isAtivo() {
		return ativo;
	}
	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
}
