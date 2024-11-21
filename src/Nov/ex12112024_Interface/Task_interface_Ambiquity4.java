package Nov.ex12112024_Interface;

public class Task_interface_Ambiquity4 {
    public static void main(String[] args) {
    Test t = new Test();

    t.print();
    }
}
interface Printable
{
    void print();
}

interface Showable
{
    void print();
}

class Test implements Printable,Showable
{
    //Printable and Showable interface have same
    // methods but its implementation is provided by class TestTnterface1,
    // there is no ambiguity.
    public void print()
    {
        System.out.println("Hello Welcome");
    }

}