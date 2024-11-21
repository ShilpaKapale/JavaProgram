package Nov.ex12112024_Super;
// super is used to invoke parent class constructor.
public class Task_Super_example4 {
    public static void main(String[] args)
    {
        Dog2 d = new Dog2();
    }
}

class Animal2
{
    void eat()
    {
        System.out.println("Animal eating!");
    }
}

class Dog2 extends Animal2
{
    public Dog2() {
        super();// super is used to invoke parent class constructor.
    }
}
