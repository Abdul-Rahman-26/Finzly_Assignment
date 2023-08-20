package imp_Interfaces;
import java.util.Scanner;
public class Play {
	private static Scanner sc  = new Scanner(System.in);
	public static void main(String[] args) {
		
		Car c  = new Car();
		Motorcycle m = new Motorcycle();
		
		System.out.println("Select the Vechile : \n1 Car\n2 Motorcycle");
		int n = sc.nextInt();
		switch(n) {
		case 1:
			System.out.println("Congrats!!! You selected Car");
			play(c);
			break;
		case 2:
			System.out.println("Congrats!!! You selected Motorcycle");
			play(m);
			break;
		default:
			System.out.println("Oops, Enter the valid");
		}
	}
	
	public static void play(Vehicle vehicle) {
		boolean b = true;
		while(b) {
		System.out.println("Select your option:\n1 Start\n2 Accelerate\n3 Brake\n4 Stop");
		int n = sc.nextInt();
		switch(n) {
		case 1:
			vehicle.start();
			break;
		case 2:
			vehicle.accelerate();
			break;
		case 3:
			vehicle.brake();
			break;
		case 4:
			System.out.println("Stopped");
			b = false;
			break;
		}
		}
	}
}
