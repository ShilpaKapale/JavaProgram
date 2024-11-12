package Nov.ex08112024_Hierarchical_1;

public class Hierarchical {
    public static void main(String[] args) {

        Kavya k = new Kavya();
        k.Khome();
        System.out.println("Inherited method");
        k.FHhome();

        Somya s = new Somya();
        s.Shome();
        System.out.println("Inherited method");
        s.FHhome();

        Harish s1 = new Harish();
        s1.Hhome();
        System.out.println("Inherited method");
        s1.FHhome();


    }
}
