package forloop;
import java.util.Scanner;

public class Seriesrev {
    static boolean isIncreasing = true;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        for (int i = 1; i >= 1; ) {
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
    }
}
