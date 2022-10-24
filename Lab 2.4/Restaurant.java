import java.util.ArrayList;
import java.util.Currency;

public class Restaurant {
    protected String name;
    protected int yearFounded;
    protected String cuisine;
    protected static int numRest;
    protected int staff = 0;
    protected int maxCapacity = 50;
    protected int numGuests = 0;
    protected ArrayList<Double> reviews = new ArrayList<>();

    public Restaurant(String name, int yearFounded, String cuisine) {
        this.name = name;
        this.yearFounded = yearFounded;
        this.cuisine = cuisine;
        numRest++;
    }
    public static int numberOfRestaurants() {
        return numRest;
    }
    public void hireStaff(int num) {
        staff+=num;
    }
    public int getNumGuests(){
        return numGuests;
    }
    public void serveGuests(int guests) {
        if (this.numGuests+guests > maxCapacity) {
            System.out.println("Please wait to be seated");
        }
        else {
            System.out.println("Welcome, right this way");
            this.numGuests+=guests;
        }
    }
    public void checkPlease(int guests) {
        this.numGuests-=guests;
    }
    public String toString() {
        String res = "";
        res+= name+" serves "+cuisine+ " & was founded in "+yearFounded;
        return res;
    }
    public double leaveWelpReview(double stars) {
        reviews.add(stars);
        double sum = 0.0;
        for (double rev: reviews){
            sum+=rev;
        }
        return sum/reviews.size();
    }
}
