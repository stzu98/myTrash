package OO.compo;

public class CarroTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Carro carro = new Carro();
		
		
		System.out.println(carro.estaLigado());
		
		carro.ligar();
		
		System.out.println(carro.estaLigado());
		
		System.out.println(carro.motor.giros());
		
		carro.abrir();
		
		System.out.println("Porta fechada: " + carro.porta.fechada);
		
		carro.fechar();
		
		System.out.println("Porta fechada: " + carro.porta.fechada);
		
		carro.acelerar();
		carro.acelerar();
		carro.acelerar();
		carro.acelerar();
		
		System.out.println(carro.motor.carro.motor.giros());
		
		carro.desligar();
		
		System.out.println(carro.motor.giros());
	}

}
