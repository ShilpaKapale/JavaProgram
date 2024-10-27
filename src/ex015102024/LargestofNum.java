package ex015102024;

import java.util.Scanner;

public class Task_LargestofNum {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println(" Enter three number");
         int a = sc.nextInt();
         int b = sc.nextInt();
         int c = sc.nextInt();

         int result = (a>b && a>c)?  a : (b>c)?b:c;
        System.out.println("Largest of three number :" + result);
    }

}
