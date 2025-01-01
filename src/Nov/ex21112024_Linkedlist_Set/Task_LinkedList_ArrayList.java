package Nov.ex21112024_Linkedlist_Set;

import java.util.ArrayList;
import java.util.LinkedList;

public class Task_LinkedList_ArrayList {

    public static void main(String[] args) {
        LinkedList l=new LinkedList();
        l.add("Node 1");
        l.add("Node 2");

        System.out.println(l);

        ArrayList l1= new ArrayList();
        l1.add("Node 1");
        l1.add("Node 2");
        l1.add("Node 3");

        System.out.println(l1);
    }
}
//    OUTPUT
//        [Node 1, Node 2]
//        [Node 1, Node 2, Node 3]
