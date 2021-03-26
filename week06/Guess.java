public class Guess {

    public static int GetUserGuess() {

        int guess = 0;

        System.out.print("Enter your guess: ");
        String guessString = System.console().readLine();
        while (!Utilities.IsInteger(guessString)) {
            System.out.println("Invalid input!");

            System.out.print("\nEnter your guess: ");
            guessString = System.console().readLine();
        }

        guess = Integer.parseInt(guessString);
        return guess;
    }

    public static void main(String[] args) {
        int number = (int) Math.floor((Math.random()*99))+2;

        boolean isDone = false;
        while (!isDone) { 
            int guess = GetUserGuess();

            if (guess < number){
                System.out.println(guess+" is too low! ");
            }
            else if (guess > number){
                System.out.println(guess+" is too high! ");
            }
            else{
                System.out.println("You win! The number was "+number);
                isDone = true;
            }
        }
    }    
}
