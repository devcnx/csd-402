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
            double waterMassKg = 0;
            double initialTemperatureCelsius = 0;
            double finalTemperatureCelsius = 0;
            
            // Get water mass with validation
            while (true) {
                try {
                    String waterMassInput = JOptionPane.showInputDialog(
                        "Enter the Amount of Water (in Kilograms): ");
                    if (waterMassInput == null) return; // User clicked cancel
                    waterMassKg = Double.parseDouble(waterMassInput);
                    break;
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Please Enter a Valid Number for Water Mass.");
                }
            }
            
            // Get initial temperature with validation
            while (true) {
                try {
                    String initialTemperatureInput = JOptionPane.showInputDialog(
                        "Enter the Initial Temperature (in Celsius): ");
                    if (initialTemperatureInput == null) return; // User clicked cancel
                    initialTemperatureCelsius = Double.parseDouble(initialTemperatureInput);
                    break;
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Please Enter a Valid Number for Initial Temperature.");
                }
            }
            
            // Get final temperature with validation
            while (true) {
                try {
                    String finalTemperatureInput = JOptionPane.showInputDialog(
                        "Enter the Final Temperature (in Celsius): ");
                    if (finalTemperatureInput == null) return; // User clicked cancel
                    finalTemperatureCelsius = Double.parseDouble(finalTemperatureInput);
                    break;
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Please Enter a Valid Number for Final Temperature.");
                }
            }
            
            // Calculate energy (Q = m * c * ΔT)
            // c = specific heat capacity of water = 4184 J/kg°C
            final double SPECIFIC_HEAT_CAPACITY_WATER_J_PER_KG_C = 4184.0;
            double requiredEnergyJoules = waterMassKg * SPECIFIC_HEAT_CAPACITY_WATER_J_PER_KG_C * (finalTemperatureCelsius - initialTemperatureCelsius);
            
            // Display result
            JOptionPane.showMessageDialog(null, 
                String.format("The Energy Needed is: %,.2f Joules", requiredEnergyJoules));
                
            // Ask user if they want to perform another calculation
            int userContinueResponse = JOptionPane.showConfirmDialog(null, "Would you like to perform another calculation?", "Continue", JOptionPane.YES_NO_OPTION);
            if (userContinueResponse != JOptionPane.YES_OPTION) {
                break; // Exit the loop if user chooses No or closes the dialog
            }
        }
    }
}
   