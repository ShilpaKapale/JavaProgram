package Oct.ex30102024_Triangle;

import java.util.Scanner;

public class Task_RightTriangle {
    public static void main(String[] args) {
        System.out.print("Enter the number for forming Left Triangle: ");
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();

        for(int i =0; i<s; i++)
        {
            for(int j=0; j<=i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
