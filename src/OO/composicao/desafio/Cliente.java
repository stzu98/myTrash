package OO.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	
	String nome;
	
	List<Compra> compras = new ArrayList<>();
		
	Cliente(String nome){
		this.nome = nome;
	}
	
	void addCompra(Compra c) {
		compras.add(c);
	}
	
	double vTotalMercadoria() {
		double total = 0;
		
		for(Compra c : compras) {
			total += c.vTotal();
		}
		return total;
	}
}	


	
	
