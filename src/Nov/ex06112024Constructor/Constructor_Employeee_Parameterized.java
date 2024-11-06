package Nov.ex06112024Constructor;

public class Constructor_Employeee_Parameterized {

    public static void main(String[] args) {


        //Calling Parameterized Constructor with different value

        Employee ep = new Employee("Kavya", 555, 2014); //Calling Parameterized Constructor
        System.out.println(ep.name);
        System.out.println(ep.eid);
        System.out.println(ep.joinyear);

        Employee ep1 = new Employee("Holy", 345, 2011);//Calling Parameterized Constructor
        System.out.println(ep1.name);
        System.out.println(ep1.eid);
        System.out.println(ep1.joinyear);

        Employee ep2 = new Employee("Sweety", 289, 2008);//Calling Parameterized Constructor
        ep2.display();
    }
}
