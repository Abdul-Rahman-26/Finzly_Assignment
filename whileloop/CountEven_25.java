package whileloop;

public class CountEven_25 {
	public static void main(String[] args) {
		countEven25();
	}
	public static void countEven25() {
		int i=1,c=0;
		while(i<=25) {
			if(i%2==0) {
			c++;
		}
			i++;
		}
		System.out.println(c);
	}
}
