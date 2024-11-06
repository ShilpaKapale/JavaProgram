package ex022102024;


import java.util.Scanner;

public class Task_ReverseNumber_while {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int rev = 0;
        int reminder = 0;

        while(num!=0)
        {
            reminder = num%10;
            rev = rev*10+reminder;
            num = num/10;
        }
        System.out.println("Reversed number: "+rev);
    }
}
