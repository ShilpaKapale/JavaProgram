package Nov.ex18112024_Exception;

public class Task_Exception_Whennotsureofexception {
    public static void main(String[] args) {
        int a = 0;
        int c= 0;
        try {
            c=10/a;
            String s1 = null;
            s1.trim();
        }
        //Ok Ok coder will write below code
//        catch (Exception e) {
//            throw new RuntimeException(e);
//        }
        //Good coder will write below code by adding OR condition
        catch (ArithmeticException | NullPointerException e)
        {
            System.out.println(e.getMessage());
        }
        System.out.println(c);
    }
}
