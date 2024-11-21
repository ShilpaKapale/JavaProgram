package Nov.ex18112024_Exception;

public class Task_Exception_Multipletrycatch {

    public static void main(String[] args) {
        System.out.println("Start");
        String ip = null;
        //1st try catch
        try
        {
        ip = args[0];
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("1st try catch: "+e.getMessage());
        }
        //2nd try catch
        int a = 0;
        try
        {
            a = Integer.parseInt(ip);
        }
        catch(NumberFormatException e)
        {
            System.out.println("2nd try catch: "+e.getMessage());
        }
        //3rd try catch
        int b=0;
        try {
             b = 1000 / a;
        }
                catch (ArithmeticException e)
        {
            System.out.println("3rd try catch: "+e.getMessage());
        }


        finally
        {
            System.out.println("End");
        }
    }
}
