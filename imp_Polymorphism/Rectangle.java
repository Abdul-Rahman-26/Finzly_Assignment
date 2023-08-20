package imp_Polymorphism;

public class Rectangle implements Shape{
	
	private float length;
	private float breadth;
	
	Rectangle(float length, float breadth){
		this.length = length;
		this.breadth = breadth;
	}

	@Override
	public String calculateArea() {
		return ("The Area of a Rectangle is : "+(length * breadth));
		
	}

	@Override
	public String calculatePerimeter() {
		return ("The Perimeter of Rectangle is : "+(2*(length+breadth)));
		
	}
	
	@Override
	public String getName() {
		return "Rectangle";
	}

}
