package Nov.ex06112024Constructor3;

public class Lab_Constructor1{
    public static void main(String[] args) {
//Here by using default constructor we are creating 3 objects by passing same value to all objects
        //hence if we use parametrized constructor we can pass different value to all objects
        //Default constructor
        Car t = new Car();
        //Object1
        Car t1 = new Car();
        System.out.println("**Object1**");
        System.out.println(t1.model);
        System.out.println(t1.year);
        t1.display();

        //Object2
        Car t2 = new Car();
        System.out.println("**Object2**");
        System.out.println(t2.model);
        System.out.println(t2.year);
        t2.display();

        //Object3
        Car t3 = new Car();
        System.out.println("**Object3**");
        System.out.println(t3.model);
        System.out.println(t3.year);
        t3.display();
    }

}
class Car{
    String model;
    int year;
    //Default constructor
    Car()
    {
        model = "D Model";
        year = 1997;
        System.out.println("Default Constructor");
    }
    void display()
    {
        System.out.println("Display method");
    }

}
