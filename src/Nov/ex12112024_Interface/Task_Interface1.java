package Nov.ex12112024_Interface;

public class Task_Interface1 {
    public static void main(String[] args) {
        monkey m = new monkey();
        m.eat();
        m.sleep();

    }
}
interface Animal

    {   public void eat();
       public  void sleep();

    }

    class monkey implements Animal
    {
        public void eat()//Interface methods are implemented
        {
            System.out.println("Monkey eat banana");
        }

        @Override
        public void sleep() //Interface methods are implemented
        {
            System.out.println("Monkey RRR");
        }
    }