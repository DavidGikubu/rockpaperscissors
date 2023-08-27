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

    }
}
