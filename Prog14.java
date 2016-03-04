import java.util.Scanner;

public class Prog14 {
	public static void main(String args[]) {	
		Scanner i = new Scanner(System.in);
		final int NUM_SHARES = 1000;
		final double STOCK_PRICE = 25.5;
		final double COMMISSION = .02;
		
		System.out.printf("Kathryn paid $%.2f for her shares. She owed her broker a $%.2f commission, making the total cost $%.02f.", NUM_SHARES * STOCK_PRICE, (NUM_SHARES * STOCK_PRICE) * COMMISSION, ((NUM_SHARES * STOCK_PRICE) * COMMISSION) + (NUM_SHARES * STOCK_PRICE));
	}
}