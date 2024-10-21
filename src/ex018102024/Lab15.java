package ex018102024;

import java.util.Scanner;

public class Lab15 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter types to conversion to be done between different units(1-2):");
    int con = sc.nextInt();
    switch (con) {
        case 1:
            System.out.println("Enter distance in kilometer:");
            double kilo = sc.nextDouble();
            double miles = kilo * 0.62137119;
            System.out.println(kilo+" Kilometers is equal to "+miles +" miles" );
            break;
        case 2:
            System.out.println("Enter temperature in celsius");
            double cel = sc.nextDouble();
            double Fah =(cel*9/5)+32;
            System.out.println("Celsius to Fahrenheit is: " +Fah );
            break;
        case 3:
            System.out.println("Enter distance in milies:");
            double mile = sc.nextDouble();
            double kilom = mile / 0.62137119;
            System.out.println(mile+" Miles is equal to "+ kilom+" kiolm" );
            break;
        case 4:
            System.out.println("Enter temperature in fahrenheit");
            double fah = sc.nextDouble();
             cel =(fah-32)*5/9;
            System.out.println("Fahrenheit to Celsius is: " +cel );
            break;

        default: {
            System.out.println("Invalid Temperature");
        }


    }
}
}
