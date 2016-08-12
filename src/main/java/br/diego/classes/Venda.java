package br.diego.classes;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

public class Venda implements Serializable{

	private static final long serialVersionUID = 1L;

	private int idVenda;

	private int quantidade;
	private String cliente;
	private BigDecimal total;
	private List<String> lista;
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public BigDecimal getTotal() {
		return total;
	}
	public void setTotal(BigDecimal total) {
		this.total = total;
	}
	public List<String> getLista() {
		return lista;
	}
	public void setLista(List<String> lista) {
		this.lista = lista;

	}
	public int getIdVenda() {
		return idVenda;
	}
	public void setIdVenda(int idVenda) {
		this.idVenda = idVenda;
	}
	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
}