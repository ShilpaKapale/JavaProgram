package Oct.ex023102024;

import java.util.Scanner;

public class TCalculatorfunction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Num1:");
        int Num1 = sc.nextInt();
        System.out.println("Enter Num2:");
        int Num2 = sc.nextInt();

        System.out.println("Sum of two number is: " + sum(Num1,Num2));
        System.out.println("Sub of two number is: " + sub(Num1,Num2));
        System.out.println("Mul of two number is: " + mul(Num1,Num2));
        System.out.println("Div of two number is: " + div(Num1,Num2));
    }

    public static int sum(int a,int b)
    {
        return a+b;
    }

    public static int sub(int a,int b)
    {
        return a-b;
    }

    public static int mul(int a,int b)
    {
        return a*b;
    }
    public static float div(int a,int b)
    {
        return (float) a/b;
    }
}
