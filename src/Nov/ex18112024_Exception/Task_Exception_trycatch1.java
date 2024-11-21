package Nov.ex18112024_Exception;

public class Task_Exception_trycatch1 {
    public static void main(String[] args) {
        final double pi=3.14;
        int a =0;
        try
        {
             a = 100/0;

        }
        catch (Exception e) {
            //e.printStackTrace();
            //System.out.println(e.getMessage());
            System.out.println("Some problem div by zero: "+e.getMessage());//Customized message
        }
        finally {
            System.out.println("I will be excuted");
        }
    }
}
