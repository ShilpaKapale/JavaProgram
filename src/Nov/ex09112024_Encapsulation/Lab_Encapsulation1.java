package Nov.ex09112024_Encapsulation;

import java.util.Scanner;

public class Lab_Encapsulation1
{
    public static void main(String[] args) {

        Person p = new Person("Kavya",356);
       // p.getName();
       // p.getPhno();
        System.out.println("Employee Name and phone is: " +p.getName() + " and "+p.getPhno());
        p.setName("Naveen");
        p.setPhno(735675467);

    }
}

class Person{
    public Person(String name, int phno) {
        this.name = name;
        this.phno = phno;
    }

Scanner sc =  new Scanner(System.in);

    public String getName() {
        System.out.println("Enter Employee Name: ");
        name = sc.next();
        return name;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("Employee Name is: "+name);
    }

    public int getPhno() {
        System.out.println("Enter Employee Phone: ");
        phno = sc.nextInt();
        return phno;
    }

    public void setPhno(int phno) {
        this.phno = phno;
        System.out.println("Employee Phone is: "+phno);
    }

    private String name;
    private int phno;
}
