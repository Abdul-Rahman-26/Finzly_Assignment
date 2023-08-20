package imp_Polymorphism;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		
		ArrayList<Shape> array = new ArrayList<>(); 
		
		Circle c = new Circle(4);
		Rectangle r = new Rectangle(3,4);
		Triangle t = new Triangle(3,4,5);
		
		array.add(c);
		array.add(r);
		array.add(t);
		
		for(Shape shape : array) {
			System.out.println(shape.getName());
			System.out.println(shape.calculateArea());
			System.out.println(shape.calculatePerimeter());
			
		}
		
		
	}
}
