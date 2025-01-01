package Oct.ex29102024_Array;
import java.util.Scanner;

public class Array6_Object_Definedsize_Arrayinputfromuser {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //Here size is defined
        //Array object creation
        // example: int[] arr = new int[n];

        Object[] d = new Object[5];

        for(int i=0; i<5; i++)
        {
            System.out.println("Enter array element");
            d[i] = sc.next();

        }
        System.out.println("Element");
        for(Object obj : d)
        {
            System.out.println(d);
        }

    }
}
