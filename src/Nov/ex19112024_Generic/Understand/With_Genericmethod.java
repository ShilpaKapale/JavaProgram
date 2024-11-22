package Nov.ex19112024_Generic.Understand;

public class With_Genericmethod {
    public static void main(String[] args) {
        display("Sathish");
        display(7657);
        display(45.89);
        display(true);//Boolean
    }
//Generic Method
    public static<T> void display(T s) {
        System.out.println(s);
    }


}
