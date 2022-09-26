import java.util.Scanner;

public class MovieDriver_Task2 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);		
		
		String title = "";
		String rating = "";
		int ticketsSold = 0;
		String again = "";
		
		do {
		System.out.println("Enter the title of a movie: ");
		title = s.nextLine();
		
		System.out.println("Enter the movie's rating: ");
		rating = s.nextLine();
		
		System.out.println("Enter # of tickets sold at theater: ");
		ticketsSold = s.nextInt();
		s.nextLine();
		
		Movie one = new Movie(title, rating, ticketsSold);
		System.out.println(one.toString());
		
		System.out.println("Do you want to enter another? (y or n)");
		again = s.nextLine();
		} while (again.equals("y") || again.equals("Y"));

		System.out.println("Goodbye");
		
	}

}
