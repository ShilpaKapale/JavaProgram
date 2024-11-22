package Nov.ex19112024_Generic.Understand;

import Nov.ex08112024_Hierarchical_1.Somya;

public class With_Genericmethod_Multipleparameter {
    public static void main(String[] args) {
        display("Sathish","Child");
        display("Bangalore", "Somya");
        display("Karthik","ID78");
    }
//Generic method for multipleparameter of same datatype
    public static<T> void display(T s, T m) {
        System.out.println(s +" "+m);
    }

}
