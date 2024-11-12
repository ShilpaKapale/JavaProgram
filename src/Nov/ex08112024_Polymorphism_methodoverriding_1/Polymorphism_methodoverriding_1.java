package Nov.ex08112024_Polymorphism_methodoverriding_1;

public class Polymorphism_methodoverriding_1 {

    public static void main(String[] args) {

        HDFC h = new HDFC();
        //@Override
        System.out.println("HDFC Bank instrest is: "+h.Intrest());

        ICICI i = new ICICI();
        System.out.println("ICICI Bank instrest is: "+i.Intrest());

    }
}
