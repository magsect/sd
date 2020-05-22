package br.api.model;

import java.util.ArrayList;

public class Cliente {

	private int id;
	private String nome;
	private String cpf;
	private ArrayList<Produto> compra;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public ArrayList<Produto> getCompra() {
		return compra;
	}
	public void setCompra(ArrayList<Produto> compra) {
		this.compra = compra;
	}
}
