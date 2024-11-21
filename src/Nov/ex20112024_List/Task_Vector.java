package Nov.ex20112024_List;

import java.util.Vector;

public class Task_Vector {
    public static void main(String[] args) {

        Vector v = new Vector();
        v.add("test");
        v.add("money");
        v.add("oil");
        System.out.println(v);
        v.remove("money");
        System.out.println(v.contains("oil"));
        System.out.println(v);
        v.add(1,"Mist");
        System.out.println(v);
    }
}
//    Output
//        [test, money, oil]
//        true
//        [test, oil]
//        [test, Mist, oil]