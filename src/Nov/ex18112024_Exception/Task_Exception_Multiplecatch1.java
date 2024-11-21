package Nov.ex18112024_Exception;

public class Task_Exception_Multiplecatch1 {

    public static void main(String[] args) {
        try
        {
            String ip = args[0];
        int a = Integer.parseInt(ip);
        int b = 100/a;
        System.out.println(b);

        }
        catch (ArithmeticException e)
        {
            System.out.println(e.getMessage());
        }
        catch(NumberFormatException e)
        {
            System.out.println(e.getMessage());
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e.getMessage());
        }
        finally
        {
            System.out.println("End");
        }
    }
}
