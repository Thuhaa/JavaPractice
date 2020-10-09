package myFirstProgram;
class Calculator
{
	public void add(int i, int j)
	{
		System.out.println(i+j);
	}
	public void add(double i, double j)  //Method Overloading
	{
		System.out.println(i+j);
	}
}
public class ObjectPractice {

	public static void main(String[] args) {
		Calculator obj = new Calculator();
		obj.add(3, 4);
		obj.add(3.5, 7.5);
		
	}

}
