package Oct.ex30102024;

import java.util.Scanner;

public class Task_LeftTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number for forming Right Triangle: ");
        int s = sc.nextInt();
        for(int i= 0; i<s; i++)
        {
            for(int j=0; j<s-i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
