package whileloop;
import java.util.Scanner;
public class PrintoddandEven {
	static int i=1;

public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Range");
	int n = sc.nextInt();
	System.out.println("Odd num:");
	printOddnum(n,i);
	System.out.println("Even num:");
	printEvennum(n,i);
	
}
public static void printOddnum(int n,int i) {
	while(i<=n) {
		if(i%2==1) {
			System.out.println(i);
		}
		i++;}
}
public static void printEvennum(int n,int i) {
	while(i<=n) {
		if(i%2==0) {
			System.out.println(i);
		}
		i++;}
}
}
