package br.diego.webservicesjax;

import java.util.List;

import javax.ejb.EJB;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import br.diego.classes.Produto;
import br.diego.ejb.CadastroProdutos;

@WebService
public class WsProduto {
	
	//seguindo a mesma lógica dos outros dois ejbs
	
	@EJB
	CadastroProdutos cadProd;
	//create
	@WebMethod(operationName = "Create")
	@WebResult(name = "returnCreate")
	public void gravar(@WebParam(name="paramProduto") Produto prod){
		cadProd.create(prod);
	}
	//read
	@WebMethod(operationName= "Read")
	@WebResult(name="returnRead")
	public List<Produto> readProduto(){
		List<Produto> busca = cadProd.readProduto();
		
		return busca;
	}
	//update
	@WebMethod(operationName = "Update")
	@WebResult(name= "returnUpdate")
	public void Update(@WebParam(name="paramProduto")Produto updProduto){
		
		cadProd.update(updProduto);
	}
	//delete
	@WebMethod(operationName = "Delete")
	@WebResult(name="returnDelete")
	public void Delete(@WebParam(name="paramId")Long id){
		cadProd.delete(id);
	}
	
	
	
}
