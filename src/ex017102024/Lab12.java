package ex017102024;

import java.util.Scanner;

//Write a program that classifies a triangle based on its side lengths.
public class Lab12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter all the sides of triangle");
        int side1 = sc.nextInt();
        int side2 = sc.nextInt();
        int side3 = sc.nextInt();

        if (side1 == side2 && side2 == side3) {
            System.out.printf("Triangle is equilateral ");
        } else if (side1 == side2 || side2 == side3 || side1 == side3) {
            System.out.printf("Triangle is isosceles");
        } else if ((side1 != side2) && (side2 != side3)) {
            System.out.printf("Triangle is scalene ");
        }

    }
}
