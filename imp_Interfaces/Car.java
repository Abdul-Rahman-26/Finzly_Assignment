package imp_Interfaces;

public class Car implements Vehicle{

	@Override
	public void start() {
		System.out.println("Car engine Started");
	}

	@Override
	public void accelerate() {
		System.out.println("Car now accelerating");
	}

	@Override
	public void brake() {
		System.out.println("Braking");
	}

}
