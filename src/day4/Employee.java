package day4;

public class Employee {
	private String name;
	int id;
	double salary;
	
	
	public Employee() {
	}


	public Employee(String name, int id, double salary) {
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	
	
	public void displayDetails(){
		System.out.println("Name: " + name + "\nId: " + id + "\nSalary: " + salary);
	}
	

}
