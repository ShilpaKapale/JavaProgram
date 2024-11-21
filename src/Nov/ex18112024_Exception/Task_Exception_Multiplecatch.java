package Nov.ex18112024_Exception;

import javax.print.attribute.standard.OrientationRequested;

public class Task_Exception_Multiplecatch {
    public static void main(String[] args) {
        int a =0;
        int c=0;

        try
        {
            c= 10/a;
        }
        //Multiple catch is possible
        catch (ArithmeticException e)//this basket
        {
            System.out.println(e.getMessage());
        }
        catch (Exception e)//Big basket //If we are not sure of which exception occurs than we use this
        {
            System.out.println(e.getMessage());
        }
        catch (Throwable e)//Bigger basket //Avoid throwable // we dont use
        {
            System.out.println(e.getMessage());
        }
        System.out.println(c);
       // OR condtion for handling multiple catch
//        catch (ArithmeticException | NullPointerException e)//this basket
//        {
//            System.out.println(e.getMessage());
//        }
    }
}
