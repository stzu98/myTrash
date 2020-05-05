package OO.composicao.desafio;

public class Sistema {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cliente cliente = new Cliente("Leonardo");
		
		Compra c = new Compra();
		
		c.addItens("Manteiga", 5.00, 2);
		c.addItens("Coca cola", 7.00, 2);
		c.addItens("Arroz", 5.00, 2);
		c.addItens("Feijão", 3.00, 2);
		c.addItens("Macarrão", 2.00, 2);
		
		cliente.addCompra(c);
		
		System.out.println("Valor total " + cliente.vTotalMercadoria());
	}

}
