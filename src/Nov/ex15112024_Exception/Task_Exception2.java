package Nov.ex15112024_Exception;

import java.io.FileInputStream;

public class Task_Exception2 {
    public static void main(String[] args) {
        System.out.println("Stat");
        //Checked exception
//        FileInputStream fis = new FileInputStream("c://a.text");
//
//       // Unchecked exception
//        int a = 100;
//        int c =a/0;//JVM does not know and confused hence arithimetic exception
//        System.out.println(c);

        String s1 = null;
        try {
            s1.trim();//Unchecked jvm does not know during complie time but it know during runtime hence it will end the program
        }
        catch (Exception e)
        {
            //System.out.println(e.getMessage());
            System.out.println("Can't do trim for Null");
        }
        System.out.println("End");
    }

}
