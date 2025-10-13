
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
 */

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

/** Representation of a File IO Program. */
public class FileIOProgram {

    private static final String FILE_NAME = "data.file";
    private static final int NUMBER_OF_INTEGERS = 10;

    public static void main(String[] args) {

        File file = new File(FILE_NAME);
        boolean fileExists = file.exists();

        try (
                PrintWriter output = new PrintWriter(
                        fileExists ? new java.io.FileWriter(FILE_NAME, true) : new java.io.FileWriter(FILE_NAME))) {
            Random random = new Random();

            if (fileExists) {
                System.out.println(
                        "--- Appending " + NUMBER_OF_INTEGERS + " new random numbers to " + FILE_NAME + " ---");
            } else {
                System.out.println(
                        "--- Creating and writing " + NUMBER_OF_INTEGERS + " random numbers to " + FILE_NAME + " ---");
            }

            for (int i = 0; i < NUMBER_OF_INTEGERS; i++) {
                int randomNumber = random.nextInt(100);
                output.print(randomNumber + " ");
            }

            System.out.println("File writing complete. File closed.");

        } catch (IOException e) {
            System.err.println("An error occurred during file writing: " + e.getMessage());
            return; // Exit if writing failed
        }

        System.out.println("\n--- Reading Data from " + FILE_NAME + " ---");
        try (Scanner input = new Scanner(file)) {

            System.out.print("File Content: ");
            while (input.hasNext()) {
                System.out.print(input.next() + " ");
            }
            System.out.println("\nFile reading complete.");

        } catch (IOException e) {
            System.err.println("An error occurred during file reading: " + e.getMessage());
        }
    }
}