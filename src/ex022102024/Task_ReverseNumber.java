package ex022102024;

import java.util.Scanner;

public class Task_ReverseNumber {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the number to be reveresed:");

    int num = sc.nextInt();
    int rev = 0;
    int reminder = 0;
// first condition of for loop is already initialize in line 12
        // ex: num 485 which is not equal to 0 and 485/10 = 48
    for(;num != 0;num = num/10)      //num = 485; 48 ; 4;0 than it exit
    {
        reminder = num % 10; // 485%10 = 5; 48%10 =8; 10%10 = 1
        rev = rev * 10 + reminder; //0*10 + 5 = 5; 5*10+8 =32; 58*10+4=584
    }
    System.out.println("Reversed Number is:" + rev);

    }
}
