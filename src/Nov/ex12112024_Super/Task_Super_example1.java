package Nov.ex12112024_Super;

public class Task_Super_example1 {
    public static void main(String[] args) {

        Employee e = new Employee(1,"Somya",120000f);
        e.display();
    }
}

class Person
{
    int id;
    String name;

    public Person(int id, String name)
    {
        this.id = id;
        this.name = name;
    }
}

//Here Employee class inherits Person class, So that all properties are inherited and initialized using
//parent class constructor from child constructor

class Employee extends Person
{
    float Salary;

    public Employee(int id, String name, float Salary)
    {
        //Calling constructor of Person class.
        // While employee constructor is called person constructor is executed.
        super(id, name);
        this.Salary= Salary;
    }

    void display()
    {
        System.out.println(id+" "+name+" "+Salary);
    }

}



