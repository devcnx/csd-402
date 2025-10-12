
/**
 * Demonstrates creating and displaying multiple Fan objects.
 * Contains methods to display single and multiple Fan instances without using
 * the toString() method.
 * 
 * Course: CSD402 Java for Programmers
 * Assignment: M7 Programming Assignment
 * 
 * @author Brittaney Perry-Morgan
 * @version 1.0
 * 
 */

import java.util.ArrayList;
import java.util.List;

public class UseFans {

    /**
     * Displays a single Fan instance without using the toString() method.
     * 
     * @param fan the Fan object to display
     */
    public static void displayFan(Fan fan) {
        System.out.println("Speed: " + getSpeedText(fan.getSpeed()));
        System.out.println("On: " + (fan.isOn() ? "Yes" : "No"));
        System.out.println("Radius: " + fan.getRadius());
        System.out.println("Color: " + fan.getColor());
        System.out.println("-------------------------------------------------------");
    }

    /**
     * Displays all Fan instances in a collection without using toString().
     * 
     * @param fans a list of Fan objects
     */
    public static void displayFans(List<Fan> fans) {
        System.out.println("Displaying Multiple Fan Instances: ");
        for (Fan fan : fans) {
            System.out.println("Displaying Fan Instance #" + fan.getSpeed() + ": ");
            displayFan(fan);
        }
    }

    /**
     * Converts Fan speed constants to readable text.
     * 
     * @param speed Fan speed constant
     * @return a readable string representation of the speed
     */
    private static String getSpeedText(int speed) {
        switch (speed) {
            case Fan.SLOW:
                return "SLOW";
            case Fan.MEDIUM:
                return "MEDIUM";
            case Fan.FAST:
                return "FAST";
            default:
                return "UNKNOWN";
        }
    }

    /**
     * Creates a sample collection of Fan objects for demonstration.
     * 
     * @return a list of sample Fan instances
     */
    public static List<Fan> createSampleFans() {
        List<Fan> fans = new ArrayList<>();
        fans.add(new Fan(Fan.SLOW, true, 5.0, "blue"));
        fans.add(new Fan(Fan.MEDIUM, false, 10.0, "green"));
        fans.add(new Fan(Fan.FAST, true, 15.0, "red"));
        return fans;
    }

    /**
     * Main method used to demonstrate UseFans functionality.
     */
    public static void main(String[] args) {
        List<Fan> fanList = createSampleFans();
        displayFans(fanList);

        System.out.println("\nDisplaying a  Single Fan Instance: ");
        displayFan(fanList.get(0));
    }
}