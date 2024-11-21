package Nov.ex12112024_Interface;

public class Task_Interface3 {
    public static void main(String[] args) {

        SBI s = new SBI();
        System.out.println("SBI Rate of Intreset is : "+s.RateofInterest());
        PNB p = new PNB();
        System.out.println("SBI Rate of Intreset is: "+p.RateofInterest());
    }
}

interface Bank
{
    public float RateofInterest();
}

class SBI implements Bank
{
    public float RateofInterest()
    {
        return 7.9f;
    }

}

class PNB implements Bank
{
    public float RateofInterest()
    {
        return 7.2f;
    }
}