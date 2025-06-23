import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        final int LOWER_BOUND = 1;
        final int UPPER_BOUND = 100;
        final int MAX_ATTEMPTS = 7;

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int score = 0;
        int round = 1;
        boolean playAgain = true;

        while (playAgain) {
            int numberToGuess = random.nextInt(UPPER_BOUND - LOWER_BOUND + 1) + LOWER_BOUND;
            int attemptsLeft = MAX_ATTEMPTS;
            boolean guessedCorrectly = false;
            System.out.println("\n Round " + round + ": Guess the number between " + LOWER_BOUND + " and " + UPPER_BOUND);
            while (attemptsLeft > 0) {
                System.out.print("You have " + attemptsLeft + " attempt(s) left. Enter your number: ");
                int guess;
                if (!scanner.hasNextInt()) {
                    System.out.println("Please enter a valid number.");
                    scanner.next();
                    continue;
                }
                guess = scanner.nextInt();
                if (guess == numberToGuess) {
                    System.out.println("Correct! You've guessed the number!");
                    score++;
                    guessedCorrectly = true;
                    break;
                } else if (guess < numberToGuess) {
                    System.out.println("Too low.");
                } else {
                    System.out.println("Too high.");
                }
                attemptsLeft--;
            }
            if (!guessedCorrectly) {
                System.out.println("You're out of attempts. The number was: " + numberToGuess);
            }
            System.out.println("Current score: " + score + " point(s)");
            System.out.print("Do you want to play again? (yes/no): ");
            scanner.nextLine(); 
            String response = scanner.nextLine().trim().toLowerCase();
            playAgain = response.equals("yes") || response.equals("y");
            round++;
        }
        System.out.println("Game Over! Final score: " + score);
        scanner.close();
    }
}
