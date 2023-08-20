package imp_Polymorphism;

public class Triangle implements Shape{
	private float length;
	private float breadth;
	private float height;
	
	Triangle(float length, float breadth, float height){
		this.length = length;
		this.breadth = breadth;
		this.height = height;
	}

	@Override
	public String calculateArea() {
		return ("The Area of the Traingle is : "+(0.5*breadth*height));		
	}

	@Override
	public String calculatePerimeter() {
		return ("The Perimeter of a Traingle is "+(length * breadth * height));		
	}

	@Override
	public String getName() {
		return "Triangle";
	}
}
