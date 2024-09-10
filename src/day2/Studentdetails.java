package day2;

public class Studentdetails {
	private static int id;
	private static int nextid=0;
	private String name;
	private static String course;
	private static String centre;
	
	
	//constructor
	Studentdetails(){
		
	}
	
	Studentdetails(String name) {
		this.name = name;
		id=++nextid;
		
	}

	//static
	static{
		course="java";
		 centre="chennai";
		
		
	}
	/*
	//id
	public int getId() {
		return id;
	}

	//name
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	//course
	public String getCourse() {
		return course;
	}
	//centre
	public String getCentre() {
		return centre;
	}
*/
@Override
	public String toString() {
		return ("id ="+id+"\nname ="+name+"\ncourse ="+course+"\ncentre ="+centre);
	}
	
	
	

}
