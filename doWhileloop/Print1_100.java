package doWhileloop;

public class Print1_100 {
public static void main(String[] args) {
	print1_100();
}
public static void print1_100() {
	int k = 1;
	do {
		if(k%2==1) {
	System.out.println(k);
		}
		k++;
	}while(k<100);
	
}
}
