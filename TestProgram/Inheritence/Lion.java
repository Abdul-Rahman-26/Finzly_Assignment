package TestProgram.Inheritence;

public class Lion extends Animal {
	Lion(String name,int age){
	super(name, age);
	}
	public  void makeSound() {
		System.out.println("The Lion roars");
	}
}
