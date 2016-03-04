import java.util.Scanner;

public class Prog10 {
	public static void main(String args[]) {	
		Scanner i = new Scanner(System.in);
		System.out.println("Input three test scores.");
		double test1 = i.nextDouble();
		double test2 = i.nextDouble();
		double test3 = i.nextDouble();
		double testAvg = (test1 + test2 + test3) / 3;
		System.out.printf("Your scores were %.2f, %.2f, and %.2f, making a %.2f average.", test1, test2, test3, testAvg);
	}
}