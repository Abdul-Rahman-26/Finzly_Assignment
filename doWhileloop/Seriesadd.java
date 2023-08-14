package doWhileloop;

public class Seriesadd {
public static void main(String[] args) {
	seriesadd();
}
public static void seriesadd() {
	int c = 1;
	int tem = 1;
	do {
		System.out.print(c+" ");
		tem++;
		c += tem;
	}while(c <=45);
	System.out.println();
}
}
