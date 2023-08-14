package doWhileloop;

public class PrintOddEven {
public static void main(String[] args) {
	printOddEven();
}
public static void printOddEven() {
	int r = 0;
	do {
		if(r%2==0) {
			System.out.println(r+ " even");
		}else {
			System.out.println(r + " odd");
		}
		r++;
	}while(r<=100);
	
}
}
