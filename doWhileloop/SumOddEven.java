package doWhileloop;

public class SumOddEven {
public static void main(String[] args) {
	sumOddEven();
}
public static void sumOddEven() {
	int q = 0;
	int oddSum = 0;
	int evenSum = 0;
	do {
		if(q%2==0) {
			evenSum +=q;
		}else {
			oddSum +=q;
		}
		q++;
	}while(q<= 50);
	System.out.println("Odd Sum : "+oddSum+" Even Sum : "+ evenSum);
	
}
}
