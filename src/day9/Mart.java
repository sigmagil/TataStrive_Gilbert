package day9;

import java.util.Scanner;

public class Mart {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the products count");
		int size=sc.nextInt();
		sc.nextLine();
		Product[] product=new Product[size];
		
		
		
		if(size<=0) {
			System.out.println("nvalid count");
			return;
		}
		
		System.out.println("Enter Product details");
		
		for(int i=0;i<size;i++) {
			int id=sc.nextInt();
			sc.nextLine();
			String name=sc.nextLine();
			double price=sc.nextInt();
			product[i]=new Product(id, name, price);
		}
		for (Product p : product) {
			System.out.println(p);
        }
		
	}
	
}
