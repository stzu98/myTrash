package fundamentos.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MatrizAlunos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a quantidade de alunos: ");
		int a = sc.nextInt();
		System.out.print("Digite a quantidade de notas: ");
		int n = sc.nextInt();
		
		System.out.println();
		
		double[][] aluno = new double[a][n];
		
		for(int i = 0; i < aluno.length; i++) {
			
			for(int j = 0; j < aluno[i].length; j ++) {
				System.out.print("Nota: " + (i + 1) + " :");
				aluno[i][j] = sc.nextDouble();
			}
			
		}
		
		System.out.println();
		
		double ac1 = 0;
		double ac2 = 0;		
		
		for(int i = 0; i < aluno.length; i++) {
			ac1 = 0;
			
			for(int j = 0; j < aluno[i].length; j++) {
				ac1 += aluno[i][j];
				ac2 += aluno[i][j];
			}
			
			double media = ac1/n;
			System.out.printf("Média do " + (i + 1) + "a Aluno: %.1f \n", media);
		}
			System.out.printf("Média da turma : %.1f \n", ac2/(a * n));
			
			System.out.println();
			for(double[] notas : aluno) {
				System.out.println(Arrays.toString(notas));
			}
	}

}
