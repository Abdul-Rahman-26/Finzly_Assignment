package whileloop;

public class Print1_100Even {
	public static void main(String[] args) {
		print1_100even();
	}

	public static void print1_100even() {
		int i = 1;
		while (i <= 100) {
			if (i % 2 == 0) {
				System.out.println(i + " ");
				
			}
			i++;
		}
	}
}
