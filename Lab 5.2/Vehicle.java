public class Vehicle

{

    private int numOfWheels;

    public Vehicle(int nNumOfWheels)

    {

        numOfWheels = nNumOfWheels;

    }

    public String toString()

    {

        return "Number of Wheels: " + numOfWheels;

    }

}

class Motorized extends Vehicle

{

    private int maxSpeed;

    public Motorized(int nNumOfWheels, int nMaxSpeed)

    {

        super(nNumOfWheels);

        maxSpeed = nMaxSpeed;

    }

    public String toString()

    {

        String s = super.toString() + " Max Speed: ";

        if (maxSpeed <= 10)

        {

            s += "Slow";

        }

        else if (maxSpeed > 10 && maxSpeed <= 100)

        {

            s += "Fast";

        }

        else

        {

            s += "Super Speedy";

        }

        return s;

    }

}