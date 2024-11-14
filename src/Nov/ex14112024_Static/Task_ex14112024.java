package Nov.ex14112024_Static;

public class Task_ex14112024 {
    public static void main(String[] args) {
        System.out.println(Student.schoolname);
        Student s = new Student();
        System.out.println(s.age);
        Student s1 = new Student();
//Here only once SIB is called but IIB will be called 2 times becoz two objects are created
        Student.schoolname="XYZ";
        System.out.println(s1.schoolname);
        System.out.println(s.schoolname);
    }
}

class Student
{    int age;
    public Student(int age)
    {
        this.age = age;
    }


    static String schoolname="ABC";

    //BLock of code is excuted when we create object
    {
        System.out.println("IIB, loaded everytime an object is created");
        System.out.println("Here you can write code what you want");
        System.out.println("Read mySQL db()");
    }

    static
    {
        System.out.println("SIB");
        System.out.println("SIB is Loaded once when class is loaded");
    }

    public Student() {

    }
}