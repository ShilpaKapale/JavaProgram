package Nov.ex14112024_Static;

public class Task_ex14112024_1 {
    public static void main(String[] args)
    {
        Automation A1 = new Automation();
        Automation A2 = new Automation();
        System.out.println(A1.driver);
        System.out.println(A2.driver);

    }
}

class Automation
{
    static String driver = "Firefox";
}
