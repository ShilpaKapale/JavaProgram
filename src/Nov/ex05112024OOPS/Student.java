package Nov.ex05112024OOPS;

public class Student {

    //Attributes | data members | instance variables | fields | member variables
    String name;
    int age;
    long phoneno;
    boolean isMale;
    char grade;

    //  B - Behaviour | methods | member functions
    void eat(int a)
    {
             System.out.println(name + " is eating " + a + " times");
    }
    void sleep()
    {
           System.out.println(name + " is sleeping");
    }
    void study()
    {
        System.out.println(name + " is studying");
    }

}
