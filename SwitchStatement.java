package myFirstProgram;
import java.util.Scanner;

public class SwitchStatement {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner value = new Scanner(System.in);
		System.out.println("Enter the value of x: ");
		int x = value.nextInt();
		switch(x) {
		case 1:
			System.out.println("One");
			break;
		case 2:
			System.out.println("Two");
			break;
		case 3:
			System.out.println("Three");
			break;
		case 4:
			System.out.println("Four");
			break;
		default:
			System.out.println("Not Available");
		}
	}

}
