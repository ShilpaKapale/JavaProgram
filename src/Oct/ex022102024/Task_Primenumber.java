package Oct.ex022102024;
import java.util.Scanner;
public class Task_Primenumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = sc.nextInt();
        boolean isprime = true;

        for (int i = 2; i < number; i++)
        {
            System.out.println(i);
            if (number <= 1)
            {
                isprime = false;
                break;
            }

        if (number % i == 0)
            {
            isprime = false;
            break;
            }
         }
        if(isprime)
             {
            System.out.println(number+" is Prime number");
             }
            else
            {
                System.out.println(number+" is not Prime number");
            }


    }
}
