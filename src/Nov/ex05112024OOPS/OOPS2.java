package Nov.ex05112024OOPS;

public class OOPS2 {
    public static void main(String[] args) {

        Cat c = new Cat();
        c.name = "Kitty";
        c.sound();
        System.out.println(c.name+ "- is name of cat");

    }


}
class Cat {
    String name;

    void sound()
    {
        System.out.println(name + " is making sound");
    }

}
