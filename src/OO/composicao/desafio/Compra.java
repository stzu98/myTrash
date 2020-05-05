package OO.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Compra {
	
		List<Item> itens = new ArrayList<>();
		
		void addItens(String nome, double preco, int qtde) {
			itens.add(new Item(new Produto(nome,preco),qtde));
		}
		
		
		double vTotal() {
			double total = 0;
			for(Item i : itens) {
				
				total += i.quantidade * i.produto.preco;
							
			}
			
			return total;
		}
		
}
