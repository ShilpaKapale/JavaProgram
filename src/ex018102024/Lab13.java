package ex018102024;

import java.util.Scanner;

public class Lab13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Num1:");
        double Num1 = sc.nextDouble();
        System.out.println("Enter Num2:");
        double Num2 = sc.nextDouble();

        System.out.println("Enter the type of operation to be done");

        String oper= sc.next();
        switch (oper) {
            case "Add":
                System.out.println("Addition of 2 number: " + (Num1+Num2));
                break;
            case "Sub":
                System.out.println("Subtraction of 2 number: " + (Num1-Num2));
                break;
            case "Mul":
                System.out.println("Multiplication of 2 number: " + (Num1*Num2));
                break;
            case "Div":
                System.out.println("Division of 2 number: " + (Num1/Num2));
                break;
            case "Mod":
                System.out.println("Moduls of 2 number: " + (Num1%Num2));
                break;
            default: {
                System.out.println("Invalid Operation");
            }
        }
    }
}