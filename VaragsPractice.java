package myFirstProgram;
class Addition{
	public void add(int ... i) {
		int sum = 0;
		for (int k : i) {
			sum = sum + k;
		}
		System.out.println(sum);
	}
}

public class VaragsPractice {

	public static void main(String[] args) {
		Addition obj = new Addition();
		obj.add(1,2,3,4,5,6,7,8,9,10);

	}

}
