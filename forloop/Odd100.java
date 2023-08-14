package forloop;

public class Odd100 {
public static void main(String[] args) {
	odd100();
}
public static void odd100() {
	for(int i=1;i<=100;i++) {
		if(i%2==1) {
			System.out.println(i);
		}
	}
}
}
