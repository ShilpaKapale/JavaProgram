package Nov.ex12112024_Abstraction;

public class Task_Abstract {


    class test extends loan
    {
        @Override
        void loan50k()
        {
            System.out.println("Giving 50k loan");
        }


        void loan30k()
        {
            System.out.println("Giving 30k loan");
        }
    }
}

abstract class loan
{
    abstract void loan50k();
    void load2L(){
        System.out.println("2L loan");
    }
}

//Concrete class

class person{}
class Student1{}
class Student2{}
class Student3{}