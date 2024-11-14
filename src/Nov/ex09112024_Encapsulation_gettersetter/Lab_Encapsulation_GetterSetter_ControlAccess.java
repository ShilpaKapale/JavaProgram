package Nov.ex09112024_Encapsulation_gettersetter;

public class Lab_Encapsulation_GetterSetter_ControlAccess
{
    public static void main(String[] args) {

        EmployeeGS e = new EmployeeGS();
        e.setName("Sony");
        e.setAge(25);
        e.setSalary(100000);
        System.out.println(e.getName());
        System.out.println(e.getAge());
        System.out.println(e.getSalary());

    }
}
//Implementing Java encapsulation by using private fields and providing
// public getter and setter methods to control access to those fields
class EmployeeGS
{
    private String name;
    private int age;
    private int salary;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if(age>0)
        {
            this.age = age;
        }

        else
        {
            System.out.println("Invalid age");
        }
    }

    public void setSalary(int salary) {
        if (salary>0)
        {
            this.salary = salary;
        }
        else
        {
            System.out.println("Enter a valid salary");
        }
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

}
