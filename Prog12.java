import java.util.Scanner;

public class Prog12 {
	public static void main(String args[]) {	
		Scanner i = new Scanner(System.in);
		System.out.println("Input the name of a city.");
		String city = i.nextLine();
		System.out.printf("%s is %d characters long. It looks like %s in all uppercase and %s in all lowercase. The first character is %s.", city, city.length(), city.toUpperCase(), city.toLowerCase(), city.charAt(0));
	}
}