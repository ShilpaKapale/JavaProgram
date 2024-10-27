package ex022102024;

import java.util.Scanner;

public class T_PalidromeofString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string to check palindrome or not:");
        String input = sc.nextLine().toLowerCase();

        String rev = "";

        for(int i=input.length()-1;i>=0;i--){
            rev = rev + input.charAt(i);
        }
        System.out.println(rev);
        if (input.equals(rev)) {
            System.out.println("The word is a palindrome.");
        } else {
            System.out.println("The word is not a palindrome.");
        }
    }
}
