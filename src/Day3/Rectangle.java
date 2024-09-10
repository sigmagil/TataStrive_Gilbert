package Day3;

public class Rectangle {
	private double length;
	private double width;
	private double area;
	
	Rectangle(){
		
	}
	Rectangle(double length,double width){
		this.length=length;
		this.width=width;
	}
	Rectangle(double length){
		this.length=length;
		this.width=1.0;
	}
	public double area() {
		return area=length*width;
	}
	@Override
	public String toString() {
		return "Length=" + length + ",\nWidth=" + width +"\nArea=" + area();
	}
	
	
}
