package Nov.ex07112024_SingleInheritance_1;

public class Vehicle {
    public static void main(String[] args) {

        //Instance of Subclass
        Maruti_Swiftdesire sd = new Maruti_Swiftdesire();
        //Inheriting method of Superclass
        sd.start();
        sd.brake();

        //New method of Subclass
        sd.Display();
        sd.AC();
    }
}
