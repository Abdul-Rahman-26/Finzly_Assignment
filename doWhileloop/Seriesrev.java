package doWhileloop;

public class Seriesrev {
public static void main(String[] args) {
	seriesrev();
}
public static void seriesrev() {
	int dd = 1;
	int te = 4;
	do {
		if(dd <= 5) {
			System.out.print(dd+" ");
		}
		if(dd>5) {
			System.out.print(te+" ");
			te--;
		}
		dd++;
	}while(dd<10);
	System.out.println();

}
}
