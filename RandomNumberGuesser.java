/*
 * Class: CMSC203 
 * Instructor: Dr. Kuijt
 * Description: We will make a program to let the user guess for a number between 0-100 with 7 guesses at most
 * Due: 9/25/2022
 * Platform/compiler: Eclipse IDE
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Matt Allen
*/
import java.util.Scanner;

public class RandomNumberGuesser {

	public static void main (String a[]) {	
		System.out.print("The application generates a random integer between 0 and 100\n");
		System.out.print("and asks the user to guess repeatedly until they guess correctly.\n\n");

		Scanner s = new Scanner(System.in);
		boolean play = true;

		while (play == true) {
			final int randInt = RNG.rand();

			System.out.println("Enter your first guess:");
			int guess = s.nextInt();
			s.nextLine(); // To clear buffer.
			int lowGuess = 0;
			int highGuess = 100;

			boolean input =	RNG.inputValidation(guess, lowGuess, highGuess);

			if (guess == randInt)
			{
				System.out.println("Congratulations, you guessed correctly.");
				boolean getReply = true;
				while (getReply == true) {
					String reply;
					System.out.println("Try play? (yes or no)");
					reply = s.nextLine();
					if (reply.equals("yes") || reply.equals("Yes"))
					{
						play = true;
						getReply = false;
					}
					else if (reply.equals("no") || reply.equals("No"))
					{
						play = false;
						getReply = false;
					}
				}	
			}
			else
			{
				boolean continueGame = true;
				while (continueGame) {
					if (guess < randInt) {
						if (input == true) {
							System.out.println("Your guess is too low");
							lowGuess = guess;
							System.out.println("Number of guesses is: " + RNG.getCount());
						}
						System.out.println("Enter your next guess between " + lowGuess + " and " + highGuess);
						guess = s.nextInt();
						s.nextLine();
						input = RNG.inputValidation(guess, lowGuess, highGuess);
					}
					else if (guess > randInt) {
						if (input == true) {
							System.out.println("Your guess is too high");
							highGuess = guess;
							System.out.println("Number of guesses is: " + RNG.getCount());
						}
						System.out.println("Enter your next guess between " + lowGuess + " and " + highGuess);
						guess = s.nextInt();
						s.nextLine();
						input = RNG.inputValidation(guess, lowGuess, highGuess);
					}

					if (RNG.getCount() == 7) {
						System.out.println("You have exceeded the maximum number of guesses, 7. Try again.");
						RNG.resetCount();
						continueGame = false;
						play = false;
					}
				}
			}
		}
		s.close();
	}
}
