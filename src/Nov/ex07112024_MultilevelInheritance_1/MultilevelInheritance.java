package Nov.ex07112024_MultilevelInheritance_1;

public class MultilevelInheritance {
    public static void main(String[] args) {

        Son s = new Son();
        System.out.println("**Son object**");
        s.Shome();
        //Inherited method
        s.Ghome();
        s.Fhome();

        Father f = new Father();
        System.out.println("**Father object**");
        f.Fhome();
        //Inherited method
        f.Ghome();

        Grandfather g = new Grandfather();
        System.out.println("**Grandfather object**");
        g.Ghome();
    }
}
