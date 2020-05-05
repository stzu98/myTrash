package nelio.cursojava.entities.compo.exefixa;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import nelio.cursojava.entities.compo.exefixa.enums.OrderStatus;

public class Program {

	@SuppressWarnings("unused")
	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter cliente data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();
		System.out.print("Birth date (DD/MM/YYYY): ");
		Date birthDate = sdf.parse(sc.next());
		Date dateMoment = new Date();
		System.out.println("Enter order data: ");
		System.out.print("Status: ");
		sc.nextLine();
		String status = sc.nextLine();
		status = status.toUpperCase();
		Order order = new Order(new Client(name, email, birthDate), dateMoment, OrderStatus.valueOf(status));
		
		System.out.print("How many items to this order? ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			
		System.out.println("Enter #1 item data:");
		System.out.print("Product name: ");
		sc.nextLine();
		String nameProduct = sc.nextLine();
		System.out.print("Product price: ");
		double price = sc.nextDouble();
		System.out.print("Quantity: ");
		int quantity = sc.nextInt();
		
		order.addLista(nameProduct, price, quantity);
		
		}
			System.out.println();
			
			System.out.println("ORDER SUMMARY: ");
			System.out.println("Order moment: " + sdf2.format(order.getMoment()));
			System.out.println("Order status: " + order.getStatus());
			System.out.println("Client: " + order.getClient().getName() + " (" + sdf.format(order.getClient().getBirthDate()) + ") - " + order.getClient().getEmail());
			System.out.println();
			System.out.println("Order items:");
			
			for(OrderItem obj : order.getItens()) {
				System.out.println(obj.getProduct().getName() + ", " + String.format("%.2f",obj.getPrice()) + ", Quantity: " + obj.getQuantity() + ", Subtotal: " 
			+ String.format("%.2f", obj.subTotal()));
			}
			
			System.out.println();
			System.out.println("Total: " + String.format("%.2f", order.total()));
		
		sc.close();
	}

}
