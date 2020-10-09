package myFirstProgram;
import java.util.Scanner;
public class Operatormethod {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner value = new Scanner(System.in);
		System.out.println("Enter x: ");
		double x = value.nextInt();
		double j = x<10?2:3;
		System.out.println(j);

	}

}
