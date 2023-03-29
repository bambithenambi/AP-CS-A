public class Bird

{

    public void sing()

    {

        System.out.println("Cheep");

    }

}

class Duck extends Bird

{

    public void sing()

    {

        System.out.println("Quack");

    }

}

class Chicken extends Bird

{

    // No methods defined

}

class Rooster extends Chicken

{

    public void sing()

    {

        System.out.println("Cockadoodle doo");

    }

}