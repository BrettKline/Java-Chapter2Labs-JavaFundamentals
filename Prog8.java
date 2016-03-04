import java.util.Scanner;

public class Prog8 {
	public static void main(String args[]) {	
		Scanner i = new Scanner(System.in);
		final double STATE_TAX = .055;
		final double COUNTY_TAX = .02;
		System.out.println("What is the value of your purchase?");
		double purchase = i.nextDouble();
		double stateTaxValue = purchase * STATE_TAX;
		double countyTaxValue = purchase * COUNTY_TAX;
		System.out.printf("The purchase was $%.2f. The state tax is $%.2f, and the county tax is $%.2f ($%.2f total). The sale total is $%.2f.", purchase, stateTaxValue, countyTaxValue, stateTaxValue + countyTaxValue, purchase + stateTaxValue + countyTaxValue);
	}
}