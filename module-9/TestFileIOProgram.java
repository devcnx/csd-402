
/**
 * Program 2: File I/O
 * 
 * Demonstration of file I/O using a Scanner to read a file and a PrintWriter to
 * write to a file.
 * 
 * Course: CSD402 Java for Programmers
 * Assignment: M9 Programming Assignment
 * 
 * @author Brittaney Perry-Morgan
 * @version 1.0
 *
 * NOTE:Since FileIOProgram.java directly manipulates a file and prints to the console,
*the testing process must be executed by running the primary application multiple times.*/

import java.io.File;
import java.util.Random;

public class TestFileIOProgram {

    private static final String FILE_NAME = "data.file";

    public static void main(String[] args) {
        File file = new File(FILE_NAME);

        System.out.println("==================================================");
        System.out.println("TEST HARNESS FOR FileIOProgram.java");
        System.out.println("==================================================");
        System.out.println("Test Status: FileIOProgram must be run interactively to verify behavior.");
        System.out.println("--------------------------------------------------");
        System.out.println("Current status of " + FILE_NAME + ": " + (file.exists() ? "EXISTS" : "DOES NOT EXIST"));
        System.out.println("--------------------------------------------------");

        // --- Setup for Test Case 1 ---
        // Randomly decide to delete or keep the file
        Random random = new Random();
        if (random.nextBoolean()) {
            file.delete();
            System.out.println("SETUP: " + FILE_NAME + " was deleted.");
        } else {
            System.out.println("SETUP: " + FILE_NAME + " was NOT deleted.");
        }

        // --- Test Case 1: File Creation and Initial Write ---
        System.out.println("TEST CASE 1: File Creation (File does NOT exist)");
        System.out.println("    Action: Run FileIOProgram.java once.");
        System.out.println("    Expected Console Output:");
        System.out.println("        - Displays 'Creating and writing 10 random numbers...'");
        System.out.println("        - Displays 'File Content: ' followed by 10 space-separated numbers.");
        System.out.println("    Expected File System Result:");
        System.out.println("        - " + FILE_NAME + " is created.");
        System.out.println("        - " + FILE_NAME + " contains exactly 10 random integers separated by spaces.");
        System.out.println("--------------------------------------------------");

        // --- Test Case 2: File Appending ---
        System.out.println("TEST CASE 2: File Appending (File DOES exist from Test 1)");
        System.out.println("    Prerequisite: " + FILE_NAME + " must exist from Test 1.");
        System.out.println("    Action: Run FileIOProgram.java a second time.");
        System.out.println("    Expected Console Output:");
        System.out.println("        - Displays 'Appending 10 new random numbers to " + FILE_NAME + "'");
        System.out.println(
                "        - Displays 'File Content: ' followed by approximately 20 space-separated numbers (10 old + 10 new).");
        System.out.println("    Expected File System Result:");
        System.out.println("        - " + FILE_NAME + " is NOT recreated.");
        System.out.println("        - " + FILE_NAME + " now contains the original 10 numbers PLUS 10 new numbers.");
        System.out.println("--------------------------------------------------");

        System.out.println("\n--- End of Test Plan ---");
    }
}