package Oct.ex017102024;
import java.util.Scanner;
public class Lab11 {
    public static void main(String[] args) {
        // Calculate grading
        // A= 90-100
        //B=80-90
//    C= 70-79
//    D= 60-69
//    F=0-59
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your result percentage here to calculate the grade");
        int result = sc.nextInt();
        if (result >= 90 && result <= 100) {
            char ch = 'A';
            System.out.printf("your grade is %c", ch);
        } else if (result >= 80 && result <= 89) {
            char ch = 'B';
            System.out.printf("your grade is %c", ch);
        } else if (result >= 70 && result <= 79) {
            char ch = 'C';
            System.out.printf("your grade is %c", ch);
        } else if (result >= 60 && result <= 69) {
            char ch = 'D';
            System.out.printf("your grade is %c", ch);
        } else {
            char ch = 'F';
            System.out.printf("your grade is %c", ch);
        }
    }
}
