import java.util.Scanner;
import java.util.Random;

public class RockPaperScissorsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Welcome to Rock, Paper, Scissors!");
        System.out.println("Type 0 for Rock, 1 for Paper, or 2 for Scissors.");

        // Get player's choice
        int playerChoice = scanner.nextInt();

        // Generate computer's choice (0 for Rock, 1 for Paper, 2 for Scissors)
        int computerChoice = random.nextInt(3);  // Generates a random number between 0 and 2.


        // Print choices
        System.out.println("You chose: " + choiceToString(playerChoice));
        System.out.println("Computer chose: " + choiceToString(computerChoice));

        // Determine the winner
        int result = determineWinner(playerChoice, computerChoice);
        if (result == 0) {
            System.out.println("It's a draw!");
        } else if (result == 1) {
            System.out.println("You win!");
        } else {
            System.out.println("Computer wins!");
        }

        scanner.close();
    }

    // Convert choice integer to its corresponding string representation
    public static String choiceToString(int choice) {
        if (choice == 0) {
            return "Rock";
        } else if (choice == 1) {
            return "Paper";
        } else {
            return "Scissors";
        }
    }

    // Determine the winner based on choices: 0 for draw, 1 for player win, -1 for computer win
    public static int determineWinner(int playerChoice, int computerChoice) {
        if (playerChoice == computerChoice) {
            return 0;  // Draw
        } else if ((playerChoice == 0 && computerChoice == 2) ||
                (playerChoice == 1 && computerChoice == 0) ||
                (playerChoice == 2 && computerChoice == 1)) {
            return 1;  // Player wins
        } else {
            return -1;  // Computer wins
        }
    }
}
