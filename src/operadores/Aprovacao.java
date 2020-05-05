package operadores;

import java.util.Locale;
import java.util.Scanner;

public class Aprovacao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
			
			Double nota = 0.0;
			Double soma = 0.0;
			int i = 0;
			
			
			System.out.println("Digite o valor da Nota ou -1 para sair");
			
			while (nota != -1) {
				
				nota = sc.nextDouble();
				
				if(nota <= 10.0 && nota >= 0.0) {
				
						
						soma += nota;
						i++;
					
				}
				
				else {
					
					if(nota != -1) {
						System.out.println("Nota inválida, por favor, digite novamente: ");	
					}
						
					
				}
				
			}
				
			double media = soma/i;
			
			System.out.println("A media da nota é: "
			+ String.format("%.1f", media));
			
		sc.close();
	}

}
