package fundamentos;

import java.util.Locale;
import java.util.Scanner;

public class DesafioModulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite dois numeros: ");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		
		System.out.println("Digite Qual operador + , - , / , % ou * ");
		sc.nextLine();
		String operador = sc.nextLine();
		
		if(operador.equals("+")) {
			System.out.println("Resposta da adição é: " + (n1 + n2));
		}
		if(operador.equals("-")) {
			System.out.println("Resposta da subtração é: " + (n1 - n2));
		}
		if(operador.equals("/")) {
			Double divisao = (double) n1 / n2;
			System.out.printf("Resposta da divisão é: %f " , divisao );
		}
		if(operador.equals("%")) {
			double modulo = (double) n1 % n2;
			System.out.printf("Resposta da modulo é: %f " , modulo);
		}
		if(operador.equals("*")) {
			
			System.out.println("Resposta da multiplicação é: " + (n1 * n2));
		}
		System.out.println();
		
		System.out.println();	
		
		sc.close();
	}

}
