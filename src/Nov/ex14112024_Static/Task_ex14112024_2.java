package Nov.ex14112024_Static;

public class Task_ex14112024_2
{
    public static void main(String[] args)
    {
        ATB s1 = new ATB("Amit");
        ATB s2 = new ATB("Rahul");
        ATB s3 = new ATB("Tushar");
        ATB s4 = new ATB("Monisha");
        ATB s5;
        new ATB("Pornima");
        //Non static method called with variable
        s1.readDocument();
        s2.readDocument();

        //Static method and variable loaded when class is loaded but executed when called by class name
        ATB.doAssignemnt();//Static method
        System.out.println(ATB.courseName);//static variable

    }
}

class ATB
{
    {
        //Loaded when object is created
        System.out.println("IIB");

    }
    static //Loaded when class is loaded
    {
        System.out.println("SIB");
        System.out.println("Load the class?, I will execute SIB");
    }


    private String name;
    private int age;
    static String courseName = "ATB";//Loaded when class is loaded

    public ATB(String name) {
        this.name = name;
    }


    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    static void doAssignemnt()
    {
        System.out.println("ATB Assignment");
    }

    void readDocument()
    {
        System.out.println("Non static method");
        System.out.println("course name");
    }

}
