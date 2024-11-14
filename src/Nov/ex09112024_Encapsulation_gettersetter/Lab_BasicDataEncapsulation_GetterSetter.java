package Nov.ex09112024_Encapsulation_gettersetter;

public class Lab_BasicDataEncapsulation_GetterSetter {

    public static void main(String[] args) {

        Student s = new Student();
        s.setAge(10);
        s.setName("Kirthi");
        System.out.println(s.getAge());
        System.out.println(s.getName());
    }
}
//encapsulate the Student class data (fields like name and age) by making them
// private and providing public getter and setter methods for controlled access.
class Student{
    private String name;
    private int age;

    public void setAge(int age) {

        if (age>0)
        {
            this.age = age;
        }
        else {
            System.out.println("Enter Valid age");
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }



}
