package Nov.ex22112024_MapCollection;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Task_HashTable_Method_Forloop {
    public static void main(String[] args) {

        Hashtable<Integer,String> ht = new Hashtable<Integer,String>();

        ht.put(23,"Earth");
        ht.put(24,"Green");
        ht.put(25,"Happy");

        System.out.println(ht);
        System.out.println(ht.get(25));
        ht.remove(25);

        System.out.println(ht);
        System.out.println(ht.containsKey(24));
        System.out.println(ht.containsKey(26));
        System.out.println(ht.containsValue("Green"));

        System.out.println(ht.isEmpty());

        System.out.println(ht.keys());
        System.out.println(ht.values());
        System.out.println("Get Both key and values");
        for (Object i:ht.keySet())
        {
            System.out.println(i +" "+ht.get(i));
        }
        System.out.println("Entry Method");
        for (Map.Entry e : ht.entrySet())
        {
            System.out.println(e.getKey() +" "+e.getValue());
        }
        System.out.println("Iterator");
        Set s = ht.entrySet();
        Iterator itr = s.iterator();
        while(itr.hasNext())
        {
            Map.Entry e =(Map.Entry) itr.next();
            System.out.println(e.getKey()+" "+ e.getValue());
        }

    }
}
