package fundamentos.arrays;

import java.util.Scanner;

public class MediaAluno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
				
		System.out.print("Digite o nº de notas: ");
		int n = sc.nextInt();
		
		double[] notas = new double[n];
		System.out.println();
		
		System.out.println("Digite as notas: ");
		
		for(int i = 0; i < notas.length; i++) {
			
			notas[i] = sc.nextDouble();
		}
		
		double soma = 0.0;
		
		for(double acumulador : notas) {
			
			soma += acumulador;
		}
		System.out.println();
		double media = soma / notas.length;
		
		System.out.printf("Valor da média %.1f " , media);
		
		sc.close();
	}

}
