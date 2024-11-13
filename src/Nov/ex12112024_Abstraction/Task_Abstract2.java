package Nov.ex12112024_Abstraction;

public class Read_Abstract2 {
    public static void main(String[] args) {
        wagonR w = new wagonR();
        w.startEngine();
        w.drive();
    }

}
//Below class is concrete now
 class wagonR extends Engine
{
    void drive()
    {
        startEngine();
        stopEngine();
    }
    void startEngine(){
        System.out.println("Starting car");
    }
    void stopEngine(){
        System.out.println("Stopping car");
    }
}
//  Abstract class
abstract class Engine
{
     abstract void startEngine();
     abstract void stopEngine();
}
