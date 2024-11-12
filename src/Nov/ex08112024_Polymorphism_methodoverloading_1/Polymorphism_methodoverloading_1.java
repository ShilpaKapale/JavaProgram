package Nov.ex08112024_Polymorphism_methodoverloading_1;

public class Polymorphism_methodoverloading_1 {
    public static void main(String[] args) {

        Assistance a = new Assistance();
        a.sayHello("Sarswati");
        a.sayHello("Kavya","Sony","Mike","Hust");
    }
}

class Assistance
{
    public void sayHello(String Guest)
    {
        System.out.println("Hello    " +Guest +"!");
    }

    public void sayHello(String... names)
    {
        for (String name : names)
        {
            System.out.println("Hello    " + name + "!");
        }
    }
}

