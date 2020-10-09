package myFirstProgram;

class Employer{
	int id;
	int salary;
	static String ceo;
	public void show() {
		System.out.println(id + ": "+salary+": "+ceo);
	}
}


public class StaticPractice {

	public static void main(String[] args) {
		Employer joseph = new Employer();
		joseph.id = 002;
		joseph.salary = 4000000;
		joseph.ceo = "Thuha";
		Employer thuha = new Employer();
		thuha.id = 001;
		thuha.salary = 5000000;
		thuha.ceo = "Himself";
		thuha.ceo = "Joseph Thuha Maina";
		
		joseph.show();
		thuha.show();
	}

}
