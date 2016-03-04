import java.util.Scanner;

public class Prog9 {
	public static void main(String args[]) {	
		Scanner i = new Scanner(System.in);
		System.out.println("Input number of miles driven, then gallons of gas used. Please don't input zero for gas used.");
		double milesDriven = i.nextDouble();
		double gasUsed = i.nextDouble();
		System.out.printf("Your MPG was %.2f.", milesDriven/gasUsed);
	}
}