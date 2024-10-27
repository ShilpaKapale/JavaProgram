package ex015102024;
import java.util.Scanner;
public class Task_Increment {
    public static void main(String[] args){
        System.out.println("Enter the number : ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        System.out.println("++a : "+ ++a);
        System.out.println("a++ : "+ a++);
        System.out.println("a++ : "+ a++);

    }
}
