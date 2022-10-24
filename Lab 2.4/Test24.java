import java.util.Arrays;

public class Test24 {
    public static void main(String[] args) {
        Restaurant r = new Restaurant("chickfila", 1949, "chicken sandwiches and nuggets");
        UpNDown u = new UpNDown();
        System.out.println(Restaurant.numberOfRestaurants());
        r.serveGuests(40);
        r.serveGuests(11);
        System.out.println(r.getNumGuests());
        r.serveGuests(4);
        System.out.println(r.getNumGuests());
        r.checkPlease(5);
        System.out.println(r.getNumGuests());
        u.serveGuests(80);
        System.out.println(u.getNumGuests());
        u.serveGuests(8);
        System.out.println(u.getNumGuests());
        u.serveGuests(5);
        System.out.println(u.getNumGuests());
        u.checkPlease(5);
        System.out.println(u.getNumGuests());
        System.out.println(r.leaveWelpReview(4.5));
        System.out.println(r.leaveWelpReview(3.9));
        System.out.println(r.leaveWelpReview(3.2));
        System.out.println(u.leaveWelpReview(4.1));
        System.out.println(u.leaveWelpReview(1.7));
        System.out.println(u.leaveWelpReview(4.8));
        System.out.println(Arrays.toString(u.takeOrder("double double", "fries", "chocolate shake")));
        System.out.println(Arrays.toString(u.takeOrder("classic", "salad", "strawberry shake")));
    }
}
