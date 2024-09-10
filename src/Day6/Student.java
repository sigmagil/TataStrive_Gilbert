package Day6;

public abstract class Student {
	 protected int studentId;
	 protected String studentName;
	 protected String department;
	 protected String gender;
	 protected int category;
	 protected double collegeFee;
	 
	 
	 
	 
	public Student() {
		super();
	}

	//constructor
	public Student(int studentId, String studentName, String department, String gender, int category,
			double collegeFee) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.department = department;
		this.gender = gender;
		this.category = category;
		this.collegeFee = collegeFee;
	}

	//setter and getter
	//student id
	public int getStudentId() {
		return studentId;
	}


	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	//student name
	public String getStudentName() {
		return studentName;
	}


	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	//department
	public String getDepartment() {
		return department;
	}


	public void setDepartment(String department) {
		this.department = department;
	}

	//gender
	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}

	//category
	public int getCategory() {
		return category;
	}


	public void setCategory(int category) {
		this.category = category;
	}

	//college fee
	public double getCollegeFee() {
		return collegeFee;
	}


	public void setCollegeFee(double collegeFee) {
		this.collegeFee = collegeFee;
	}
	
	//method total fees
	public abstract double calculateTotalFee();
	
	
	 
	 
}

