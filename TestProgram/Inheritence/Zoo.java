package TestProgram.Inheritence;

public class Zoo {
	public static void main(String args[]) {
		Animal zoo = new Animal("Animal", 5);
		zoo.makeSound();
		Lion l = new Lion("Lion", 1);
		l.makeSound();
		Elephant e = new Elephant("Elephant",2);
		e.makeSound();
		Giraffe g = new Giraffe("Giraffe",3);
		g.makeSound();
	}
}
