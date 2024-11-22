package Nov.ex21112024;

import java.util.ArrayList;
import java.util.List;

public class Task_ArrayList {
    public static void main(String[] args) {


        Student ss1 = new Student("Anisha",1);
        Student ss2 = new Student("Home",2);
        Student ss3 = new Student("Neeta",3);
//Using generic next line storing Student object
        List<Student> ms=new ArrayList<>();

        ms.add(ss1);
        ms.add(ss2);
        ms.add(ss3);

        ss1.printDetails();
        ss2.printDetails();
        ss3.printDetails();

        System.out.println(ms);//Hashcode or Object refernce or location r getting stored

    }
}

class Student
{
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getRollno() {
        return rollno;
    }

    public void setRollno(Integer rollno) {
        this.rollno = rollno;
    }

    private String name;
    private Integer rollno;

    public Student(String name, Integer rollno) {
        this.name = name;
        this.rollno = rollno;
    }

    public void printDetails()
    {
        System.out.println("Student Name: "+this.name);
        System.out.println("Student Roll No: "+this.rollno);
    }

}
//OUTPUT
//Student Name: Anisha
//Student Roll No: 1
//Student Name: Home
//Student Roll No: 2
//Student Name: Neeta
//Student Roll No: 3