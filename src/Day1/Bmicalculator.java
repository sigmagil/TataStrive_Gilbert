package Day1;

import java.util.Scanner;

public class Bmicalculator {
	public static void main(String[] args) {
		Scanner hc= new Scanner(System.in);
		
		System.out.println("Enter Your Weight: ");
		double Weight=hc.nextInt();
		
		System.out.println("Enter Your Height: ");
		double height=hc.nextInt();	
		
		double BMI=Weight/((height/100)*(height/100));
		//System.out.println(BMI);
		
		if (BMI>=25)
		{
			System.out.printf("%.2f\n",BMI);
			System.out.println("Your are overweight");
			double a=BMI-25;
			System.out.printf("you must reduce %.2f BMI of weight to be normal",a);
			
		}
		else if(BMI<25 && BMI>=18.5) {
			System.out.printf("%.2f\n",BMI);
			System.out.println("your fit and healthy");
		}
		else if(BMI<18.5) {
			System.out.printf("%.2f\n",BMI);
			System.out.println("your are underweight");
			double b=20-BMI;
			System.out.printf("you must gain %.2f BMI of weight to be normal",b);
			
		}
	}

}
