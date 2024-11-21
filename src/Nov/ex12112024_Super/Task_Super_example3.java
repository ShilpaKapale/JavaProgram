package Nov.ex12112024_Super;

public class Task_Super_example3
{
    public static void main(String[] args) {
    Dog1 d = new Dog1();
    d.Work();
    }

}

class Animal1
{
    int age;
    void eat ()//Parent class method
        {
            System.out.println("Animal eating..!");
        }
}

class Dog1 extends Animal1
{
    String color = "Brown";
    public Dog1() {
        super();
    }

    void eat()
    {
        System.out.println("Dog is eating..!");
    }

    void bark()
    {
        System.out.println("Dog is barking..!");
    }
    void Work()
    {
        super.eat();// super can be used to invoke parent class method
        System.out.println(super.age);//parent instance variable
        bark();//child class method
        System.out.println(color +"is Color of Dog");//Child class instance variable
    }
}