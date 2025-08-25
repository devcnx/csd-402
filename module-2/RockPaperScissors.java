/**
 * This program plays the game of Rock-Paper-Scissors against the user.
 * It randomly generates the computer's choice and prompts the user for their choice,
 * then displays the result with input validation and retry functionality.
 * 
 * @author Brittaney Perry-Morgan
 * @version 1.0
 * @since 2025-08-24
 * 
 * Course: CSD402 Java for Programmers
 * Assignment: M2 Programming Assignment (Rock Paper Scissors)
 */

import java.util.Scanner; // Import the Scanner class to read user input

public class RockPaperScissors {

    public static void main(String[] args) {
        // --- 1. The Computer's Move ---
        // Generate a random integer: 1, 2, or 3.
        // Math.random() returns a double between 0.0 and <1.0.
        // We multiply by 3 to get a number between 0.0 and <3.0.
        // Casting to (int) truncates the decimal, giving us 0, 1, or 2.
        // We add 1 to get our desired range of 1, 2, or 3.
        int computerChoice = (int)(Math.random() * 3) + 1;

        // --- 2. Your Move ---
        // Create a Scanner object to get input from the console.
        // Using try-with-resources to automatically close the Scanner
        int userChoice = 0; // Initialize with invalid value
        try (Scanner input = new Scanner(System.in)) {
            // Keep asking for input until valid choice is entered
            while (userChoice < 1 || userChoice > 3) {
                System.out.print("Enter 1 for Rock, 2 for Paper, or 3 for Scissors: ");
                String inputLine = input.nextLine().trim();
                
                if (inputLine.isEmpty()) {
                    System.out.println("You didn't enter anything! Please enter a number (1, 2, or 3).");
                } else {
                    try {
                        userChoice = Integer.parseInt(inputLine);
                        if (userChoice < 1 || userChoice > 3) {
                            System.out.println("Invalid choice! Please enter 1, 2, or 3.");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid input! Please enter a number (1, 2, or 3).");
                    }
                }
            }
        }

        // --- 3. The Judgment & 4. The Announcement ---
        // First, let's get the string representations for the choices to make the output readable.
        String computerPick = "";
        switch (computerChoice) {
            case 1: computerPick = "Rock"; break;
            case 2: computerPick = "Paper"; break;
            case 3: computerPick = "Scissors"; break;
        }

        String userPick = "";
        switch (userChoice) {
            case 1: userPick = "Rock"; break;
            case 2: userPick = "Paper"; break;
            case 3: userPick = "Scissors"; break;
        }

        // Now, let's build the output message.
        String resultMessage = "The Computer is " + computerPick + ". You are " + userPick + ". ";

        // Determine the winner using if/else if/else logic.
        if (computerChoice == userChoice) {
            // This is the tie condition.
            resultMessage += "It is a draw.";
        } else if ((userChoice == 1 && computerChoice == 3) || // Rock crushes Scissors
                   (userChoice == 2 && computerChoice == 1) || // Paper covers Rock
                   (userChoice == 3 && computerChoice == 2)) { // Scissors cuts Paper
            // These are all the conditions where the user wins.
            resultMessage += "You won!";
        } else {
            // If it's not a tie and you didn't win, the only possibility left is that you lost.
            resultMessage += "You lose.";
        }

        // Display the final, readable result.
        System.out.println(resultMessage);
    }
}