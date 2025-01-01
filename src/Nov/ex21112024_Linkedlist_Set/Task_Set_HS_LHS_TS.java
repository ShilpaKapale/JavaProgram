package Nov.ex21112024_Linkedlist_Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Task_Set_HS_LHS_TS {
    public static void main(String[] args) {

        Set hs = new HashSet();
        hs.add("Amruth");
        hs.add("Grape");
        hs.add("Watermelon");
        hs.add("WaterMelon");
        hs.add(null);
        System.out.println(hs);

        Set lhs = new LinkedHashSet();
        lhs.add("Amruth");
        lhs.add("Guvaa");
        lhs.add("Muskmelon");
        lhs.add("Water");
        lhs.add("Water");
        lhs.add(null);
        System.out.println(lhs);

        System.out.println(lhs.isEmpty());
        System.out.println(lhs.contains("Apple"));
        System.out.println(lhs.size());

        Set ts = new TreeSet();
        ts.add("Amruth");
        ts.add("Guvaa");
        ts.add("Muskmelon");
        ts.add("Water");
        System.out.println(ts);

        for(Object o:ts)
        {
            System.out.println(o);
        }
    }
}
//OutputStream
//[null, Amruth, Watermelon, Grape, WaterMelon]
//        [Amruth, Guvaa, Muskmelon, Water, null]
//        false
//        false
//        5
//        [Amruth, Guvaa, Muskmelon, Water]
//Amruth
//        Guvaa
//Muskmelon
//        Water
