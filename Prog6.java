import java.util.Scanner;

public class Prog6 {
	public static void main(String args[]) {	
		Scanner i = new Scanner(System.in);
		final double SALE_FRACTION = .65;
		final int SALE_GROSS = 8300000;
		double predictedSales = (double)(SALE_FRACTION * SALE_GROSS);
		System.out.printf("East Coast sales should make $%.2f this year.", predictedSales);
	}
}