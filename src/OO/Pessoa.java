package OO;

public class Pessoa {
	
	public String nome;
	public double peso;
	
	
	public Pessoa(String nome, double peso) {
	
		this.nome = nome;
		this.peso = peso;
	}
	
	public double peso2(double pesoComida) {
		return peso + pesoComida;
	}
}
