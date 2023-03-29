public class Hat

{

    private String size;

    public Hat(String s)

    {

        size = s;

    }

    public String toString()

    {

        return "Size " + size + " hat";

    }

}

class BallCap extends Hat

{

    private String team;

    public BallCap(String mySize, String myTeam)

    {

        super(mySize);

        team = myTeam;

    }

    public String toString()

    {

        return super.toString() + " with " + team + " logo";

    }

}