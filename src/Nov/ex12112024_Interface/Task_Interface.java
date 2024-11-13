package Nov.ex12112024_Interface;

public class Task_Interface
{
    public static void main(String[] args)
    {
        Product p = new Product();
        p.f1();
        //Check c = new Check(); We can't create an object of Interface as they are not complete
    }

}

class Product implements Check
{
     @Override
    public void f1() {

    }

    @Override
    public void f2() {

    }

    @Override
    public void f3() {

    }
}

interface Check
{
    void f1();
    void f2();
    void f3();
}
