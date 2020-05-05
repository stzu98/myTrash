package nelio.cursojava.entities;

import java.util.Scanner;

public class RentProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		Rent rent = new Rent();
		
		System.out.print("How many rooms will be rented? ");
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			System.out.println("Rent #" + (i + 1));
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int room = sc.nextInt();
			
			rent.add(name, email, room);
		}
		
		
		for(int i = 0; i < 10; i++) {
			
			if(rent.vetor[i] != null) {
			System.out.println(i + "# " + rent.vetor[i]);
		}
			
		}
		
		sc.close();
	}

}
