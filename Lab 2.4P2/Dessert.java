import java.util.EnumSet;

/* LAB 2.4, Part II: Inheritance - Dessert Hierarchy
 * LAB PARTNER A: Abhijit Nambiar
 * LAB PARTNER B: Rushil Kumar
 * PERIOD #: 7
 */
public class Dessert {
    // Fill this in!
    // 2 instance variables with set default values
    protected int calories;
    protected String name;
    // 1 class variable
    protected static int DessertCount = 0;
    
    // 1st constructor here (with 2 params)
    public Dessert(String name, int calories) {
        this.calories = calories;
        this.name = name;
        DessertCount++;
    }
    // 2nd constructor here (with 0 params)
    public Dessert(){
        this("Dessert", 100);
    }
    // 1st accessor here
    public String getName() {
        return name;
    }
    // 2nd accessor here
    public int getCalories() {
        return calories;
    }
    // 3rd accessor here
    public static int getNumDesserts() {
        return DessertCount;
    } 
    // toString() here
    public String toString(){
        return name+" has "+calories+" calories.";
    }
}

// Q2: Brownie - 1 instance var, 1 constructor, & 1 other method
class Brownie extends Dessert {
    private static int NumBrownies = 0;
    public Brownie() {
        super("Brownie", 132);
        NumBrownies++;
    }
    public static int getNumBrownies() {
        return NumBrownies;
    }
}
// Q3: Pie - 1 instance var & 1 constructor
class Pie extends Dessert {
    protected String name = "Pie";
    public Pie(String name, int calories) {
        super(name, calories);
    }
}
// Q4: Cookie - 2 constructors
class Cookie extends Dessert {
    public Cookie(String name, int calories) {
        super(name, calories);
    }
    public Cookie() {
        this("Chocolate Chip", 78);
    }
}
// Q5: Cake - Given
class Cake extends Dessert {
    public Cake(String name, int calories) {
        super(name, calories);
    }
}

// Q6: ApplePie - 1 instance var, 1 constructor, 1 other method,
// & 1 toString() which uses polymorphism
class ApplePie extends Pie {
    private int numSlices;
    public ApplePie(int numSlices) {
        super("Apple Pie", 67);
        this.numSlices = numSlices;
        System.out.println("This is a specific type of "+super.name);
    }
    public void eatSlice(){
        if (numSlices>=1) {
            System.out.println("1 slice for you :)");
            numSlices--;
        }
        else {
            System.out.println("No more pie :(");
        }
    }

    @Override
    public String toString() {
        return "Apple pie with "+numSlices+" left.";
    }
}
// Q7: BlackForestCake
class BlackForestCake extends Cake {
    private boolean exists;
    public BlackForestCake(boolean exists) {
        super("Black Forest Cake", 168);
        this.exists = exists;
    }
    public String isReal() {
        if(exists) {
            return "Aperture Science rewards you.";
        }
        else{
            return "The cake is a lie.";
        }
    }
}