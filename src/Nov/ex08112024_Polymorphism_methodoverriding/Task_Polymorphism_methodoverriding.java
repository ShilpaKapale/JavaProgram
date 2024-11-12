package Nov.ex08112024_Polymorphism_methodoverriding;

public class Task_Polymorphism_methodoverriding
{
    public static void main(String[] args) {

        Dog d1 = new Dog();
        //Method of parent not override
        d1.Welcome();

       // @Override
        d1.sound();
        d1.eat();

        Monkey m1 = new Monkey();
        //@Override
        m1.sound();
        m1.eat();
    }
}
