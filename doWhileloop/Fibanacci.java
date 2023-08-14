package doWhileloop;

public class Fibanacci {
public static void main(String[] args) {
	fibanacci();
}
public static void fibanacci() {
	int count = 0;
	int firstTerm = 0;
	int secTerm = 1;
	int nextTerm = 0;
	 	
	do {
		System.out.print(firstTerm+" ");
		nextTerm = firstTerm + secTerm;
		firstTerm = secTerm;
		secTerm = nextTerm;
		count++;
	
	}while(count<9);
	System.out.println();
	
}
}
