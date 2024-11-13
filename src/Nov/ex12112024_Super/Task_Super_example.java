package Nov.ex12112024_Super;

public class Task_Super_example
{
    public static void main(String[] args) {
    car c = new car();
    //JVM calls super keyword of parent and child by default
        //If child DC is executed than DC of parent will be excuted
    }
}

class car extends vehicle{
    private int maxspeed = 390;

    @Override
    void display() {
        System.out.println("Child");
    }

    car(){
       // super();//Calls dc & If child DC is executed than DC of parent will be excuted
        super(335);//Calls parameterized constructor
        System.out.println("DC of car");
        System.out.println(this.maxspeed);//Calls car maxspeed
        System.out.println(super.maxspeed);//Calls vehicle maxspeed
        super.display();//calls parent method
        this.display();//Calls child method

    }
}

class vehicle {
    public int maxspeed = 130;

    void display()
    {
        System.out.println("Parent");
    }
    vehicle(){
        System.out.println("DC of vehicle");
    }
    vehicle(int a){
        System.out.println("PC of vehicle");
    }
}

