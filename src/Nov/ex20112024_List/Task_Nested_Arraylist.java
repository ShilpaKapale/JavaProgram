package Nov.ex20112024_List;

import java.util.ArrayList;
import java.util.List;

public class Task_Nested_Arraylist {
    public static void main(String[] args) {

        List f = new ArrayList();
        f.add("Orange");
        f.add("Mango");
        f.add("Grapes");
        System.out.println(f);

        List f1 = new ArrayList();
        f1.add("Muskmelon");
        f1.add("Watermelon");
        System.out.println(f1);

        List vegetable = new ArrayList();
        vegetable.add("Brinjal");
        vegetable.add("Potato");
        System.out.println(vegetable);

        f1.add("some");

        List allf = new ArrayList();
        allf.add(f);
        allf.add(f1);
        allf.add(vegetable);
        System.out.println(allf);
    }
}
//    OUTPUT
//    [Orange, Mango, Grapes]
//        [Muskmelon, Watermelon]
//        [Brinjal, Potato]
//        [[Orange, Mango, Grapes], [Muskmelon, Watermelon, some], [Brinjal, Potato]]