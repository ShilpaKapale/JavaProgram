package Nov.ex06112024Constructor;

public class Employee {

    String name;
     int eid;
     int joinyear;


//Default Constructor
Employee()
{
    eid = 56743;
    name = "Mist";
    joinyear = 2010;
    System.out.println("DC executed");
}

    //Parameterized Constructor
    Employee(String name, int eid, int joinyear)
    {
        System.out.println("Parameterized Constructor executed");
        this.name = name;
        this.eid = eid;
        this.joinyear = joinyear;

    }
    void display()

    {
        System.out.println("Parameterized Constructor executed with method/behaviour called");
        System.out.println(name);
        System.out.println(eid);
        System.out.println(joinyear);

    }
}
