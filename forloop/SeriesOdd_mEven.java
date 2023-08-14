package forloop;

public class SeriesOdd_mEven {
public static void main(String[] args) {
	seriesOdd_mEven();
}
public static void seriesOdd_mEven() {
	for(int i=1;i<=10;i++) {
		if(i%2==1) {
			System.out.print(i);
		}
		else {
			System.out.print(-i);
		}
	}
}
}
