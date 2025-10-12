
/**
 * A program that accepts Integer input from a user into an ArrayList until 0 is
 * entered.
 * Then, it calls a static method to find and display the largest value in the
 * list.
 * 
 * Course: CSD402 Java for Programmers
 * Assignment: M8 Programming Assignment
 * 
 * @author Brittaney Perry-Morgan
 * @version 1.0
 */

import java.util.ArrayList;
import java.util.Scanner;

public class BrittaneyArrayListTest {
    /**
     * Finds and returns the largest Integer in the given ArrayList.
     * Required method signature: public static Integer max (ArrayList list)
     * 
     * @param list The ArrayList of Integer objects to be searched
     * 
     * @return The largest Integer in the list, or 0 if the list is empty.
     */
    public static Integer max(ArrayList<Integer> list) {
        // If the ArrayList is sent empty, the method will return 9.
        if (list == null || list.isEmpty()) {
            return 0;
        }

        // Initialize max to the first element's value
        Integer currentMax = list.get(0);

        // Iterate through the list to find the largest value.
        // Starting at index 1 since we initialized currentMax with index 0.
        for (int index = 1; index < list.size(); index++) {
            if (list.get(index) > currentMax) {
                currentMax = list.get(index);
            }
        }
        return currentMax;
    }

    /** Main method to test the max method functionality */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        int input;

        // --- User Input * Population
        System.out.println("--- Entering Integers into ArrayList ---");
        System.out.println("Enter a series of integers (Enter 0 to stop and calculate the max): ");

        // Loop to accept integers until 0 is entered
        do {
            System.out.print("Enter an integer: ");

            // Error handling for non-integer input
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter an integer.");
                scanner.next(); // Consume the invalid input
            }

            input = scanner.nextInt();
            numbers.add(input); // Add input to the ArrayList (including 0)
        } while (input != 0);

        // --- Display the max value
        System.out.println("\n--- Processing Results     ---");
        System.out.println("ArrayList content (including termination value 0): " + numbers);

        // --- Testing ---

        // Test 1: Test with the user-populated list
        Integer userMax = max(numbers);
        System.out.println("\nTEST 1: Largest value entered (User List): " + userMax);

        // Test 2: Additional test case for an empty list (requirement check)
        ArrayList<Integer> emptyList = new ArrayList<Integer>();
        Integer emptyMax = max(emptyList);
        System.out.println("TEST 2: Largest value for an EMPTY list: " + emptyMax);

        // Test 3: Additional test case with negative numbers
        ArrayList<Integer> negativeList = new ArrayList<Integer>();
        negativeList.add(-5);
        negativeList.add(-1);
        negativeList.add(-10);
        negativeList.add(0); // Includes 0 termination value for completeness

        Integer negativeMax = max(negativeList);
        System.out.println("TEST 3: Largest value for list [-5, -1, -10, 0]: " + negativeMax);

        scanner.close();
    }
}