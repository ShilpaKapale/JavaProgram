package ex022102024;

import java.util.Scanner;

public class T_ReverseNumber {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the number to be reveresed:");
    int num = sc.nextInt();

    int rev = 0;

    for(;num != 0;num /= 10)
    {
        int digit = num % 10;
        rev = rev * 10 + digit;
    }
    System.out.println("Reversed Number is:" + rev);

    }
}
