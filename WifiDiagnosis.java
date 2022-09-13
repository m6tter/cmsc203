/*
 * Class: CMSC203 
 * Instructor: Dr. Kuijt
 * Description: The classes ask for input because we are trying to fix the user's Internet connection problems
 * Due: 09/12/2022
 * Platform/compiler: Yes
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Matt Allen
*/



import java.util.Scanner;

public class WifiDiagnosis {

	public static void main(String args[]) {

		Scanner keyboard = new Scanner(System.in);
		
		String answer;
		String answer2;
		String answer3;
		String answer4;

		/** If you have a problem with internet connectivity this WiFi diagnosis might work. = Application Header */
		System.out.println("If you have a problem with internet connectivity this WiFi diagnosis might work.");

		System.out.println("Reboot the computer and try to connect");
		System.out.println("Did that fix the problem? (Yes or No)");

		answer = keyboard.nextLine();
		
		
		if (answer.equals("Yes") || answer.equals("yes")) // Yes for question 1
		{
			System.out.println("Done");
			System.out.print("Programmer: Matt Allen");
		}    	
		else if (answer.equals("No") || answer.equals("no")) // No for question 1
		{
			System.out.println("Reboot the router and try to connect");
			System.out.println("Did that fix the problem? (Yes or No)");
			answer2 = keyboard.nextLine();

			if (answer2.equals("Yes") || answer2.equals("yes"))
			{
				System.out.println("Done");
				System.out.print("Programmer: Matt Allen");
			}
			else if (answer2.equals("No") || answer2.equals("no"))
			{
				System.out.println("Make sure the cables connecting the router are firmly plugged in and power is getting to the router");
				System.out.println("Did that fix the problem? (Yes or No)");
				answer3 = keyboard.nextLine();
				
				if (answer3.equals("Yes") || answer3.equals("yes"))
				{
					System.out.println("Done");
					System.out.print("Programmer: Matt Allen");
				}
				else if (answer3.equals("No") || answer3.equals("no"))
				{
					System.out.println("Move the computer closer to the router and try to connect");
					System.out.println("Did that fix the problem? (Yes or No)");
					answer4 = keyboard.nextLine();
					
					if (answer4.equals("Yes") || answer4.equals("yes"))
					{
						System.out.println("Done");
						System.out.print("Programmer: Matt Allen");
					}
					else if (answer4.equals("No") || answer4.equals("no"))
					{
						System.out.println("Contact your ISP");
						System.out.println("Done");
						System.out.print("Programmer: Matt Allen");
					}
					else 
					{
						System.out.println("Invalid answer; try again");
						System.out.print("Programmer: Matt Allen");
					}
				}
				else 
				{
					System.out.println("Invalid answer; try again");
					System.out.print("Programmer: Matt Allen");
				}
			}
			else
			{
				System.out.println("Invalid answer; try again");
				System.out.print("Programmer: Matt Allen");
			}
		}	    					    					
		else
		{
			System.out.println("Invalid answer; try again");
			System.out.print("Programmer: Matt Allen");
		}

	}
}
