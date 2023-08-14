package whileloop;

public class PrintsumEven {
	public static void main(String[] args) {
		printsumEven();
	}
	public static void printsumEven() {
		int sum = 0;
		int i=1;
		while(i<=50) {
			if(i%2==0) {
				sum += i;
			}
			i++;
		}
		System.out.println(sum);
		
	}
}
