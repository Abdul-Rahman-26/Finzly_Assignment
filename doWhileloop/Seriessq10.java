package doWhileloop;

public class Seriessq10 {
public static void main(String[] args) {
	seriessq10();
}
public static void seriessq10() {

	int b = 1;
	do {
		System.out.print(b+" ");
		b = b*10;
	}while(b<=1000);
	System.out.println();
}
}
