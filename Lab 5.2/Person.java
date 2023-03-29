public class Person

{

    public void laugh()

    {

        System.out.print("Hahaha");

    }

}

class EvilPerson extends Person

{

    public void laugh()

    {

        System.out.print("Mwahahaha");

    }

}

class Henchman extends EvilPerson

{

    // No methods defined

}