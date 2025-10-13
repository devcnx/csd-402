
/**
 * Program 1: Exception Handling
 * 
 * Demonstration of exception handling (IndexOutOfBoundsException) and
 * the use of Autoboxing/Auto-Unboxing with an ArrayList of Strings.
 * 
 * Course: CSD402 Java for Programmers
 * Assignment: M9 Programming Assignment
 * 
 * @author Brittaney Perry-Morgan
 * @version 1.0
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ExceptionProgram {

    public static void main(String[] args) {
        // 1. Create ArrayList filled with a minimum of 10 Strings
        ArrayList<String> shoppingList = new ArrayList<>(Arrays.asList(
                "Apples", "Bananas", "Milk", "Bread", "Eggs", "Cheese", "Yogurt", "Waffles", "Coffee", "Tea"));

        System.out.println("--- Current Shopping List  (size: " + shoppingList.size() + ") Item(s) ---");

        // 2. Use a `for-each` loop to print the ArrayList collection
        int index = 0;
        for (String item : shoppingList) {
            // Displaying index for user reference
            System.out.println("[" + index++ + "] " + item);
        }

        Scanner scanner = new Scanner(System.in);
        System.out
                .print("\nEnter the index (0 - " + (shoppingList.size() - 1) + ") of the item you want to see again: ");

        // 3. Autoboxing/Auto-Unboxing and User String Input
        // Read the user's input as a String
        String inputString = scanner.nextLine();

        try {
            // Autoboxing: The String inputString is parsed to its primitive int,
            // which is then Autoboxed into an integer object if needed (e.g., in a method
            // call).
            // We use Integer.parseInt() here, which returns a primitive int.
            int requestedIndex = Integer.parseInt(inputString);

            // 4. Attempt printing the element in a try/catch format
            // The get(int index) method throws an IndexOutOfBoundsException if the index is
            // invalid.
            String selectedItem = shoppingList.get(requestedIndex);

            System.out.println("\n Successfully retrieved the item: ");
            System.out.println("Item at index " + requestedIndex + ": " + selectedItem);
        } catch (NumberFormatException err) {
            // Catch if the user's input cannot be converted to an integer
            System.out.println("\nAn exception has been thrown. Invalid Input Format: " + err.getMessage());
        } catch (IndexOutOfBoundsException err) {
            // Catch if the user's input is out of bounds
            System.out.println("\nAn exception has been thrown. Invalid Index: " + err.getMessage());
        } finally {
            scanner.close();
        }
    }
}