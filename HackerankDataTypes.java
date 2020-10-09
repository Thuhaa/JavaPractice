package myFirstProgram;
import java.util.Scanner;
public class HackerankDataTypes {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner value = new Scanner(System.in);
		int i;
		double d;
		String s;
		System.out.println("Enter the interger");
		i = value.nextInt();
		System.out.println("Enter the double");
		d = value.nextDouble();
		System.out.println("Enter the string");
		value.nextLine();
		s = value.nextLine();
		System.out.println("String is: "+s);
		System.out.println("Double is: "+d);
		System.out.println("Integer is: "+i);
	}

}
