import java.util.Scanner;

public class Prog16 {
	public static void main(String args[]) {	
		Scanner i = new Scanner(System.in);
		final double SURVEY_COUNT = 15000;
		final double ENERGY_DRINK_BUYERS = .18;
		final double PREFER_CITRUS = .58;
		
		System.out.printf("%.0f of %.0f surveyors buy energy drinks; of them, %.0f prefer citrus.", SURVEY_COUNT * ENERGY_DRINK_BUYERS, SURVEY_COUNT, (SURVEY_COUNT * ENERGY_DRINK_BUYERS) * PREFER_CITRUS);
	}
}