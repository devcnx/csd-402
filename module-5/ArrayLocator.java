/**
 * This program uses nested for loops to locate the largest and smallest elements in two-dimensional arrays,
 * as required by the assignment.
 * 
 * @author Brittaney Perry-Morgan
 * @version 1.0
 * @since 2025-09-07
 * 
 * Course: CSD402 Java for Programmers
 * Assignment: M5 Programming Assignment (Array Locator)
 */

import java.util.Arrays;
 
public class ArrayLocator {

    /**
     * Locates the largest element in a two-dimensional double array.
     * 
     * @param arrayParam The two-dimensional double array.
     * @return A one-dimensional integer array containing the row and column of the largest element.
     */
    public static int[] locateLargest(double[][] arrayParam) {
        if (arrayParam == null || arrayParam.length == 0) {
            return new int[]{-1, -1};
        }

        int[] location = {0, 0};
        double largestValue = arrayParam[0][0];

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] > largestValue) {
                    largestValue = arrayParam[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }
        return location;
    }

    /**
     * Locates the largest element in a two-dimensional integer array.
     * 
     * @param arrayParam The two-dimensional integer array.
     * @return A one-dimensional integer array containing the row and column of the largest element.
     */
    public static int[] locateLargest(int[][] arrayParam) {
        if (arrayParam == null || arrayParam.length == 0) {
            return new int[]{-1, -1};
        }

        int[] location = {0, 0};
        int largestValue = arrayParam[0][0];

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] > largestValue) {
                    largestValue = arrayParam[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }
        return location;
    }

    /**
     * Locates the smallest element in a two-dimensional double array.
         * @param arrayParam The two-dimensional double array.
     * @return A one-dimensional integer array containing the row and column of the smallest element.
     */
    public static int[] locateSmallest(double[][] arrayParam) {
        if (arrayParam == null || arrayParam.length == 0) {
            return new int[]{-1, -1};
        }

        int[] location = {0, 0};
        double smallestValue = arrayParam[0][0];

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] < smallestValue) {
                    smallestValue = arrayParam[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }
        return location;
    }

    /**
     * Locates the smallest element in a two-dimensional integer array.
     * 
     * @param arrayParam The two-dimensional integer array.
     * @return A one-dimensional integer array containing the row and column of the smallest element.
     */
    public static int[] locateSmallest(int[][] arrayParam) {
        if (arrayParam == null || arrayParam.length == 0) {
            return new int[]{-1, -1};
        }

        int[] location = {0, 0};
        int smallestValue = arrayParam[0][0];

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] < smallestValue) {
                    smallestValue = arrayParam[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }
        return location;
    }

    /**
     * Main method to test all four overloaded methods.
     */
    public static void main(String[] args) {
        // Test with a double array
        double[][] doubleArray = {
            {1.1, 4.5, 6.7},
            {8.9, 0.2, 5.3},
            {7.4, 3.8, 9.6}
        };

        System.out.println("--- Testing with a double array ---");
        System.out.println("Original Array:");
        for (double[] row : doubleArray) {
            System.out.println(Arrays.toString(row));
        }

        int[] largestLocationDouble = locateLargest(doubleArray);
        System.out.printf("Largest element located at: [%d, %d] with value: %.2f%n",
            largestLocationDouble[0], largestLocationDouble[1],
            doubleArray[largestLocationDouble[0]][largestLocationDouble[1]]);

        int[] smallestLocationDouble = locateSmallest(doubleArray);
        System.out.printf("Smallest element located at: [%d, %d] with value: %.2f%n",
            smallestLocationDouble[0], smallestLocationDouble[1],
            doubleArray[smallestLocationDouble[0]][smallestLocationDouble[1]]);

        System.out.println("\n" + "--- Testing with an integer array ---");

        // Test with an int array
        int[][] intArray = {
            {10, 5, 20},
            {3, 15, 8},
            {25, 12, 1}
        };

        System.out.println("Original Array:");
        for (int[] row : intArray) {
            System.out.println(Arrays.toString(row));
        }

        int[] largestLocationInt = locateLargest(intArray);
        System.out.printf("Largest element located at: [%d, %d] with value: %d%n",
            largestLocationInt[0], largestLocationInt[1],
            intArray[largestLocationInt[0]][largestLocationInt[1]]);

        int[] smallestLocationInt = locateSmallest(intArray);
        System.out.printf("Smallest element located at: [%d, %d] with value: %d%n",
            smallestLocationInt[0], smallestLocationInt[1],
            intArray[smallestLocationInt[0]][smallestLocationInt[1]]);
    }
}