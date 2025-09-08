/**
 * This program tests the functionality of the Fan class by creating two Fan instances
 * and displaying their states and behaviors.
 * 
 * @author Brittaney Perry-Morgan`
 * @version 1.0
 * @since 2025-09-07
 * 
 * Course: CSD402 Java for Programmers
 * Assignment: M6 Programming Assignment (Fan)
 */

public class TestFan {

    public static void main(String[] args) {
        // Create the first fan using the default constructor
        System.out.println("--- Fan 1 (using default constructor) ---");
        Fan fan1 = new Fan();
        System.out.println("Initial State: " + fan1.toString());

        // Display and test functionality for Fan 1
        fan1.setOn(true);
        fan1.setSpeed(Fan.MEDIUM);
        fan1.setRadius(12.0);
        fan1.setColor("blue");
        System.out.println("Modified State: " + fan1.toString());
        System.out.println("Current speed is: " + fan1.getSpeed());
        System.out.println("Is fan on? " + fan1.isOn());

        System.out.println("\n--- Fan 2 (using argument constructor) ---");

        // Create the second fan using the argument constructor
        Fan fan2 = new Fan(Fan.FAST, true, 8.0, "red");
        System.out.println("Initial State: " + fan2.toString());

        // Display and test functionality for Fan 2
        fan2.setOn(false);
        System.out.println("Modified State: " + fan2.toString());
        System.out.println("Current color is: " + fan2.getColor());
        System.out.println("Current radius is: " + fan2.getRadius());
        System.out.println("Is fan on? " + fan2.isOn());
    }
}