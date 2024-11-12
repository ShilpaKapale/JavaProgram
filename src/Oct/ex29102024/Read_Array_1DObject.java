package Oct.ex29102024;

import java.util.Scanner;

public class Read_Array_1DObject {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("How many numbers you want input?: ");
        int n = sc.nextInt();
        //Array creation
        int[] arr = new int[n];
        System.out.println("Enter the array element:");
        for(int i=0;i<n;i++)
            {
               arr[i]=sc.nextInt();
            }

        for(int i=0;i<n;i++)
        {
            System.out.println("Array element are: " +arr[i]);
        }
       }
}
