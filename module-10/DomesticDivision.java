/**
 * DomesticDivision
 * 
 * Represents a domestic division of a company.
 * 
 * Course: CSD402 Java for Programmers
 * Assignment: M10 Programming Assignment
 * 
 * @author Brittaney Perry-Morgan
 * @version 1.0
 */
public class DomesticDivision extends Division {
    private String state;

    /**
     * Constructor for DomesticDivision.
     * 
     * @param divisionName  The name of the division
     * @param accountNumber The account number for the division
     * @param state         The state where the division is located
     */
    public DomesticDivision(String divisionName, int accountNumber, String state) {
        super(divisionName, accountNumber);
        if (state == null || state.trim().isEmpty()) {
            throw new IllegalArgumentException("State cannot be null or empty");
        }
        this.state = state;
    }

    /**
     * Displays domestic division information.
     */
    @Override
    public void display() {
        System.out.println("Domestic Division:");
        System.out.println("  Division Name: " + getDivisionName());
        System.out.println("  Account #: " + getAccountNumber());
        System.out.println("  State: " + state);
        System.out.println();
    }
}
