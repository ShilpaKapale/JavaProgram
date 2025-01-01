package Nov.ex21112024_Linkedlist_Set;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Task_AL_Iterator {
    public static void main(String[] args) {

        List<String> ml = new ArrayList();
        ml.add("P");
        ml.add("A");
        ml.add("D");

        System.out.println("To Print AL -1");

        for(String str: ml)
        {
            System.out.println(str);
        }

        System.out.println("To Print AL - 2");

        for(int i=0;i<ml.size();i++)
        {
            System.out.println(ml.get(i));
        }

        System.out.println("To Print AL - 3");

        Iterator<String> iterator =ml.iterator();
        while(iterator.hasNext());
        {
            System.out.println(iterator.next());
        }
    }
}
//OUTPUT
//To Print AL -1
//P
//        A
//D
//To Print AL - 2
//P
//        A
//D
//To Print AL - 3
