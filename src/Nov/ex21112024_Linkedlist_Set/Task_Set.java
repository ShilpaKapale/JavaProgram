package Nov.ex21112024_Linkedlist_Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Task_Set {
    public static void main(String[] args) {

        Set hs = new HashSet();
        Set Lhs= new LinkedHashSet();
        Set ts = new TreeSet();

        hs.add("Pramod");
        hs.add("kramod");
        hs.add("mramod");
        hs.add("Pramod");
        System.out.println(hs);
    }
}
//OUTPUT
//[kramod, mramod, Pramod]