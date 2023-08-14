package forloop;

public class Count1_25Odd {
	public static void main(String[] args) {
		count1_25Odd();
	}
	public static void count1_25Odd() {
		int c=0;
		for(int i=1;i<=25;i++) {
			if(i%2==1) {
				c+=1;
			}
		}
		System.out.println(c);
	}
}
