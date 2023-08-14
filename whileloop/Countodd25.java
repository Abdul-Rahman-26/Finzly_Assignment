package whileloop;

public class Countodd25 {
	public static void main(String[] args) {
		countOdd25();
	}
	public static void countOdd25() {
		int i=1,c=0;
		while(i<=25) {
			if(i%2==1) {
			c++;
		}
			i++;
		}
		System.out.println(c);
	}
}
