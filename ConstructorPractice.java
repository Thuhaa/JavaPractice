package myFirstProgram;


class Calc
{
	int num1;
	int num2;
	String that;
	public Calc(int i, int j)
	{
		num1 = 0;
		num2 = 6;
	}
	public Calc(int i, int j, String name)
	{
		num1 = 4;
		num2 = 7;
		that = "Hello";
		
	}
}

public class ConstructorPractice {

	public static void main(String[] args) {
		Calc obj = new Calc(1,2,"Thuha");
		Calc obj1 = new Calc(4,5);
		System.out.println(obj1.num2);
		System.out.println(obj.num2);
		System.out.println(obj.that);


	}

}
