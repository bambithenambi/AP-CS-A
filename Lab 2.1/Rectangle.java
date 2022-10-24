/* Abhijit Nambiar
 * Nathan Lo
 * Period 7
 */
import java.util.*;
import java.lang.*;
public class Rectangle {
    private double width;
    private double length;
/**
   * This is the constructor of a rectangle.
   * @param length
   * @param width 
   * @return no
   */ 
    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }
/**
   * This is the getter method for length.
   * @param Unused.
   * @return double length.
   */
    public double getLength() {
        return length;
    }
    public double getWidth() {
        return width;
    }
    public double getArea() {
        return width*length;
    }
    public double getPerimeter() {
        return 2*(length+width);
    }
    public double getLengthDiagonal() {
        return Math.sqrt(length*length+width*width);
    }
    public String toString() {
        String rec = "";
        rec += "Width: " + getWidth() + "\n";
        rec += "Length: " + getLength() + "\n";
        return rec;
    }
    public String whichIsLarger(Rectangle foo) {
        if (this.getArea()>foo.getArea()) {
            return this.toString();
        }
        else {
            return foo.toString();
        }
    }
}
