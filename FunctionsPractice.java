package myFirstProgram;
import java.util.Scanner;

public class FunctionsPractice {
	static void power(int x, int y) {
		System.out.println(Math.pow(x, y));
	}

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner value = new Scanner(System.in);
		System.out.println("Enter x: ");
		int x = value.nextInt();
		System.out.println("Enter y: ");
		int y = value.nextInt();
		power(x, y);
	}

}
