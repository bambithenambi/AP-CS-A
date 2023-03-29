public class First

{

    public void output1()

    {

        output2();

    }

    public void output2()

    {

        output3();

    }

    public void output3()

    {

        System.out.print("First");

    }

}

class Second extends First

{

    public void output()

    {

        output1();

        output2();

        output3();

    }

}

class Third extends Second

{

    public void output3()

    {

        System.out.print("Third");

    }

}