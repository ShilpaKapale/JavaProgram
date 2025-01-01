package Nov.ex22112024_MapCollection;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeMap;

public class Task_TreeMap {
    public static void main(String[] args) {

        TreeMap<Integer,String> tm=new TreeMap<>();
        tm.put(1000,"Tom");
        tm.put(2000,"Peter");
        tm.put(3000,"Steve");
        tm.put(11000,"Naveen");
        tm.put(1400,"Robby");

        System.out.println(tm);
        tm.forEach((k,v) ->System.out.println("Key="+k+"value="+v));
        System.out.println("Highest Key Value");
        System.out.println(tm.lastKey());
        System.out.println("Lowest Key Value");
        System.out.println(tm.firstKey());

        System.out.println("Key Less than 3k");
        Set<Integer> keylessthan3k = tm.headMap(3000).keySet();
        System.out.println(keylessthan3k);

        System.out.println("Key Less than 3k");
        Set<Integer> keylessGr3k = tm.tailMap(3000).keySet();
        System.out.println(keylessGr3k);

        System.out.println("Reverse Order");

        TreeMap<Integer,String> tm1=new TreeMap<>(Comparator.reverseOrder());
        tm1.put(1000,"Tom");
        tm1.put(2000,"Peter");
        tm1.put(3000,"Steve");
        tm1.put(11000,"Naveen");
        tm1.put(1400,"Robby");
        System.out.println(tm1);
    }
}
