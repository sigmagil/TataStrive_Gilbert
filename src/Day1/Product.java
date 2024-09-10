package Day1;

public class Product {
	private String name;
	private double price;
	private int quantity;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	void printProductDetails() {
		System.out.println("Product Name: "+ name +"\n" + "Product Price: " + price + "\nProduct Quantity: " + quantity);
	}

}
/* package Day1;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Product p= new Product();
		Scanner sc=new Scanner(System.in);
		/*p.setName("laptop");
		p.setPrice(50000);
		p.setQuantity(1);
		
		System.out.println("Enter a Product name: ");
		String name=sc.nextLine();
		p.setName(name);
		
		System.out.println("Enter a Product price: ");
		double price=sc.nextInt();
		p.setPrice(price);
		
		System.out.println("Enter a Product quantity: ");
		int quantity=sc.nextInt();
		p.setQuantity(quantity);
		
		p.printProductDetails();
	}
}*/
