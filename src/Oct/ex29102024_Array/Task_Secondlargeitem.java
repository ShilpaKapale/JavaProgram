package Oct.ex29102024_Array;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Task_Secondlargeitem {
    public static void main(String[] args) {

        System.out.println("Enter size of array : 5");
        Scanner sc = new Scanner(System.in);
        //Initialize size and array
        int size = sc.nextInt();
        int array[]= new int[size];
        System.out.println("Enter the array item : ");
        for (int i = 0;i<size;i++)
        {
            array[i] = sc.nextInt();
        }

        Arrays.sort(array);
        System.out.println("Second largest element of array is :" + array[array.length-2]);
    }

}

