package Day6;

public class CustomerDetails implements BonusPoints,DoorDelivery {
	 private String customerName;
	 private int phoneNumber;
	 private String streetName;
	 private double billAmount;
	 private int distance;
	 
	 
	 
	public CustomerDetails() {
		super();
	}
	//setter and getter
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public int getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public double getBillAmount() {
		return billAmount;
	}
	public void setBillAmount(double billAmount) {
		this.billAmount = billAmount;
	}
	public int getDistance() {
		return distance;
	}
	public void setDistance(int distance) {
		this.distance = distance;
	}
	
	//constructor
	public CustomerDetails(String customerName, int phoneNumber, String streetName, double billAmount,
			int distance) {
		super();
		this.customerName = customerName;
		this.phoneNumber = phoneNumber;
		this.streetName = streetName;
		this.billAmount = billAmount;
		this.distance = distance;
	}
	@Override
	public double deliveryCharge() {
		// TODO Auto-generated method stub
		double deliveryCharges=0;
		if(distance>25) {
			deliveryCharges=distance*8;
		}
		else if(distance>15 && distance<25) {
			deliveryCharges=distance*5;
		}
		else if(distance<15) {
			deliveryCharges=distance*2;
		}
		return deliveryCharges;
	}
	@Override
	public double calculateBonusPoints() {
		// TODO Auto-generated method stub
		double bonusPoints=billAmount/10;
		return bonusPoints;
	}
	
	
	 
	 
}
