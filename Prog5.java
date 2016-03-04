import java.util.Scanner;

public class Prog5 {
	public static void main(String args[]) {	
		Scanner i = new Scanner(System.in);
		final double COOKIE_CAL = 300 / (40/10);
		System.out.println("How many cookies did you eat?");
		double cookieQuantity = i.nextDouble();
		double cookieTotal = COOKIE_CAL * cookieQuantity;
		System.out.printf("You ate %.0f calories worth of cookie.", cookieTotal);
	}
}