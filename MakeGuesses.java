import java.util.Random;

public class MakeGuesses {

	public static void main(String[] args) {
		makeGuesses();
	}
	
	public static void makeGuesses() {
		Random rand = new Random();
		
		//initialize variables
		int counter = 0;
		int currGuess = 0;
		
		//keep guessing until currGuess is 48 or higher
		while (currGuess < 48) {
			currGuess = rand.nextInt(49) + 1;
			counter++;
			System.out.println("guess = " + currGuess);
		}
		
		System.out.println("total guesses = " + counter);
		
	}

}
