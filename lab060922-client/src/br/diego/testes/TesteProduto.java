package br.diego.testes;

import java.util.List;

import br.diego.WsProdutoClient.Produto;
import br.diego.WsProdutoClient.WsProduto;
import br.diego.WsProdutoClient.WsProdutoService;

public class TesteProduto {
	//ctrl+c do teste entrega...
	public static void main(String[] args) {
		//get do ws
		WsProdutoService testeProduto = new WsProdutoService();
		WsProduto destino = testeProduto.getWsProdutoPort();
		//instancia pra teste...
		Produto p = new Produto();
		p.setDescricao("celular");
		p.setCodBarras(123);
		p.setPreco(199.90);
		
		destino.create(p);
		//teste do listar
		listarItens(destino);
		
		//teste do update
		p.setDescricao("tablet");
		p.setCodBarras(3333333);
		p.setPreco(99.90);
		
		destino.update(p);
		listarItens(destino);
		
		//teste do deletar...
		destino.delete(2L);
		listarItens(destino);
	}

	private static void listarItens(WsProduto destino) {
		// aqui temos os itens que já estão gravados
		List<Produto> Read = destino.read();
		Produto lp = new Produto();
		System.out.println("id: "+ lp.getId());
		System.out.println("descricao: "+ lp.getDescricao());
		System.out.println("codigo de barras: "+ lp.getCodBarras());
		System.out.println("preco: R$ "+ lp.getPreco());
		
	}

}
