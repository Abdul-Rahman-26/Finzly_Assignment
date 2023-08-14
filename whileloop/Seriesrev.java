package whileloop;
import java.util.Scanner;
public class Seriesrev {
	static boolean isIncreasing = true;
	

public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int n = sc.nextInt();
    
    int i = 1;
    seriesrev(n,i);
}
public static void seriesrev(int n,int i) {
	while (i >= 1) {
        System.out.print(i + " ");
        
        if (i == n) {
            isIncreasing = false;
        }
        
        if (isIncreasing) {
            i++;
        } else {
            i--;
        }
    }

}}
