package nelio.cursojava.entities;

import java.util.ArrayList;
import java.util.List;

public class Employee {

	private Integer id;
	private String name;
	private Double salary;
	
		
	public Employee() {
	}
	
	public Employee(Integer id, String name, Double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
	public List<Employee> list = new ArrayList<>();
	
	public void addLista(Integer id, String name, Double salary) {
		this.addListas(new Employee(id, name, salary));
	}
	
	void addListas(Employee list) {
		this.list.add(list);
	}
	
	public void increaseSalary(double porcentagem) {
		salary += salary * porcentagem / 100;
	}

	@Override
	public String toString() {
		return id + ", " + name + ", " + salary;
	}
	
	
}
