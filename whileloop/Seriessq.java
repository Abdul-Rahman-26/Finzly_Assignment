package whileloop;

public class Seriessq {
	public static void main(String[] args) {
		seriessq();
	}
	public static void seriessq() {
		int i=1;
		while(i<=10) {
			int sq = i*i;
			System.out.print(sq+" ");
			i++;
		}
	}

}
