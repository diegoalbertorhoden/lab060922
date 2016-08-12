package br.diego.classes;

import java.io.Serializable;
import java.util.Date;

public class Entrega implements Serializable{

	private static final long serialVersionUID = 1L;

	private Date data;
	private String endereco;
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

}
