package fundamentos;

import java.util.Locale;

import java.util.Scanner;

public class Conver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o sal�rio: ");
		String salario1 = sc.nextLine();
		
		System.out.print("Digite o sal�rio: ");
		String salario2 = sc.nextLine();
		
		System.out.print("Digite o sal�rio: ");
		String salario3 = sc.nextLine();
		
		Double salary1 = Double.parseDouble(salario1);
		Double salary2 = Double.parseDouble(salario2);
		Double salary3 = Double.parseDouble(salario3);
		
		System.out.println();
		
		System.out.println(String.format("A m�dia salarial � "
				+ "de: $%.2f", (salary1 + salary2 + salary3) / 3));	
		
		sc.close();
	}

}
