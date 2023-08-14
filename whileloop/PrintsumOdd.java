package whileloop;

public class PrintsumOdd {
public static void main(String[] args) {
	printsumOdd();
}
public static void printsumOdd() {
	int sum = 0;
	int i=1;
	while(i<=50) {
		if(i%2==1) {
			sum += i;
		}
		i++;
	}
	System.out.println(sum);
	
}
}
