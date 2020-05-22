package br.api.model;

import java.util.ArrayList;

public class Venda {

	private int id;
	private ArrayList<Produto> lstVendaPrd;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public ArrayList<Produto> getLstVendaPrd() {
		return lstVendaPrd;
	}
	public void setLstVendaPrd(ArrayList<Produto> lstVendaPrd) {
		this.lstVendaPrd = lstVendaPrd;
	}
	
	
}
