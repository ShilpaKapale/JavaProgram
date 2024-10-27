package ex022102024;

import java.util.Scanner;

public class Task_Countvowelsconsonants {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the char:");
        String data = sc.nextLine().toLowerCase();

        int vowels = 0;
        int constants = 0;

        for (int i = 0; i < data.length(); i++)
        {
            char ch = data.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            {
                vowels++;
            } else if (ch >= 'a' && ch <= 'z')
            {
                constants++;
            }

        }
        System.out.println("Total  vowels:" + vowels);
        System.out.println("Total constant:" + constants);
    }
}
