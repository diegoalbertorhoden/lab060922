package br.diego.classes;

import java.io.Serializable;
import java.util.Date;

public class Entrega implements Serializable{

	private static final long serialVersionUID = 1L;
	private int numeroEntrega;
	private Date data;
	private String endereco;
	public Entrega(int numeroEntrega, Date data, String endereco) {
		this.numeroEntrega = numeroEntrega;
		this.data = data;
		this.endereco = endereco;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public int getNumeroEntrega() {
		return numeroEntrega;
	}
	public void setNumeroEntrega(int numeroEntrega) {
		this.numeroEntrega = numeroEntrega;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

}
