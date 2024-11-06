package Nov.ex06112024Constructor;

public class Constructor_Employeee {
    public static void main(String[] args) //Runner Class
    {
        //Calling Default Constructor
        Employee e = new Employee();

        System.out.println(e.name);
        System.out.println(e.eid);
        System.out.println(e.joinyear);

        //Calling Default Constructor by assigning values in Runner class
        Employee e1 = new Employee();
        e1.name= "Sas";
        e1.eid = 4123;
        e1.joinyear = 2012;

        System.out.println(e1.name);
        System.out.println(e1.eid);
        System.out.println(e1.joinyear);
    }
}
