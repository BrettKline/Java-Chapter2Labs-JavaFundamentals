import java.util.Scanner;

public class Prog11 {
	public static void main(String args[]) {	
		Scanner i = new Scanner(System.in);
		System.out.println("Input the number of girls in the class, then the number of boys.");
		int females = i.nextInt();
		int males = i.nextInt();
		int total = females + males;
		double femaleFrac = ((double)females/total);
		double maleFrac = ((double)males/total);
		System.out.printf("The class is %.2f female and %.2f male. ", femaleFrac, maleFrac);
	}
}