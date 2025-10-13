/**
 * UseDivision
 * 
 * Demonstrates the use of Division, DomesticDivision, and InternationalDivision classes.
 * 
 * Course: CSD402 Java for Programmers
 * Assignment: M10 Programming Assignment
 * 
 * @author Brittaney Perry-Morgan
 * @version 1.0
 */
public class UseDivision {
    public static void main(String[] args) {
        // Create two DomesticDivision instances
        DomesticDivision domestic1 = new DomesticDivision("North", 1001, "California");
        DomesticDivision domestic2 = new DomesticDivision("South", 1002, "Texas");
        
        // Create two InternationalDivision instances
        InternationalDivision international1 = new InternationalDivision("Europe", 2001, "Germany", "German");
        InternationalDivision international2 = new InternationalDivision("Asia", 2002, "Japan", "Japanese");
        
        // Display all divisions
        System.out.println("Displaying all divisions:");
        System.out.println("------------------------");
        
        domestic1.display();
        domestic2.display();
        international1.display();
        international2.display();
    }
}
