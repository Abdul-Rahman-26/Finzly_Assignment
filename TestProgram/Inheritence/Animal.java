package TestProgram.Inheritence;

public class Animal {
	String name;
	int age;
	
	Animal(String name,int age){
		this.name=name;
		this.age=age;
		System.out.println("The "+name+" is "+age+" Old");
	}
	public void makeSound() {
		System.out.println("Animal make sound");
	}
}
