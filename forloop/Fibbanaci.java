package forloop;

public class Fibbanaci {
public static void main(String[] args) {
	fibannaci();
}
public static void fibannaci() {
	int f=0,s=1,next;
	for(int i=0;i<9;i++) {
		System.out.print(f+" ");
		next=f+s;
		f=s;
		s=next;
	}
}
}
