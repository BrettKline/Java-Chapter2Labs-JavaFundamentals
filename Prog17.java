import java.util.Scanner;

public class Prog17 {
	public static void main(String args[]) {	
		Scanner i = new Scanner(System.in);
		System.out.println("Let's play dumb libs! Input your name.");
		String name = i.nextLine();
		System.out.println("Now your age.");
		String age = i.nextLine();
		System.out.println("And a city.");
		String city = i.nextLine();
		System.out.println("A college.");
		String college = i.nextLine();
		System.out.println("A job.");
		String job = i.nextLine();
		System.out.println("A species of animal.");
		String animal = i.nextLine();
		System.out.println("A name for that animal.");
		String animalName = i.nextLine();
		
		System.out.printf("There once was a person named %s who lived in %s. At the age of %s, %s went to college at %s. %s graduated and went to work as a %s. Then, %s adopted a(n) %s named %s. They both lived happily ever after!", name, city, age, name, college, name, job, name, animal, animalName);
	}
}