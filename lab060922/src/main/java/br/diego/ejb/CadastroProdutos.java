package br.diego.ejb;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.diego.classes.Produto;

@Stateless
public class CadastroProdutos {
	//meu ctrl+4 forge setup foi como default...
	@PersistenceContext(unitName="default")
	//instância...
	private EntityManager em;
	//para gravar(create)...
	public void create(Produto createProduto){
		em.persist(createProduto);
	}
	//para ler(read)
	public List<Produto> readProduto(){
		List<Produto> busca = em.createNativeQuery("SELECT * FROM Produto", Produto.class).getResultList();

		return busca;
	}
	//para atualizar(update)..
	public void update(Produto updProduto){
		em.merge(updProduto);
	}
	//para deletar...
	public void delete(Long id){
		//pesquisando atraves do id...
		Produto entidade = em.find(Produto.class, id);
		//para deletar...
		em.remove(entidade);
	}

}
