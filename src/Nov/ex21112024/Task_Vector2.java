package Nov.ex21112024;

import java.util.Enumeration;
import java.util.Vector;

public class Task_Vector2 {
    public static void main(String[] args) {
        Vector<String> v= new Vector<>();
        v.add("Kiwi");
        v.add("Banana");
        v.add("Chai");
        v.add("Date");

        for(String o: v)
        {
            System.out.println(o);
        }

        Enumeration<String> enumeration = v.elements();
        while(enumeration.hasMoreElements())
        {
            System.out.println(enumeration.nextElement());
        }
    }
}
