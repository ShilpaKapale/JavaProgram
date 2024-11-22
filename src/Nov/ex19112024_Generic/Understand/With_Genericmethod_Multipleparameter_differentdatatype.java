package Nov.ex19112024_Generic.Understand;

public class With_Genericmethod_Multipleparameter_differentdatatype {
    public static void main(String[] args) {
        display("Sathish",76.67);
        display("Bangalore",560067 );
        display("Karthik","Yes");
    }


    //Generic method for multipleparameter of different datatype
    public static<T, U> void display(T s, U m) {
        System.out.println(s +" "+m);

    }
}
