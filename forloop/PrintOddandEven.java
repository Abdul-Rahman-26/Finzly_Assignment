package forloop;

import java.util.Scanner;

public class PrintOddandEven {
	public static void main(String[] args) {
		printoddandEven();
	}

	public static void printoddandEven() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the range");
		int n = sc.nextInt();
		System.out.println("Odd");
		odd(n);
		System.out.println("Even");
		even(n);
	}

	public static void odd(int n) {
		for (int i = 1; i <= n; i++) {
			if (i % 2 == 1) {
				System.out.println(i);
			}
		}
	}

	public static void even(int n) {
		for (int i = 1; i <= n; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
	}
}
