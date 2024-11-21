package Nov.ex18112024_Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Task_Exception_Throws
{   //We can handle fileinputstream exception by trycatch or throws as shown below
    public static void main(String[] args) throws FileNotFoundException
    {
        FileInputStream fs = new FileInputStream("c://a.txt");
    }
}
