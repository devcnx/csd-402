
/**
 * Tests for the UseFans class.
 * 
 * Course: CSD402 Java for Programmers
 * Assignment: M7 Programming Assignment
 * 
 * @author Brittaney Perry-Morgan
 * @version 1.0
 * 
 */

import java.util.List;

public class TestUseFans {

    public static void main(String[] args) {
        System.out.println("===== Module 7: Testing UseFans Class\n");

        // 1. Create collection of fans
        System.out.println("Test 1: Creating a Fan Collection");
        List<Fan> fanCollection = UseFans.createSampleFans();

        // 2. Display all fans
        System.out.println("Test 2: Display All Fans");
        UseFans.displayFans(fanCollection);

        // 3. Display a single fan from collection
        System.out.println("Test 3: Display Single Fan from Collection");
        UseFans.displayFan(fanCollection.get(1));

        // 4. Modify and re-display one fan
        System.out.println("Test 4: Modify and Display Updated Fan");
        Fan updatedFan = fanCollection.get(0);
        updatedFan.setSpeed(Fan.SLOW);
        updatedFan.setColor("teal");
        updatedFan.setOn(false);
        updatedFan.displayFanDetails();

        // 5. Verify collection integrity
        System.out.println("Test 5: Collection Size Check");
        System.out.println("Expected fan count: 3 | Actual fan count: " + fanCollection.size());

        System.out.println("\n===== End of UseFans Class Tests");
    }
}
