import java.util.Scanner;

public class Prog18 {
	public static void main(String args[]) {	
		Scanner i = new Scanner(System.in);
		final double NUM_STOCK = 1000;
		final double BUY_VALUE = 32.87;
		final double SALE_VALUE = 33.92;
		final double COMMISSION = .02;
		
		double purchasePrice = NUM_STOCK * BUY_VALUE;
		double purchaseCommission = purchasePrice * COMMISSION;
		double salePrice = NUM_STOCK * SALE_VALUE;
		double saleCommission = salePrice * COMMISSION;
		double profit = (salePrice - purchasePrice) - (purchaseCommission + saleCommission);
		
		
		System.out.printf("Joe paid $%.2f for his stock, along with $%.2f in commission. Later, he sold the stock for $%.2f, paying $%.2f in commission. Overall, his profit on the sales was $%.2f.", purchasePrice, purchaseCommission, salePrice, saleCommission, profit);
	}
}