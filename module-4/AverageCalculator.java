/**
 * This program contains four overloaded methods to calculate the average of an array for different
 * primitive data types and a main method to test their functionality.
 * 
 * @author Brittaney Perry-Morgan
 * @version 1.0
 * @since 2025-08-31
 * 
 * Course: CSD402 Java for Programmers
 * Assignment: M4 Programming Assignment (Average Calculator)
 */

public class AverageCalculator {

    /**
     * Calculates the average of an array of short values.
     * Returns 0 if the input array is null or empty.
     *
     * @param numbers array of short values to calculate the average for, may be null or empty
     * @return the average of the numbers as a short, or 0 if the input array is null or empty
     */
    public static short average(short[] numbers) {
        if (numbers == null || numbers.length == 0) {
            return 0;
        }
        short totalSum = 0;
        for (short number : numbers) {
            totalSum += number;
        }
        return (short) (totalSum / numbers.length);
    }

    /**
     * Calculates the average of an array of int values.
     * Returns 0 if the input array is null or empty.
     *
     * @param numbers array of int values to calculate the average for, may be null or empty
     * @return the average of the numbers as an int, or 0 if the input array is null or empty
     */
    public static int average(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            return 0;
        }
        int totalSum = 0;
        for (int number : numbers) {
            totalSum += number;
        }
        return totalSum / numbers.length;
    }

    /**
     * Calculates the average of an array of long values.
     * Returns 0 if the input array is null or empty.
     *
     * @param numbers array of long values to calculate the average for, may be null or empty
     * @return the average of the numbers as a long, or 0 if the input array is null or empty
     */
    public static long average(long[] numbers) {
        if (numbers == null || numbers.length == 0) {
            return 0;
        }
        long totalSum = 0;
        for (long number : numbers) {
            totalSum += number;
        }
        return totalSum / numbers.length;
    }

    /**
     * Calculates the average of an array of double values.
     * Returns 0.0 if the input array is null or empty.
     *
     * @param numbers array of double values to calculate the average for, may be null or empty
     * @return the average of the numbers as a double, or 0.0 if the input array is null or empty
     */
    public static double average(double[] numbers) {
        if (numbers == null || numbers.length == 0) {
            return 0.0;
        }
        double totalSum = 0.0;
        for (double number : numbers) {
            totalSum += number;
        }
        return totalSum / numbers.length;
    }

    /**
     * Main method to demonstrate the functionality of the average calculation methods.
     * Creates test arrays of different numeric types, calculates their averages,
     * and prints the results to standard output.
     *
     * @param args command line arguments (not used)
     */
    public static void main(String[] args) {
        System.out.println("\nTesting the Overloaded Average Methods:\n");

        // Test with a Short Array
        short[] shortArray = {10, 20, 30, 40, 50};
        System.out.print("Original Short Array: ");
        printArray(shortArray);
        short shortAvg = average(shortArray);
        System.out.println("Average Value: " + shortAvg + "\n");

        // Test with an Int Array
        int[] intArray = {15, 25, 35, 45, 55, 65};
        System.out.print("Original Int Array: ");
        printArray(intArray);
        int intAvg = average(intArray);
        System.out.println("Average Value: " + intAvg + "\n");

        // Test with a Long Array
        long[] longArray = {100L, 200L, 300L, 400L, 500L, 600L, 700L};
        System.out.print("Original Long Array: ");
        printArray(longArray);
        long longAvg = average(longArray);
        System.out.println("Average Value: " + longAvg + "\n");

        // Test with a Double Array
        double[] doubleArray = {12.5, 23.5, 34.5, 45.5};
        System.out.print("Original Double Array: ");
        printArray(doubleArray);
        double doubleAvg = average(doubleArray);
        System.out.println("Average Value: " + doubleAvg + "\n");
    }

    /**
     * Prints the elements of a short array in a comma-separated format.
     * If the array is null or empty, prints nothing.
     *
     * @param numbers the array of short values to print, may be null or empty
     */
    private static void printArray(short[] numbers) {
        for (int index = 0; index < numbers.length; index++) {
            System.out.print(numbers[index] + (index == numbers.length - 1 ? "" : ", "));
        }
        System.out.println();
    }

    /**
     * Prints the elements of an int array in a comma-separated format.
     * If the array is null or empty, prints nothing.
     *
     * @param numbers the array of int values to print, may be null or empty
     */
    private static void printArray(int[] numbers) {
        for (int index = 0; index < numbers.length; index++) {
            System.out.print(numbers[index] + (index == numbers.length - 1 ? "" : ", "));
        }
        System.out.println();
    }

    /**
     * Prints the elements of a long array in a comma-separated format.
     * If the array is null or empty, prints nothing.
     *
     * @param numbers the array of long values to print, may be null or empty
     */
    private static void printArray(long[] numbers) {
        for (int index = 0; index < numbers.length; index++) {
            System.out.print(numbers[index] + (index == numbers.length - 1 ? "" : ", "));
        }
        System.out.println();
    }

    /**
     * Prints the elements of a double array in a comma-separated format.
     * If the array is null or empty, prints nothing.
     *
     * @param numbers the array of double values to print, may be null or empty
     */
    private static void printArray(double[] numbers) {
        for (int index = 0; index < numbers.length; index++) {
            System.out.print(numbers[index] + (index == numbers.length - 1 ? "" : ", "));
        }
        System.out.println();
    }
}