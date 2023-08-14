package whileloop;

public class SeriesOddpEvenn {
public static void main(String[] args) {
	seriesOddpEvenn();
}
public static void seriesOddpEvenn() {
	int i=1;
	while(i<=10) {
		if(i%2==0) {
		System.out.print(-i);
		}
		else {
			System.out.print(i);
		}
		i++;
	}
}
}
