package Day3;

public class Person {
	private String name;
	private int age;
	
	Person(String name,int age){
		this.name=name;
		this.age=age;
		if(age<0) {
			System.out.println("invalid number");
			 age=0;
		}
		else {}
	}
}
