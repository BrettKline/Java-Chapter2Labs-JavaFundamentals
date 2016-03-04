import java.util.Scanner;

public class Prog15 {
	public static void main(String args[]) {	
		Scanner i = new Scanner(System.in);
		final double BASE_SUGAR = 1.5;
		final double BASE_BUTTER = 1;
		final double BASE_FLOUR = 2.75;
		final double BASE_COOKIES = 48;
		
		System.out.println("How many cookies do you want to make?");
		double cookieMultiplier = i.nextDouble() / BASE_COOKIES;
		System.out.printf("Your batch of cookies will require %.1f cups of sugar, %.1f cups of butter, and %.1f cups of flour.", cookieMultiplier * BASE_SUGAR, cookieMultiplier * BASE_BUTTER, cookieMultiplier * BASE_FLOUR);
	}
}