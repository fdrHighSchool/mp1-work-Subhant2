
/**
 * Write a description of class RandomNumber here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RandomNumber
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("what game mode?\nEasy\nMedium\nHard");
        String mode = s.nextLine();
        
        int maximum;
        if (mode == "easy") {
            maximum = 10;
        } //end if statement
        else if (mode == "medium") {
            maximum = 50;
        } // end else if statement
        else {
            maximum = 100;
        } // end else
        
        // in a moment we will take the user's wish and create a random number
        int mysteryNumber = 5; // just a placeholder for now
        System.out.print("Enter your guess: ");
        int playerGuess = s.nextInt();
        
        // if the player guessed incorrectly
        if(playerGuess != mysteryNumber) {
            // if the player guessed too low
            if(playerGuess < mysteryNumber) {
                System.out.println("You were off by " + (mysteryNumber - playerGuess));
            } // end inner if statement
            // if the player didn't guess too low (meaning, incorrect and too high!)
            else {
                System.out.println("You were off by " + (playerGuess - mysteryNumber));
            } // end inner else statement
        } // end outer if statement
        // if the player didn't guess incorrectly (meaning, correct guess)
        else {
            System.out.println("Correct!!!");
        } // end outer else statement
    } // end main method
} // end class
