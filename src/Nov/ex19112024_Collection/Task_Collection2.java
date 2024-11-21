package Nov.ex19112024_Collection;

import java.util.ArrayList;
import java.util.List;

public class Task_Collection2 {
    public static void main(String[] args) {

        List l = new ArrayList();
        l.add("1");
        l.add("3");
        l.add("1");
        l.add("5");
        l.add("5");

        System.out.println(l.size());
        System.out.println(l.contains("5"));
        System.out.println(l.indexOf("3"));
        System.out.println(l.isEmpty());
        System.out.println(l.contains(5));//5 is Not String so answer is false
        System.out.println(l.lastIndexOf("5"));
    }
}
//o/p
//5
//        true
//        1
//        false
//        false
//        4