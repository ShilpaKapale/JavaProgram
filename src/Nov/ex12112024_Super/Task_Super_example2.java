package Nov.ex12112024_Super;

//Super is used to refer parent class instance variable
public class Task_Super_example2
{
    public static void main(String[] args) {
        Dog d = new Dog();
        d.printColor();
    }

}

class Animal
{
  String color = "White";
}

class Dog extends Animal
{
    String color = "Brown";

    void printColor()
    {
        System.out.println("Child: "+color);//prints color of Dog class
        System.out.println("Parent: "+super.color);//prints color of Animal class calling parent instance variable
    }

}
