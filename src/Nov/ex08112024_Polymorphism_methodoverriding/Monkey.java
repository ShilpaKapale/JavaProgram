package Nov.ex08112024_Polymorphism_methodoverriding;

public class Monkey extends Animal{
    @Override
    public void eat()
    {
        System.out.println("Monkey can pick and eat with hand");
    }
    @Override
    public void sound()
    {
        System.out.println("Monkey can make sound and screech");
    }
}
