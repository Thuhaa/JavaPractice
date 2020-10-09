package myFirstProgram;

class A{
	int i;
	public A() {
		System.out.println("In A");
	}
	public A(int i) {
		System.out.println("In A Int");
	}
}

class B extends A{
	public B() {
		System.out.println("In B");
	}
	public B(int i) {
		System.out.println("In B Int");
	}
}

public class SuperMethodPractice {

	public static void main(String[] args) {
	}
	A obj1 = new A(6);
}
