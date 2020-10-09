package myFirstProgram;

class Shapes{
	int sides;
	String name;
	String shapes;
	public Shapes(int sides, String name) {
		this.sides = sides;
		this.name = name;
		}
}

public class ShapesTrial {

	public static void main(String[] args) {
		Shapes triangle = new Shapes(3, "Triangle");
		Shapes rectangle = new Shapes(4, "Rectangle");
		System.out.println("A "+triangle.name+" has "+triangle.sides+" sides");
		System.out.println("A "+rectangle.name+" has "+rectangle.sides+" sides");
	}

}
