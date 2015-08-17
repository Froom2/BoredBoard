
import java.util.Random;
import java.util.Scanner;

public class BoredBoard {

	public static void main(String[] args) {
		// make list of things I could do when i'm bored
		String[] tasks = {
                "study Java.",
				"wash up.",
				"listen to a podcast.",
				"empty a box!",
				"read a book.",
				"do your dailies on GuildWars.",
				"hoover.",
				"clean the bathtub and sink.",
				"clean the toilet.",
				"clean the kitchen surfaces.",
				"mop a floor.",
				"do some decorating.",
				"play guitar."};

		String answer = "yes";
		String line;
		
		do  {
			// Suggest a thing from the list, ask me if I want to do it.

			
			int idx = new Random().nextInt(tasks.length);
			String randomTask = (tasks[idx]);
			System.out.println("You should " + randomTask);
			
			Scanner input = new Scanner(System.in);
			
			// Check if I want to do it
			System.out.println("Do you want to do that?");
			line = input.nextLine();
		}
		
		// keep asking until I say yes.
		while (!line.equals(answer));
		
		System.out.println("Ok so now go do that!");

	}

}
