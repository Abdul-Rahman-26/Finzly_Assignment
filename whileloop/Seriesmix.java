package whileloop;

public class Seriesmix {
public static void main(String[] args) {
	seriesmix();
}
public static void seriesmix() {
	int c=0;
	int i=1;
	while(i<10) {
		c+=i;
		System.out.print(c+" ");
		i++;
	}
}
}
