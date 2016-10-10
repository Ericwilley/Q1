package Main;

public class Triangle extends GeometricObject{
	
	private double side1=1.0;
	private double side2=1.0;
	private double side3=1.0;
	
	public double getArea() {
		final double p=getPerimeter()/2;
		final double area=Math.sqrt(p*(p-side1)*(p-side2)*(p-side3));
		return area;
	}

	public double getPerimeter() {
		final double perimeter=side1+side2+side3;
		return perimeter;
	}
	public Triangle (double sideA, double sideB, double sideC){
		side1=sideA;
		side2=sideB;
		side3=sideC;
	}
	public Triangle (){
	}

	public double getSide1() {
		return side1;
	}
	public double getSide2() {
		return side2;
	}
	public double getSide3() {
		return side3;
	}
	public String toString() {
		double p=getPerimeter();
		double a=getArea();
		return "The perimeter of your triangle is "+p+"and the area of your triangle is "+a;
		
				
	}
}