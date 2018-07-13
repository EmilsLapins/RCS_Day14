import java.util.Random;
import java.util.Scanner;

public class Task1 {

	
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("I have chosen number between 1 and 10, try to guess it: ");
		System.out.println("What's your number?");
		int input = sc.nextInt();
		
		Random rnd1 = new Random();
		int skaitlis = 1 + rnd1.nextInt(10);
		

			
		while (input != skaitlis) {
			System.out.println("Wrong, try again...");
			System.out.println("What's your number?");
			input = sc.nextInt();
		}
		System.out.println("Correct");

		
		
		
		
		
				

	}
}
