import java.util.*;

public class Circle {
    private double radius;
    private String color;
    private static int numCircles = 0;
    public Circle() {
        radius = 1.0;
        color = "red";
        numCircles++;
    }
    public Circle(double radius) {
        this.radius = radius;
        color = "red";
        numCircles++;
    }
    /**
    * Constructor for Circle Class that takes two arguments
    * @param radius double value of initial radius
    * @param color string value of initial color
    */
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
        numCircles++;
    }

    public double getRadius() {
        return radius;
    }
    public double getArea(){
        return radius*radius*Math.PI;
    }
    
    /**
    * Gets the string representing a circle object's color
    * @return the color of the circle as a string
    */
    public String getColor(){
        return color;
    }

    /**
    * Modifies the value of a circle object's radius
    * @param radius a double value of radius.
    * @return Nothing
    */
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public static int getNumCircles() {
        return numCircles;
    }
    public String toString() {
        String msg = "";
        msg += "Radius: "+radius+"\n";
        msg += "Color: "+color+"\n";
        msg += "Area: "+this.getArea()+"\n";
        return msg;
    }
}