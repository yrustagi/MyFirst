// Odd and Even game 
import java.util.Random;
import java.util.Scanner;

public class OddsOrEvens {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		Random rand = new Random();

		System.out.println("Let's play a game called \"Odds and Evens\"");
		System.out.println("What is your name?");
		String name = scnr.next();
		System.out.println("Hi " + name + " which do you choose? (o)Odds or (E)Evens");
		String selection = scnr.next();

		if (selection.equals("odds") || (selection.contentEquals("o"))) {
			System.out.println(name + " has picked odds! So the computer will be Evens");
		} else {
			System.out.println(name + " has picked evens! So the computer will be odds");
		}
		System.out.println("-------------------------------------------");// just for separation 

		System.out.println("How many “fingers” do you put out?");
		int fingers = scnr.nextInt();
		int computer = rand.nextInt(6);
		System.out.println("The computer plays number " + computer);

		System.out.println("-------------------------------------------");// just for separation 

		int sum = fingers + computer;

		System.out.println(fingers + " + " + computer + " = " + sum);

		boolean oddOrEven = sum % 2 == 0;
		if (oddOrEven) {
			System.out.println("The sum is .... even!");

			if (selection.equalsIgnoreCase("e") || (selection.equals("evens"))) {
				System.out.println(name + " wins!");
			} else {
				System.out.println("That means computer wins!");
			}

		} else {
			System.out.println("The sum is .... odd!");

			if (selection.equalsIgnoreCase("o")) {
				System.out.println(name + " wins!");
			} else {
				System.out.println("That means computer wins");
			}
		}
		System.out.println("-------------------------------------------");// just for separation 

	}
}
