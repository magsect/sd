package br.api.model;

import java.util.ArrayList;

public class Mercado {
	
	private int id;
	private String Nome;	
	private ArrayList<Funcionario> lstFunc;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public ArrayList<Funcionario> getLstFunc() {
		return lstFunc;
	}
	public void setLstFunc(ArrayList<Funcionario> lstFunc) {
		this.lstFunc = lstFunc;
	}
	public ArrayList<Cliente> getLstClientes() {
		return lstClientes;
	}
	public void setLstClientes(ArrayList<Cliente> lstClientes) {
		this.lstClientes = lstClientes;
	}
	public ArrayList<Produto> getLstProdutos() {
		return lstProdutos;
	}
	public void setLstProdutos(ArrayList<Produto> lstProdutos) {
		this.lstProdutos = lstProdutos;
	}
	public ArrayList<Venda> getLstVendas() {
		return lstVendas;
	}
	public void setLstVendas(ArrayList<Venda> lstVendas) {
		this.lstVendas = lstVendas;
	}
	private ArrayList<Cliente> lstClientes;
	private ArrayList<Produto> lstProdutos;
	private ArrayList<Venda> lstVendas;

}
