/**
 * 
 * 
 * Course: CSD402 Java for Programmers
 * Assignment: M7 Programming Assignment
 * 
 * @author Brittaney Perry-Morgan
 * @version 1.0
 * 
 */

/**
 * Tests the Fan class individually. Verifies constructors, getters, setters,
 * and display methods.
 */
public class TestFan {
    public static void main(String[] args) {
        System.out.println("===== MODULE 7 : Testing the Fan Class.... ");

        // 1. Test the default constructor
        System.out.println("Test 1: Default Constructor");
        Fan defaultFan = new Fan();
        defaultFan.displayFanDetails();

        // 2. Test parameterized constructor
        System.out.println("Test 2: Parameterized Constructor");
        Fan customFan = new Fan(Fan.FAST, true, 12.0, "red");
        customFan.displayFanDetails();

        // 3. Test setting and getting values
        System.out.println("Test 3: Setters and Getters Validation");
        customFan.setSpeed(Fan.MEDIUM);
        customFan.setOn(false);
        customFan.setRadius(15.0);
        customFan.setColor("blue");

        customFan.displayFanDetails();

        // 4. Edge case for invalid speed
        System.out.println("Test 4: Edge Case - Invalid Speed");
        Fan edgeFan = new Fan(99, true, 6.0, "gray");
        edgeFan.displayFanDetails();

        // 5. Multiple fan instances
        System.out.println("Test 5: Multiple Fans");
        Fan fan1 = new Fan(Fan.SLOW, true, 5.0, "blue");
        Fan fan2 = new Fan(Fan.FAST, false, 4.0, "orange");
        Fan fan3 = new Fan(Fan.MEDIUM, true, 20.0, "yellow");

        fan1.displayFanDetails();
        fan2.displayFanDetails();
        fan3.displayFanDetails();

        System.out.println("===== End of Fan Class Tests.");
    }
}