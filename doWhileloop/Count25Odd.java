package doWhileloop;

public class Count25Odd {
public static void main(String[] args) {
	count25Odd();
}
public static void count25Odd() {
	int w = 1;
	int oddSumSec = 0;
	do {
		if(w%2!=0) {
			oddSumSec +=1;
		}
		w++;
	}while(w<=25);
	System.out.println("Odd Count : "+oddSumSec);
}
}
