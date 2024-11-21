package Nov.ex18112024_Exception;

public class Task_Exception_trycatch
{
    public static void main(String[] args) {
       try
       {
            String s1 = "Priya";
            String a1 = args[0];
            int a = 1000/0;
            s1 = null;
            System.out.println(s1.trim());

    }
       catch (Exception e)
       {
           System.out.println("Some problem: "+e.getMessage());
       }
        System.out.println("End of program");
    }
}
