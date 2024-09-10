package Day3;

public class Car {
	private String make;
	private String model;
	private int year;

	Car() {

	}

	Car(String make, String model, int year) {
		this.make = make;
		this.model = model;
		this.year = year;

	}

	public String displayDetails() {
		return "Make:" + make + "\nModel:" + model + "\nYear:" + year;
	}

	@Override
	public String toString() {
		return displayDetails();
	}

}
