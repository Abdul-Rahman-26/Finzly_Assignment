package whileloop;

public class Fibannaci {
public static void main(String[] args) {
	fibannaci();
}
public static void fibannaci() {
	int f=0,s=1,next=0;
	int i=1;
	while(i<10) {
		System.out.print(f+" ");
		next= f+s;
		f=s;
		s=next;
		i++;
	}
}
}
