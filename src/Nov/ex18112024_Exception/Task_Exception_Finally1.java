package Nov.ex18112024_Exception;

import java.util.Scanner;

public class Task_Exception_Finally1 {
    public static void main(String[] args) {
        Scanner sc = null;
             sc =    new Scanner(System.in);
             int v = sc.nextInt();
               try {
                   int a = 10 / 0;
                   System.out.println("Hello");
               }
               catch (Exception e) {
                   throw new RuntimeException(e);
               }
        finally
        {       sc.close();
            System.out.println("Finally is used to close the connection");
        }
    }
}
