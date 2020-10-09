package myFirstProgram;

class OuterClass{
	public void show() {
		System.out.println("Outer Class");
	}
	static class Inner{
		public void display() {
			System.out.println("Inner Class");
		}
	}
}

public class StaticInnerClassPractice {

	public static void main(String[] args) {
		OuterClass obj = new OuterClass();
		OuterClass.Inner obj1 = new OuterClass.Inner();
		obj1.display();
		obj.show();

	}

}
