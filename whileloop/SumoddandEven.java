package whileloop;
import java.util.Scanner;
public class SumoddandEven {
public static void main(String[] args) {
	sumOdd();
	sumeven();
}
public static void sumOdd() {
	int i=1,sum=0;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the range");
	int n= sc.nextInt();
	while(i<=n) {
		if(i%2==1) {
			sum += i;
		}
		i++;
	}
	System.out.println(sum);
}
public static void sumeven() {
	int i=1,sum=0;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the range");
	int n= sc.nextInt();
	while(i<=n) {
		if(i%2==0) {
			sum += i;
		}
		i++;
	}
	System.out.println(sum);
}

}
