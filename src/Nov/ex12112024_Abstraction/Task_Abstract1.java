package Nov.ex12112024_Abstraction;

public class Read_Abstract1 {
    public static void main(String[] args) {
        Child c = new Child();
        c.loan50k();
        c.loan25k();//Father class is hidden but child is giving loan this is abstraction
    }
}

class Child extends Father
{
    public void loan50k()
    {
        System.out.println("Child is giving the 50k loan");
    }
}

abstract class Father
    {
        abstract void loan50k();
        void loan25k()
        {
            System.out.println("25K loan");
        }
    }
