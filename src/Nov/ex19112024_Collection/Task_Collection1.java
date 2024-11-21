package Nov.ex19112024_Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Task_Collection1 {
    public static void main(String[] args) {

       // Collection l = new ArrayList();//Dynamic Dispatch
      //  List l1= new ArrayList();//Dynamic Dispatch

        ArrayList l = new ArrayList();
        l.add("Priya");
        l.add("Snehal");
        l.add("Priya");//Allow duplicate
        l.add(123);//different data type is allowed
        l.add(null);

        System.out.println(l);
    }
}
