package ex022102024;

import java.util.Scanner;

public class Task_PalidromeofString {
    public static void main(String[] args) {
        System.out.println("Enter the word to check palidrome or not");
    Scanner sc = new Scanner(System.in);
     String word = sc.nextLine().toLowerCase();

     String r ="";
     int l =word.length()-1;

     for(int i=l; i>=0; i--)
     {
         r = r +word.charAt(i);
     }
        System.out.println(r);
     if(word.equals(r))
     {
         System.out.println("Word is Palidrome");
     } else
         {
             System.out.println("Word is not Palidrome");
         }
     }
    }
//