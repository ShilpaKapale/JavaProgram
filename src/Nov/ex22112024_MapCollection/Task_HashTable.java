package Nov.ex22112024_MapCollection;

import java.util.Enumeration;
import java.util.Hashtable;

public class Task_HashTable {
    public static void main(String[] args) {

        Hashtable<Integer, String> ht = new Hashtable();

        ht.put(1,"one");
        ht.put(2,"two");
        ht.put(3,"Three");
        System.out.println(ht);

        Hashtable<Integer, String> ht1 = new Hashtable();

        ht1.put(1,"one");
        ht1.put(2,"two");
        ht1.put(3,"three");
       // ht1.put(3,null);//Nullpointer error
       // ht1.put(null,null);
        System.out.println(ht1);

        Enumeration<Integer> e = ht1.keys();
        while(e.hasMoreElements())
        {
            System.out.println(e.nextElement());
        }
    }
}
//Output:
//{3=Three, 2=two, 1=one}
//        {3=three, 2=two, 1=one}
//        3
//        2
//        1