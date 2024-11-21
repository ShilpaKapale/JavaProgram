package Nov.ex20112024_List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Task_ArrayList_Iterator {
    public static void main(String[] args) {

        List l = new ArrayList();

        l.add("Bread");
        l.add("Milk");
        l.add(true);
        l.add(564);// Different data type is allowed.

        System.out.println(l);
        System.out.println(l.size());
        System.out.println(l.equals(true));
        System.out.println(l.contains(3));
        System.out.println(l.isEmpty());

        System.out.println("**Default for loop**");
        for (int i=0;i<l.size();i++)
        {
            System.out.println(l.get(i));
        }

        System.out.println("**For each loop**");
        for (Object o:l)
        {
            System.out.println(o);
        }

        System.out.println("**Print using Iterator**");

        // Iterator - Anchor - go one by one forward -> get access them
        // HasNext() -> true - If we have a next element
        // Next -> element

        Iterator i = l.iterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }
    }
}
//OUTPUT
//[Bread, Milk, true, 564]
//        4
//        false
//        false
//        false
//        **Default for loop**
//Bread
//        Milk
//true
//        564
//        **For each loop**
//Bread
//        Milk
//true
//        564
//        **Print using Iterator**
//Bread
//        Milk
//true
//        564