package forloop;

public class SumOdd50 {
	public static void main(String[] args) {
		sumOdd50();
	}
	public static void sumOdd50() {
		int c=0;
		for(int i=1;i<=50;i++) {
			if(i%2==1) {
				c+=i;
			}
		}
		System.out.println(c);
	}
}
