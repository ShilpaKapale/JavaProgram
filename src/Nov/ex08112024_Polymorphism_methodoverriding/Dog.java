package Nov.ex08112024_Polymorphism_methodoverriding;

public class Dog extends Animal{
    @Override
    public void eat()
    {
        System.out.println("Dog can eat");
    }
    @Override
    public void sound()
    {
        System.out.println("Dog can make sound and bark");
    }
}
