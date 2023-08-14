package doWhileloop;

public class Seriessq {
public static void main(String[] args) {
	seriessq();
}
public static void seriessq() {
	int g = 1;
	do {
		System.out.print(g*g+" ");
		g++;
	}while(g<=10);
	System.out.println();
}
}
