package forloop;

public class Even100 {
	public static void main(String[] args) {
		even100();
	}
	public static void even100() {
		for(int i=1;i<=100;i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
	}

}
