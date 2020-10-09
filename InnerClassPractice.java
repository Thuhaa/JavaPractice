package myFirstProgram;

class Outer
{
	int a;
	public void show()
	{
		System.out.println("Out display");
	}
	class Inner
	{
		public void display()
		{
			System.out.println("In Display");
		}
		class InnerInner{
			public void innerkabisa() {
				System.out.println("Inner Kabisa");
			}
		}
	}
}

public class InnerClassPractice {

	public static void main(String[] args) {
		Outer obj = new Outer();
		obj.show();
		Outer.Inner obj1 = obj.new Inner();
		obj1.display();
		Outer.Inner.InnerInner obj2 = obj1.new InnerInner();
		obj2.innerkabisa();
	}

}
