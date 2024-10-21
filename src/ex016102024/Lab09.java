package ex016102024;

import java.util.Scanner;

public class Lab09 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = sc.next();

        System.out.println("Enter your age: ");
        int age = sc.nextInt();

        System.out.println("Enter your salary: ");
        int salary = sc.nextInt();

        System.out.printf("Hi ! %s.  \n %d is your age and your salary is %d per month.",name, age, salary);


    }
}
