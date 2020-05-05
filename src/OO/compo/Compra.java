package OO.compo;

import java.util.ArrayList;
import java.util.List;

public class Compra {
	
	String cliente;
	List<Item> itens = new ArrayList<>();
	
	void adicionarItem(String nome, int quantidade, double preco) {
		this.adicionarItem(new Item (nome, quantidade, preco));
	}
	
	void adicionarItem(Item item) {
		this.itens.add(item);
	}
	double valorTotal() {
		double total = 0;
			
		for(Item c : itens) {
			
			total += c.quantidade * c.preco;
		}
		
		return total;
	}
}
