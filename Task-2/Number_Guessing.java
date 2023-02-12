import java.util.Scanner;

public class Number_Guessing{
	
	public static void main(String[] args) {
		// Scanner Class
		Scanner sc = new Scanner(System.in);

		// Generate the random number between 1 to 100
		int number =(int) (100
				* Math.random());

		// Given K trials
		int K = 5;

		int i, guess;

		System.out.println(
				" A number is choosen randomly between 1 to 100."
						+ " Guess that number"
						+ " within 5 trials.");

		// Iterate over K Trials
		for (i = 0; i < K; i++) {

			System.out.println("\nGuess the number:");

			// Take input for guessing
			guess = sc.nextInt();

			// If the number is guessed
			if (number == guess) {
				System.out.println(
						"Congratulation! You guessed the correct number.");
				break;
			} else if (number > guess
					&& i != K - 1) {
				System.out.println(
						"The number is greater than " + guess);
			} else if (number < guess
					&& i != K - 1) {
				System.out.println(
						"The number is less than " + guess);
			}
		}

		if (i == K) {
			System.out.println(
					"You have exhausted K trials.");

			System.out.println(
					"The correct number was " + number);
		}
		sc.close();
	}
}
