package TestProgram.Inheritence;

public class Elephant extends Animal{
	Elephant(String name,int age){
		super(name, age);
	}
	public  void makeSound() {
		System.out.println("The elephant trumpets");
	}

}
