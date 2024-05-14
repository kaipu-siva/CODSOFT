import java.util.*;

public class TASK1 {
	public static void NumberGame()
	{
		Scanner sc = new Scanner(System.in);

		int number = 1 + (int)(100 * Math.random());

		int K = 5;

		int i, guess_number;

		System.out.println("A number is chosen"	+ " between 1 to 100." + "Guess the number"	+ " within 5 trials.");

		for (i = 0; i < K; i++) {

			System.out.println(	"Guess the number:");

			guess_number = sc.nextInt();

			if (number == guess_number) {
				System.out.println("Congratulations!" + " You guessed the number.");
				break;
			}
			else if (number > guess_number && i != K - 1) {
				System.out.println("The number is "	+ "greater than " + guess_number);
			}
			else if (number < guess_number	&& i != K - 1) {
				System.out.println(	"The number is"	+ " less than " + guess_number);
			}
		}

		if (i == K) {
			System.out.println("You have completed"	+ " K trials.");

			System.out.println("The number was " + number);
		}
	}

	public static void main(String args[])
	{
		NumberGame();
	}
}

