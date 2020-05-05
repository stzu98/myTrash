package OO.compo;

public class CompraTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Compra c1 = new Compra();
		
		c1.cliente = "João Pedro";
		c1.adicionarItem("Caneta", 20, 2.00);
		c1.adicionarItem("Lapis", 20, 1.00);
		c1.adicionarItem("Caderno", 4, 10);
		c1.adicionarItem("Cola", 10, 1.00);
		
		System.out.println(c1.itens.size());
		System.out.println(c1.valorTotal());
	}

}
