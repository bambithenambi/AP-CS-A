public class UpNDown extends Restaurant {
    public UpNDown() {
        super("UpNDown", 1948, "burgers and fries");
        this.maxCapacity = 88; 
    }
    public String[] takeOrder(String burgerType, String sideDish, String drink) {
        String[] order = {burgerType, sideDish, drink};
        return order;
    }
    @Override
    public void serveGuests(int guests) {
        if (this.numGuests+guests > maxCapacity) {
            System.out.println("Please use the Drive-Thru");
        }
        else {
            System.out.println("Please seat yourself");
            this.numGuests+=guests;
        }
    }
}
