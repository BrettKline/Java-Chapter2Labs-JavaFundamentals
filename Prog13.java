import java.util.Scanner;

public class Prog13 {
	public static void main(String args[]) {	
		Scanner i = new Scanner(System.in);
		final double TAX = .075;
		final double TIP = .18;
		System.out.printf("Input the cost of the meal. This program will compute tax at %.2f percent and tip at %.2f percent.\r\n", TAX * 100, TIP * 100);
		double cost = i.nextDouble();
		double taxCost = cost * TAX;
		double tipCost = (cost + taxCost) * TIP;
		System.out.printf("The meal was $%.2f, tax is $%.2f, tip is $%.2f, and the total bill is $%.2f.", cost, taxCost, tipCost, cost + taxCost + tipCost);
	}
}