package day4;

public class Developer extends Employee{
	String programmingLanguage;
	

	public Developer() {
		super();
	}



	public  Developer(String name, int id, double salary,String programmingLanguage) {
		super(name,id,salary);
		this.programmingLanguage = programmingLanguage;
	}



	@Override
	public void displayDetails() {
		super.displayDetails();
		System.out.println("Programming:"+programmingLanguage);
	}
	
	
	
	
}
