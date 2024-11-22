package Nov.ex19112024_Generic.Understand;

public class No_Genericmethod {
    public static void main(String[] args) {
//We need write two different method to pass two different datatype for a method here to get certain type of input
        display("Sathish");
        display1(7657);
    }

    public static void display(String s) {
        System.out.println(s);
    }
    public static void display1(Integer i)
    {
        System.out.println(i);
    }

}

