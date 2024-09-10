package Day6;

import java.util.Scanner;

public class UserInterface2 {
	public static void main(String[] args) {
		
		//cd.calculateBonusPoints();
		//cd.deliveryCharge();
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter the customer name");
		String customerName=sc.nextLine();
		System.out.println(" Enter the phone number");
		int phonenumber=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the street name");
		String streetname=sc.nextLine();
		System.out.println("Enter the bill amount");
		double billamount=sc.nextInt();
		System.out.println("Enter the distance");
		int distance=sc.nextInt();
		
		CustomerDetails cd=new CustomerDetails(customerName,phonenumber,streetname,billamount,distance);
		
		System.out.println(" Customer name:" + cd.getCustomerName());
		System.out.println(" Phone number:" + cd.getPhoneNumber());
		System.out.println(" Street name:" + cd.getStreetName());
		System.out.println(" Bonus points: " + cd.calculateBonusPoints());
		System.out.println(" Delivery charge:" + cd.deliveryCharge());
	}
}
