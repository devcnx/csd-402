/**
 * This program defines a fan with speed, state (on/off), radius, and color.
 * It includes constants, constructors, getters and setters, and a toString method to manage the fan's state.
 * 
 * @author Brittaney Perry-Morgan
 * @version 1.0
 * @since 2025-09-07
 * 
 * Course: CSD402 Java for Programmers
 * Assignment: M6 Programming Assignment (Fan)
 */

public class Fan {
    // Four constants for speed
    public static final int STOPPED = 0;
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    // Private fields
    private int speed;
    private boolean on;
    private double radius;
    private String color;

    /**
     * No-argument constructor to create a fan with default settings.
     * Speed is STOPPED, fan is off, radius is 6, and color is "white".
     */
    public Fan() {
        this.speed = STOPPED;
        this.on = false;
        this.radius = 6;
        this.color = "white";
    }

    /**
     * Constructor to create a fan with specified parameters.
     * @param speed The speed of the fan (STOPPED, SLOW, MEDIUM, FAST).
     * @param on The state of the fan (true for on, false for off).
     * @param radius The radius of the fan.
     * @param color The color of the fan.
     */
    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    // Setter and Getter methods for mutable fields
    public int getSpeed() {
        return this.speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return this.on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Returns a string representation of the fan's state.
     * @return A string describing the fan's speed, color, radius, and on/off status.
     */
    @Override
    public String toString() {
        if (on) {
            String speedStr;
            switch (speed) {
                case SLOW:
                    speedStr = "SLOW";
                    break;
                case MEDIUM:
                    speedStr = "MEDIUM";
                    break;
                case FAST:
                    speedStr = "FAST";
                    break;
                default:
                    speedStr = "STOPPED";
                    break;
            }
            return "Fan is ON | Speed: " + speedStr + " | Color: " + color + " | Radius: " + radius;
        } else {
            return "Fan is OFF | Color: " + color + " | Radius: " + radius;
        }
    }
}