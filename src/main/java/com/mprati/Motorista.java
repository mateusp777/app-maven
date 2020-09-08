package com.mprati;
public class Motorista {
	
	private String cpf;
	private String nome;
	
	public Motorista(String cpf, String nome) {
		this.cpf = cpf;
		this.nome = nome;
	}

	public String getCpf() {
		return this.cpf;
	}

	public String getNome() {
		return this.nome;
	}

}
