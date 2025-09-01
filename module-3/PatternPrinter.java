/**
 * This program uses nested for loops to print a specific number pattern and the "@" symbol,
 * as required by the assignment.
 * 
 * @author Brittaney Perry-Morgan
 * @version 1.0
 * @since 2025-08-31
 * 
 * Course: CSD402 Java for Programmers
 * Assignment: M3 Programming Assignment (Pattern Printer)
 */

public class PatternPrinter {
    public static void main(String[] args) {
        int totalNumberOfRows = 7;
        int displayWidth = 60; // Total Chars Per Line to Align the '@' on the Right

        for (int currentRow = 1; currentRow <= totalNumberOfRows; currentRow++) {
            StringBuilder numbersInCurrentRow = new StringBuilder();

            // Build Left Half: 1, 2, 4, ...
            int currentNumber = 1;
            for (int numberIndex = 1; numberIndex <= currentRow; numberIndex++) {
                numbersInCurrentRow.append(currentNumber).append(" ");
                currentNumber *= 2;
            }

            // Build Right Half: ..., 4, 2, 1
            currentNumber /= 4; // Step Back Two Powers
            for (int numberIndex = 1; numberIndex < currentRow; numberIndex++) {
                numbersInCurrentRow.append(currentNumber).append(" ");
                currentNumber /= 2;
            }

            String numbersLine = numbersInCurrentRow.toString().trim();

            // Center the Numbers Within displayWidth - 2 (leaving space for '@' and a space)
            int totalPaddingRequired = displayWidth - 2 - numbersLine.length();
            int leftPaddingRequired = totalPaddingRequired / 2;

            String formattedLine = " ".repeat(Math.max(0, leftPaddingRequired)) + numbersLine;

            // Right-Align the '@'
            while (formattedLine.length() < displayWidth - 1) {
                formattedLine += " ";
            }

            formattedLine += "@";

            System.out.println(formattedLine);
        }
    }
}