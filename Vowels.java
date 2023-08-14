package train1;
import java.util.Scanner;
public class Vowels {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your string:");
		String s = sc.nextLine();
		s=s.toUpperCase();
		checkVowel(s);
		check(s);
	}
	//using Build-in
	public static void checkVowel(String s) {
		boolean allVowelsPresent = true;
        String vowels = "AEIOU";

        for (char vowel : vowels.toCharArray()) {
            if (s.indexOf(vowel) == -1) {
                allVowelsPresent = false;
                break;
            }
        }
        if (allVowelsPresent) {
            System.out.println("All are present");
        } else {
            System.out.println("Not missing");
        }
	}
	//Not using build-in
	public static void check(String s) {
		int a =0,e=0,i=0,u=0,o=0;
		for(int j=0;j<s.length();j++) {
		if(s.charAt(j)== 'A') {
			 a=1;
		}
		if(s.charAt(j)== 'E') {
			e=1;
		}
		if(s.charAt(j)== 'I') {
			i=1;
		}
		if(s.charAt(j)== 'O') {
			o=1;
		}
		if(s.charAt(j)== 'U') {
			u=1;
		}}
		if(a*e*i*o*u==1) {
			System.out.print("All are present");
		}
		else {
			System.out.print("Not present");
		}
	}
		
}
