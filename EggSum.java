package Polymorphism;
import java.math.BigDecimal;
import java.util.Scanner;
	public class EggSum {
		private static Scanner sc = new Scanner(System.in);
	    public static void main(String[] args) {
	    	System.out.println("Enter the person no: ");
	    	int n = sc.nextInt();
	    	calculateEgg(n);
	    	//calEgg(n); --> out of range
	        
	    }
	    public static void calculateEgg(int n) {
	    	BigDecimal sum = new BigDecimal("1");
	        System.out.println("Total eggs: "+sum);
	        
	        for (long i = 2; i <= n; i++) {
	            sum = sum.add(sum.pow((int) i));
	            System.out.println("Total eggs: "+sum);
	        }
	    }
	    
	    public static void calEgg(int n) {
	    	long sum =1;
	    	System.out.println(sum);
	    	for(int i=2;i<=n;i++) {
	    		sum = (long)(Math.pow(sum, i))+sum;
	    		System.out.println(sum);
	    	}
	    }
	}