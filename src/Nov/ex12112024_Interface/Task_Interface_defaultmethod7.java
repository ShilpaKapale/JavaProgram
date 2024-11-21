package Nov.ex12112024_Interface;

public class Task_Interface_defaultmethod7 {
    public static void main(String[] args) {
        ICICI1 c = new ICICI1();
        c.adharlink();
        c.minbal();
        c.deposit();
        c.withdraw();
        SBI1 s= new SBI1();
        s.deposit();
        s.withdraw();
        s.adharlink();
        s.minbal();
    }
}
interface RBI
{
    void deposit();
    void withdraw();
   default void adharlink()
   {
       System.out.println("link adhar - Interface default");
   }
    default void minbal()
    {
        System.out.println("Have mini 1000 balance - Interface default");
    }
}
//interface RBI_NewRule
//{
//    void adharlink();
//    void minbal();
//}

class SBI1 implements RBI
{
 public void deposit()
 {
     System.out.println("SBI deposit");
 }
 public void withdraw()
 {
     System.out.println("SBI withdraw");
 }
}

class ICICI1 implements RBI
{
    public void deposit()
    {
        System.out.println("ICICI1 deposit");
    }
    public void withdraw()
    {
        System.out.println("ICICI1 withdraw");
    }
    //Overidden default method
   public void adharlink()
    {
        System.out.println("ICICI1 link adhar - Overide default");
    }
    public void minbal()
    {
        System.out.println("ICICI1 Have mini 1000 balance - Overide default");
    }
}

class PNB1 implements RBI
{
    public void deposit()
    {
        System.out.println("PNB1 deposit");
    }
    public void withdraw()
    {
        System.out.println("PNB1 withdraw");
    }
}