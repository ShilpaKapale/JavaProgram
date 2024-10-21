package ex019102024;

import java.sql.SQLOutput;

public class Lab16 {
    public static void main(String[] args) {
        // int i = 0;
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
              System.out.println("break " + i);
               break; // Exit the loop when i equals 3
           }
            //if (i == 2) {
            //  System.out.println("continue "+i);
            //   continue; // Skip the rest of the iteration when i equals 2
            //}
            System.out.println(i);
        }
    }
    }

