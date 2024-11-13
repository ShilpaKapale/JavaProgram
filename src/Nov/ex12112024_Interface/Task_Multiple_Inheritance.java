package Nov.ex12112024_Interface;

public class Task_Multiple_Inheritance {
    public static void main(String[] args) {

    }
}

class Kavyachild implements Father, Mother
{
    @Override
    public void f1() {

    }

    @Override
    public void f2() {

    }

    @Override
    public void same() {
        System.out.println("Only one Same method");
    }


    @Override
    public void f3() {

    }

    @Override
    public void f4() {

    }

}

interface Father
{
    void f1();
    void f2();
    void same();

}

interface Mother
{

    void f3();
    void f4();
    void same();
}
