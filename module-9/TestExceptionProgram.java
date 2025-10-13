
/**
 * Program 1: Exception Handling Tests
 * 
 * Documentation and testing harness for ExceptionProgram.java.
 * This file verifies the application's ability to handle valid/invalid index
 * input and non-integer input using try-catch blocks.
 *
 * NOTE: Since ExceptionProgram.java is an interactive console application,
 * this file serves primarily to document test cases and confirm execution.
 * 
 * Course: CSD402 Java for Programmers
 * Assignment: M9 Programming Assignment
 * 
 * @author Brittaney Perry-Morgan
 * @version 1.0
 */
public class TestExceptionProgram {

    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("TEST HARNESS FOR ExceptionProgram.java");
        System.out.println("==================================================");
        System.out.println("The following test cases must be performed by running");
        System.out.println("the primary ExceptionProgram.java file interactively.");
        System.out.println("Expected list size is 10 (indices 0-9).");
        System.out.println("--------------------------------------------------");

        // --- Test Case 1: Valid Index (Successful Execution) ---
        System.out.println("TEST CASE 1: Valid Index");
        System.out.println("    Input: 5 (A valid index)");
        System.out.println("    Expected Output: Successfully retrieved element: [5] Cheese");
        System.out.println("    Verification: Confirms Autoboxing/Auto-Unboxing works and try block executes.");
        System.out.println("--------------------------------------------------");

        // --- Test Case 2: Out of Bounds Index (IndexOutOfBoundsException) ---
        System.out.println("TEST CASE 2: Out of Bounds Index");
        System.out.println("    Input: 10 (Invalid index > max index 9)");
        System.out.println("    Expected Output: An Exception has been thrown: Out of Bounds");
        System.out.println("    Verification: Confirms catch (IndexOutOfBoundsException) is working.");
        System.out.println("--------------------------------------------------");

        // --- Test Case 3: Negative Index (IndexOutOfBoundsException) ---
        System.out.println("TEST CASE 3: Negative Index");
        System.out.println("    Input: -1 (Invalid index < min index 0)");
        System.out.println("    Expected Output: An Exception has been thrown: Out of Bounds");
        System.out.println("    Verification: Confirms catch (IndexOutOfBoundsException) handles negative indices.");
        System.out.println("--------------------------------------------------");

        // --- Test Case 4: Non-Integer Input (NumberFormatException) ---
        System.out.println("TEST CASE 4: Non-Integer Input");
        System.out.println("    Input: hello (A String that is not a number)");
        System.out.println("    Expected Output: An Exception has been thrown: Invalid Input Format (Not an integer)");
        System.out.println("    Verification: Confirms catch (NumberFormatException) handles non-numeric input.");
        System.out.println("--------------------------------------------------");

        System.out.println("\n--- End of Test Plan ---");
    }
}