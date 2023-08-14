package doWhileloop;

public class Count25Even {
public static void main(String[] args) {
	count25Even();
}
public static void count25Even() {
	int v = 1;
	int evenSumSec = 0;
	do {
		if(v%2==0) {
			evenSumSec +=1;
		}
		v++;
	}while(v<=25);
	System.out.println("Even Count : "+ evenSumSec);
}
}
