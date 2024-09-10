package day4;

public class EmployeeDemo {
	public static void main(String[] args) {
		Employee emp= new Manager("Gokul", 1001,60000, "IT");
		emp.displayDetails();
		
		emp = new Developer("Kamalesh", 1002,80000, "Java");
		
		emp.displayDetails();
	}

}
