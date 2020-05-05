package OO;

public class Jantar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Comida comida = new Comida("Macarrão", 300);
		Pessoa pessoa = new Pessoa("Alberto", 70000);
		
		double pesoComida = comida.peso;
		pesoComida = pessoa.peso2(pesoComida);
		
		System.out.println("Pessoa: " + pessoa.nome + 
				", Comeu " + comida.comida + " e passou a pesar: "
				+ pesoComida);
	}

}
