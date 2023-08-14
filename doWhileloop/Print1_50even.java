package doWhileloop;

public class Print1_50even {
	public static void main(String[] args) {
		print1_50even();
	}

	public static void print1_50even() {
		int m = 1;
		do {
			if(m%2==0) {
			System.out.println(m);
			}
			m++;
		}while(m<=50);
		
	}
}
