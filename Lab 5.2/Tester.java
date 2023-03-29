import Bird;
import Person;
import Hat;
import First;
import java.lang.Integer;
import java.util.Arrays;

public class Tester {
    public static void main(String args[]) {
        Integer[] bot = new Integer[3];
        System.out.println(Arrays.toString(bot));
        //#4
        /* 
        Bird ba = new Bird();
        Bird bb = new Chicken();
        Bird bc = new Rooster();

        //Chicken ca = new Bird(); doesnt work because you can't convert a parent to child
        Chicken cb = new Chicken();
        Chicken cc = new Rooster();

        //Rooster ra = new Bird(); doesnt work because you can't convert a parent to child
        //Rooster rb = new Chicken(); doesnt work because you can't convert a parent to child
        Rooster rc = new Rooster();
        ba.sing();
        //ca.sing(); 
        //ra.sing();

        bb.sing();
        cb.sing();
        //rb.sing();

        bc.sing();
        cc.sing();
        rc.sing();
        //everything behaves according to the object returned by the constructor that was called to initialize it
        */

        //#5
        /*
        Person p1 = new Person();
        //EvilPerson e1 = new Person(); doesnt work because you can't convert a parent to child
        //Henchman h1 = new Person(); doesnt work because you can't convert a parent to child
        p1.laugh();
        //e1.laugh();
        //h1.laugh();

        Person p2 = new EvilPerson();
        EvilPerson e2 = new EvilPerson();
        //Henchman h2 = new EvilPerson(); doesnt work because you can't convert a parent to child
        p2.laugh();
        e2.laugh();
        //h2.laugh();

        Person p3 = new Henchman();
        EvilPerson e3 = new Henchman();
        Henchman h3 = new Henchman();
        p3.laugh();
        e3.laugh();
        h3.laugh();

        //everything behaves according to the object returned by the constructor that was called to initialize it
        */

        //#7
        /*
        BallCap myHat1 = new BallCap("L", "Denver");
        System.out.println(myHat1);

        BallCap myHat2 = new BallCap("Denver", "L");
        System.out.println(myHat2); //fields are switched
        
        // BallCap myHat3 = new BallCap("L"); no constructor BallCap(String)
        // myHat3.team = "Denver";
        // System.out.println(myHat3);
        
        // Hat myHat4 = new Hat("L", "Denver"); no constructor Hat(String, String)
        // System.out.println(myHat4);
        
        // Hat myHat5 = new Hat("L"); 
        // myHat5.team = "Denver"; team is private attribute
        // System.out.println(myHat5);
        */

        //#13
        /*
        First sec = new Second(); // Line 1
        Second thr = new Third(); // Line 2
        sec.output(); // Line 3 needs to be declared as second to call output
        thr.output(); // Line 4

        Second sampleTwo = new Second();
        sampleTwo.output();
        //Second sampleOne = new First(); doesnt work because you can't convert a parent to child
        //sampleOne.output();
        */

        //#16
        /*
        Vehicle obj = new Vehicle(55); //not acessible in superclass
        System.out.println(obj);
        
        Vehicle obj = new Vehicle(55);
        System.out.println(toString(obj)); //tostring doesnt take any parameters
        
        Motorized obj = new Motorized(55); //requires two params
        System.out.println(obj);
        
        Vehicle obj = new Motorized(4, 55); //good
        System.out.println(obj);
        
        Motorized obj = new Motorized(4, 55); //tostring no params
        System.out.println(toString(obj));
        */
    }
}
