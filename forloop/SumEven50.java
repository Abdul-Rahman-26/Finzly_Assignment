package forloop;

public class SumEven50 {
	public static void main(String[] args) {
		sumEven50();
	}
	public static void sumEven50() {
		int c=0;
		for(int i=1;i<=50;i++) {
			if(i%2==0) {
				c+=i;
			}
		}
		System.out.println(c);
	}
}
