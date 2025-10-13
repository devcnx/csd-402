/**
 * InternationalDivision
 * 
 * Represents an international division of a company.
 * 
 * Course: CSD402 Java for Programmers
 * Assignment: M10 Programming Assignment
 * 
 * @author Brittaney Perry-Morgan
 * @version 1.0
 */
public class InternationalDivision extends Division {
    private String country;
    private String language;

    /**
     * Constructor for InternationalDivision.
     * 
     * @param divisionName  The name of the division
     * @param accountNumber The account number for the division
     * @param country       The country where the division is located
     * @param language      The primary language spoken in the division
     */
    public InternationalDivision(String divisionName, int accountNumber,
            String country, String language) {
        super(divisionName, accountNumber);
        if (country == null || country.trim().isEmpty()) {
            throw new IllegalArgumentException("Country cannot be null or empty");
        }
        if (language == null || language.trim().isEmpty()) {
            throw new IllegalArgumentException("Language cannot be null or empty");
        }
        this.country = country;
        this.language = language;
    }

    /**
     * Displays international division information.
     */
    @Override
    public void display() {
        System.out.println("International Division:");
        System.out.println("  Division Name: " + getDivisionName());
        System.out.println("  Account #: " + getAccountNumber());
        System.out.println("  Country: " + country);
        System.out.println("  Language: " + language);
        System.out.println();
    }
}