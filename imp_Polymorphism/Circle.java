package imp_Polymorphism;

public class Circle implements Shape{
	private float radius;
	
	Circle(float radius){
		this.radius = radius;		
	}

	@Override
	public String calculateArea() {
		return ("The Area of a Circle is : "+(3.14*radius*radius));
	}

	@Override
	public String calculatePerimeter() {
		return ("The Perimeter of a Circle is : "+(2*3.14*radius));
	}
	
	@Override
	public String getName() {
		return "Circle";
	}
}
