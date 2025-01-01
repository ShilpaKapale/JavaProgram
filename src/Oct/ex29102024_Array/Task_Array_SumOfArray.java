package Oct.ex29102024_Array;

import java.util.Arrays;
import java.util.Scanner;

public class Task_Array_SumOfArray {
    public static void main(String[] args) {

        System.out.println("Size of arrray is: ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int array[] = new int[size];
        int sum = 0;
        System.out.println("Enter array item : ");

        for (int i=0;i<size;i++)
        {
            array[i] = sc.nextInt();
            sum = sum +array[i];
        }
        System.out.println("Item entered in array are : " + Arrays.toString(array));
        System.out.println("Sum of array item is : " +sum);



    }
//    or
//    public static void main(String[] args) {
//
//        int [] arr = new int [] {1, 2, 3, 4, 5};
//        int sum = 0;
//
//        for (int i = 0; i < arr.length; i++) {
//            sum = sum + arr[i];
//        }
//        System.out.println("Sum of all the item of array: " + sum);
//    }
}
