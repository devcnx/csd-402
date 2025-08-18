/**
 * Course: CSD402 Java for Programmers
 * Assignment: M1 Programming Assignment (Water Energy Calculator)
 * Author: Brittaney Perry-Morgan
 * Date: 2025-08-17
 * Description: This program calculates the energy required to heat a given mass of  water
 * from an initial temperature to a final temperature.
 */

//  Import the JOptionPane class for creating user dialog boxes.
import javax.swing.JOptionPane;

/**
 * Representation of a Water Energy Calculator.
 * 
 * This public class WaterEnergyCalculator implements a simple command-line interface
 */
public class WaterEnergyCalculator {
    public static void main(String[] args) {
        while (true) {
            //  --- 1. Get the user's input.
            double waterMass = 0;
            double initialTemp = 0;
            double finalTemp = 0;
            
            // Get water mass with validation
            while (true) {
                try {
                    String waterMassString = JOptionPane.showInputDialog(
                        "Enter the Amount of Water (in Kilograms): ");
                    if (waterMassString == null) return; // User clicked cancel
                    waterMass = Double.parseDouble(waterMassString);
                    break;
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Please Enter a Valid Number for Water Mass.");
                }
            }
            
            // Get initial temperature with validation
            while (true) {
                try {
                    String initialTempString = JOptionPane.showInputDialog(
                        "Enter the Initial Temperature (in Celsius): ");
                    if (initialTempString == null) return; // User clicked cancel
                    initialTemp = Double.parseDouble(initialTempString);
                    break;
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Please Enter a Valid Number for Initial Temperature.");
                }
            }
            
            // Get final temperature with validation
            while (true) {
                try {
                    String finalTempString = JOptionPane.showInputDialog(
                        "Enter the Final Temperature (in Celsius): ");
                    if (finalTempString == null) return; // User clicked cancel
                    finalTemp = Double.parseDouble(finalTempString);
                    break;
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Please Enter a Valid Number for Final Temperature.");
                }
            }
            
            // Calculate energy (Q = m * c * ΔT)
            // c = specific heat capacity of water = 4184 J/kg°C
            final double SPECIFIC_HEAT_WATER = 4184.0;
            double energy = waterMass * SPECIFIC_HEAT_WATER * (finalTemp - initialTemp);
            
            // Display result
            JOptionPane.showMessageDialog(null, 
                String.format("The Energy Needed is: %,.2f Joules", energy));
                
            // Ask user if they want to perform another calculation
            int response = JOptionPane.showConfirmDialog(null, "Would you like to perform another calculation?", "Continue", JOptionPane.YES_NO_OPTION);
            if (response != JOptionPane.YES_OPTION) {
                break; // Exit the loop if user chooses No or closes the dialog
            }
        }
    }
}   