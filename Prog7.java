import java.util.Scanner;

public class Prog7 {
	public static void main(String args[]) {	
		Scanner i = new Scanner(System.in);
		final int SQFEET_IN_ACRE = 43560;
		final int PLOT_OF_LAND = 389767;
		double numAcres = (double)(PLOT_OF_LAND / SQFEET_IN_ACRE);
		System.out.printf("There are %.2f acres in the plot of land.", numAcres);
	}
}