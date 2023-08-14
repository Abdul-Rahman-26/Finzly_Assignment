package doWhileloop;

public class Print1_100even {
	public static void main(String[] args) {
		print1_100even() ;
	
	}
	public static void print1_100even() {
	int k = 1;
	do {
		if(k%2==0) {
	System.out.println(k);
		}
		k++;
	}while(k<=100);
	
}
}
