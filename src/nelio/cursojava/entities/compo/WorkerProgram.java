package nelio.cursojava.entities.compo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import nelio.cursojava.entities.compo.enums.WorkerLevel;

public class WorkerProgram {

	@SuppressWarnings("unused")
	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
				
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Enter department's name: ");
		String nameD = sc.nextLine();
		System.out.println("Enter worker data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Level: ");
		String level = sc.nextLine();
		level = level.toUpperCase();
		System.out.print("Base salary: ");
		double baseSalary = sc.nextDouble();
		
		
		Worker worker = new Worker(new Department(nameD), name, WorkerLevel.valueOf(level), baseSalary);
		
		System.out.println();
		
		System.out.print("How many contracts to this worker? ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.println("Enter contract #" + (i + 1) + " data:");
			System.out.print("Date (DD/MM/YYYY): ");
			Date date = sdf.parse(sc.next());
			System.out.print("Value per hour: ");
			double valuePerHour = sc.nextDouble();
			System.out.print("Duration: ");
			int hours = sc.nextInt();
			
			worker.addContract(date, valuePerHour, hours);
		}
		
		System.out.println();
		System.out.print("Enter month and year to calculate income (MM/YYYY): ");
		String monthYear = sc.next();
		
		int month = Integer.parseInt(monthYear.substring(0,2));
		int year = Integer.parseInt(monthYear.substring(3));
		
		worker.income(year, month);
		
		System.out.println(worker);
		
		sc.close();
	}

}
