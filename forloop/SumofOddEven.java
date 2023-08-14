package forloop;

import java.util.Scanner;

public class SumofOddEven {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the range:");
		int n = sc.nextInt();
		System.out.println("Sum of Odd");
		sumofOdd(n);
		System.out.println("Sum of Even");
		sumofEven(n);
	}
	public static void sumofEven(int n) {
		int sum =0;
	
		for(int i=1;i<=n;i++) {
			if(i%2==0) {
				sum+=i;
			}
		}
		System.out.println(sum);
	}
	public static void sumofOdd(int n) {
		int sum =0;
		for(int i=1;i<=n;i++) {
			if(i%2==1) {
				sum+=i;
			}
		}
		System.out.println(sum);
	}
}
