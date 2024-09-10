package day9;

public class Product {
	public int productid;
	public String productName;
	public double price;
	
	public Product() {
	
	}

	public Product(int productid, String productName, double price) {
		this.productid = productid;
		this.productName = productName;
		this.price = price;
	}

	
	public int getProductid() {
		return productid;
	}

	public void setProductid(int productid) {
		this.productid = productid;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "productid=" + productid + ", productName=" + productName + ", price=" + price;
	}
	
	
	
	
	
	
}
