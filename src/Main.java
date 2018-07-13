import java.util.Scanner;

public class Main {

	public static void main(String[] args) {


		String[] patskanis = { "a", "ā", "e", "ē", "i", "ī", "u,", "ū" };
		String[] lidzskanis = { "b", "c", "č", "d", "f", "g", "ģ", "h", "j", "k", "ķ", "l", "m", "n", "ņ", "p", "r",
				"s", "š", "t", "v", "z", "ž", "dz", "dž" };
		String[] o = { "o" };

		System.out.println("Ludzu ievadi patskani, lidzskani, vai divskani!");
		Scanner sc = new Scanner(System.in);
		String fromConsole = sc.nextLine();

		if (fromConsole.length() != 1) {
			System.out.println("invalid input");
		} else {

			for (int i = 0; i < o.length; i++) {
				if (fromConsole.equalsIgnoreCase(o[i])) {

					System.out.println("o (divskanis)");
					break;
				}

			}

			for (int i = 0; i < patskanis.length; i++) {
				if (fromConsole.equalsIgnoreCase(patskanis[i])) {

					System.out.println("Patskanis");
					break;
				}

			}
			


			for (int i = 0; i < lidzskanis.length; i++) {
				if (fromConsole.equalsIgnoreCase(lidzskanis[i])) {

					System.out.println("Lidzskanis");
					break;
				}
			}

		}

	}

}
