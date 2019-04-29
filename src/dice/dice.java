package dice;

import java.util.Random;
import java.util.Scanner;

public class dice {

	public static void main(String[] args) {
		// main
		// code written by Nick TenBrink
		String answer = "";
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to Grand Circus Casino! \n");

		do {
			System.out.println("number of sides: ");

		while (scan.hasNextInt() == false) { // checks if input is integer
			String input = scan.next();
			System.out.println("you entered: " + input);
			System.out.println("please enter a valid number" + " ");
		}
		int sides = scan.nextInt();

		while (sides < 1) { // checks if input is positive int
			System.out.println("you entered: " + sides);
			System.out.println("please enter a postive number");

			while (scan.hasNextInt() == false) { // checks integer
				String input = scan.next(); //
				System.out.println("you entered: " + input);
				System.out.println("please enter a valid number" + " ");
			}
			sides = scan.nextInt();
		}
		// int sides = scan.nextInt();

		System.out.println("rolling... ");

		Random rand = new Random();
		// System.out.println(rand.nextInt(sides) + 1);
//		double gen = Math.random();
//		System.out.println(gen);
//
//		int result = (int) (gen * sides) + 1;
			int die1 = generateRandomDieRoll(sides);
			int die2 = generateRandomDieRoll(sides);

			System.out.print(die1);
			System.out.println(", " + die2);

			if (die1 == 1 && die2 == 1) {
				System.out.println("snake eyes! ouch");
			} else if (die1 == 6 && die2 == 6) {
				System.out.println("box cars!");
			} else if (die1 + die2 == 11 || die1 + die2 == 7) {
				System.out.println(die1 + "+" + die2 + " = " + (die1 + die2));
				System.out.println("craps, nice!");
			}

			System.out.println("Continue? (y/n)");
			answer = scan.next();
		} while (answer.equalsIgnoreCase("y"));
		System.out.println("Goodbye");
	}

	public static int generateRandomDieRoll(int sides) {
		double gen = Math.random();
		// System.out.println(gen);
		int result = (int) (gen * sides) + 1;
		return result;
	}

}
