package myFirstProgram;
import java.util.Scanner;

public class EvenOddChecker {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner value = new Scanner(System.in);
		int n;
		System.out.println("Enter the value of n");
		n = value.nextInt();
		if (n%2==1) {
			System.out.println("Odd");
		}
		else;
		if (n%2==0) {
			if(n>=2&&n<=5) {
				System.out.println("Weird");
			}
			else;
			if (n>=6&&n<=20) {
				System.out.println("Not Weird");
			}
			else;
			if(n>20&&n<=100) {
				System.out.println("Weird");
			}
		}
		else;
		if (n>100) {
			System.out.println("Out of Range");
		}

	}

}
