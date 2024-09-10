package Day6;

public class DayScholar extends Student {
	private int busNumber;
	private float distance;
	private double busAmount;
	private double TotalAmount;
	
	
	
	
	
	public DayScholar(int studentId, String studentName, String department, String gender, int category,
			double collegeFee,int busNumber, float distance) {
		super(studentId,studentName,department,gender,category,collegeFee);
		this.busNumber = busNumber;
		this.distance = distance;
	}
	//setter and getter
	//bus number
	public int getBusNumber() {
		return busNumber;
	}
	public void setBusNumber(int busNumber) {
		this.busNumber = busNumber;
	}
	//distance
	public float getDistance() {
		return distance;
	}
	public void setDistance(float distance) {
		this.distance = distance;
	}
	@Override
	public double calculateTotalFee() {
		if (distance>30 && distance<=40) {
			busAmount=28000;
		}
		else if(distance>20 && distance<=30) {
			busAmount=20000;
		}
		else if(distance>10 && distance<=20) {
			busAmount=12000;
		}
		return collegeFee+busAmount;
	}

	
}
