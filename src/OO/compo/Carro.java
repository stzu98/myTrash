package OO.compo;

public class Carro {

	Motor motor = new Motor(this);
	Portas porta = new Portas();
	
	void acelerar() {
		
		if(!porta.fechada) {
			motor.fatorInjecao = 0;
		}
		else {
			
			motor.fatorInjecao += 0.4;
		}
	}
	
	void frear() {
		motor.fatorInjecao -= 0.4;
	}
	
	void ligar() {
		motor.ligado = true;
	}
	
	void desligar() {
		motor.ligado = false;
	}
	
	boolean estaLigado() {
		return motor.ligado;
	}
	
	void fechar() {
		porta.fechada = true;
	}
	
	void abrir() {
		porta.fechada = false;
	}
}	
