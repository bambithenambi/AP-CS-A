/* Abhijit Nambiar
 * Nathan Lo
 * Period 7
 */
import java.util.*;
import java.lang.*;
public class RectangleTester {
    public static void main(String[] args) {
        Rectangle mine = new Rectangle(3.0, 4.0);
        
        System.out.println(mine.getLength());
        System.out.println(mine.getWidth());
        System.out.println(mine.getLengthDiagonal());
        System.out.println(mine.getArea());
        System.out.println(mine.getPerimeter());
        System.out.println(mine);
        Rectangle opp = new Rectangle(2.5, 6.0);
        System.out.println(opp.whichIsLarger(mine));
        
    }
}
