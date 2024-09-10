package day4;

public class Manager extends Employee{
	String department;
	

	public Manager() {
	}

	public Manager(String name, int id, double salary,String department) {
		super(name,id,salary);
		
		this.department = department;
		
	}

	
	
	
	@Override
	public void displayDetails() {
		super.displayDetails();
		System.out.println("Departement:"+department);
	}

	
	
	
}
