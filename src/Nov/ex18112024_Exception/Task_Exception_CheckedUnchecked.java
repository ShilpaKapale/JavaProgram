package Nov.ex18112024_Exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Task_Exception_CheckedUnchecked {
    public static void main(String[] args) {
       //UnChecked exception
        int a =0;
        try
        {
            a = 100/0;

        }
        catch (Exception e) {
            System.out.println("Some problem div by zero: "+e.getMessage());
        }
        finally {
            System.out.println("I will be excuted");
        }
        //Checked exception
        try{
            FileReader reader = new FileReader(new File("c://abc.txt"));
        }
        catch (FileNotFoundException e)
        {
            System.out.println("File not found: "+ e.getMessage());
        }
        finally
        {
            System.out.println("Finaly checked exception");
        }
    }
}
