import java.util.Scanner;

public class MovieDriver {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);		
		
		String title = "";
		String rating = "";
		int ticketsSold = 0;
		
		System.out.println("Enter the title of a movie: ");
		title = s.nextLine();
		
		System.out.println("Enter the movie's rating: ");
		rating = s.nextLine();
		
		System.out.println("Enter # of tickets sold at theater: ");
		ticketsSold = s.nextInt();
		
		Movie one = new Movie(title, rating, ticketsSold);
		System.out.println(one.toString());

	}

}
