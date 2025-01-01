package Oct.ex29102024_Array;

import java.util.Scanner;

public class Array5_Object_ArraySizeInputfromUser {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size");
        int size = sc.nextInt();
        //Array object creation
        // example: int[] arr = new int[n];
        Object[] a = new Object[size];

        for(int i = 0; i<size; i++)
        {
            System.out.print("Enter element: "+(i+1) + ":");
            a[i] = sc.next();
        }

        for(Object obj : a)
        {
            System.out.println(obj);
        }

    }
}
