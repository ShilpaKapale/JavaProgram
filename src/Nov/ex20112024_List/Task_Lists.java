package Nov.ex20112024_List;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Task_Lists {
    public static void main(String[] args) {

        List ML = new ArrayList();// Arrays Format - Continuous
        List ML1 = new LinkedList();// Doubly Linked List.

        List f = List.of("Orange","Kiwi");
        System.out.println(f);
       // f.add("Banana");// java.lang.UnsupportedOperationException does not support


    }
}
            //OUTPUT
        //[Orange, Kiwi]