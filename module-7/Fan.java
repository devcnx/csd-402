/**
 * Refactored Fan class for improved readability and consistent use of `this`
 * reference.
 * 
 * Course: CSD402 Java for Programmers
 * Assignment: M7 Programming Assignment
 * 
 * @author Brittaney Perry-Morgan
 * @version 1.0
 */

public class Fan {
    // Constant values for the fan speed.
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    // Private instance variables.
    private int speed;
    private boolean on;
    private double radius;
    private String color;

    /**
     * Default constructor initializing the fan with default values.
     */
    public Fan() {
        this.speed = SLOW;
        this.on = false;
        this.radius = 5;
        this.color = "blue";
    }

    /**
     * Parameterized constructor for a custom fan configuration.
     * 
     * @param speed  the speed of the fan (SLOW, MEDIUM, FAST)
     * @param on     the state of the fan (true = on, false = off)
     * @param radius the radius of the fan
     * @param color  the color of the fan
     */
    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    /** Public getter for speed */
    public int getSpeed() {
        return this.speed;
    }

    /** Public setter for speed */
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    /** Public getter for on */
    public boolean isOn() {
        return this.on;
    }

    /** Public setter for on */
    public void setOn(boolean on) {
        this.on = on;
    }

    /** Public getter for radius */
    public double getRadius() {
        return this.radius;
    }

    /** Public setter for radius */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /** Public getter for color */
    public String getColor() {
        return this.color;
    }

    /** Public setter for color */
    public void setColor(String color) {
        this.color = color;
    }

    /** Display the fan's details (without using toString()) */
    public void displayFanDetails() {
        System.out.println("Fan Details: ");
        System.out.println("Speed: " + this.getSpeedAsText());
        System.out.println("On: " + (this.isOn() ? "Yes" : "No"));
        System.out.println("Radius: " + this.radius);
        System.out.println("Color: " + this.color);
        System.out.println("-------------------------------------------------------");
    }

    /**
     * Converts the speed constant to readable text.
     * 
     * @return a string representing the speed level.
     */
    private String getSpeedAsText() {
        switch (this.speed) {
            case SLOW:
                return "SLOW";
            case MEDIUM:
                return "MEDIUM";
            case FAST:
                return "FAST";
            default:
                return "UNKNOWN";
        }
    }
}