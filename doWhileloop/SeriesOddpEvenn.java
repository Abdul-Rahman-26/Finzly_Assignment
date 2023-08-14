package doWhileloop;

public class SeriesOddpEvenn {
public static void main(String[] args) {
	seriesOddpEvenn();
}
public static void seriesOddpEvenn() {
	int z = 1;
	do {
		if(z%2 == 0) {
			
			System.out.print(-z+" ");
		}else{
			System.out.print(z+" ");
		}
		z++;
	}while(z<=10);
	System.out.println();
}
}
