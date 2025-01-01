package Nov.ex22112024_MapCollection;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Task_Hashmap_Method_Forloop {

    public static void main(String[] args) {

         //   HashMap m = new HashMap();
        HashMap<Integer,String> m = new HashMap<Integer,String>();
            m.put(101,"J");
            m.put(102,"S");
            m.put(103,"M");
            m.put(104,"J");
            m.put(105,"L");
        System.out.println(m);
        System.out.println(m.get(103));
            m.remove(105);
        System.out.println(m);
        System.out.println(m.containsKey(101));
        System.out.println(m.containsKey(106));
        System.out.println(m.containsValue("Marry"));
        System.out.println(m.containsValue("M"));
        System.out.println(m.isEmpty());
        System.out.println(m.keySet());
        System.out.println("Get keys");
            for(Object i:m.keySet())
            {
                System.out.println(i);
            }
        System.out.println("Get values");
            for(Object i:m.values())
            {
                System.out.println(i);
            }
        System.out.println("Using keyset method get values");
            for(Object i:m.keySet())
            {
                System.out.println(i+" "+m.get(i));
            }
        System.out.println("Entryset");
            for(Map.Entry entry : m.entrySet())
            {
                System.out.println(entry.getKey()+" "+entry.getValue());
            }
        System.out.println("Iterator");
            Set s = m.entrySet();
            Iterator itr = s.iterator();

            while(itr.hasNext())
            {
                Map.Entry entry=(Map.Entry) itr.next();
                System.out.println(entry.getKey()+"  "+entry.getValue());
            }

        }


}
