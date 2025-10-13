/**
 * Division
 * 
 * Abstract base class for company divisions.
 * 
 * Course: CSD402 Java for Programmers
 * Assignment: M10 Programming Assignment
 * 
 * @author Brittaney Perry-Morgan
 * @version 1.0
 */
public abstract class Division {
    // Changed to protected for better encapsulation
    protected String divisionName;
    protected int accountNumber;

    /**
     * Constructor for the Division class.
     * 
     * @param divisionName  The name of the division
     * @param accountNumber The account number for the division
     */
    public Division(String divisionName, int accountNumber) {
        this.divisionName = divisionName;
        this.accountNumber = accountNumber;
    }

    /**
     * Displays division information.
     * Must be implemented by subclasses.
     */
    public abstract void display();
    
    // Getters for subclasses to access the fields
    public String getDivisionName() {
        return divisionName;
    }
    
    public int getAccountNumber() {
        return accountNumber;
    }
}