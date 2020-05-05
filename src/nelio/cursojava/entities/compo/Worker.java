package nelio.cursojava.entities.compo;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import nelio.cursojava.entities.compo.enums.WorkerLevel;

public class Worker {
	
	private Department department;
	private String name;
	private WorkerLevel level;
	private Double baseSalary;
		
	WorkerProgram w = new WorkerProgram();
	private List<HourContract> contracts = new ArrayList<>();
	private String data;
	
	public Worker() {
		
	}

	public Worker(Department department, String name, WorkerLevel level, Double baseSalary) {
		
		this.department = department;
		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
	}

	public Worker(String data){
		this.data = data;
	}
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public WorkerLevel getLevel() {
		return level;
	}



	public void setLevel(WorkerLevel level) {
		this.level = level;
	}


	public Department getDepartment() {
		return department;
	}


	public void setDepartment(Department department) {
		this.department = department;
	}


	public Double getBaseSalary() {
		return baseSalary;
	}


	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}
	
	
	public List<HourContract> getContracts() {
		return contracts;
	}

	void addContract(Date date, Double valuePerHour, Integer hours) {
		this.addContracts(new HourContract(date, valuePerHour, hours));
	}
	
	void addContracts(HourContract contract) {
		contracts.add(contract);
	}
	
	void removeContract(Date date, Double valuePerHour, Integer hours) {
		this.addContracts(new HourContract(date, valuePerHour, hours));
	}
	
	void removeContracts(HourContract contract) {
		contracts.add(contract);
	}
	
	public double income(int year, int month ) {
		
		double soma = baseSalary;
		
		Calendar cal = Calendar.getInstance();
		
		for(HourContract c : contracts) {
		
			cal.setTime(c.getDate());
			int c_year = cal.get(Calendar.YEAR);
			int c_month = 1+ cal.get(Calendar.MONTH);
			
			if(c_year == year && c_month == month) {
				soma += c.totalValue();
			}
			
		}
			return baseSalary = soma;
	}
	
	
	@Override
	public String toString() {
		return	"name: " + name 
				 + "\nDepartment: " + department.getName() 
				+ "\nIncome for " +String.format("%.2f", baseSalary);
	}
	
	
}
