package Nov.ex19112024_Generic;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
//Generic supports only classes
public class Task_Generic2 {
    public static void main(String[] args) {
        Container<Integer> obj = new Container<Integer>();
        obj.value = 5;
        obj.show();
    }
}

    class Container<T>
    {
        T value;
        public void show()
        {
            System.out.println(value.getClass().getName());
        }
        public T getValue() {
            return value;
        }

        public void setValue(T value) {
            this.value = value;
        }


    }



//    public static void main(String[] args) {
//        int value = 5;
//        List a = new ArrayList();
//     //   a.add(Object);
//        a.add(56);
//        a.add("Priya");
//
//        //exception  to solve this we use generic boz solving at complie time is better than run time
//        int i = Integer.parseInt(a.get(1).toString());
//        //O/p = (NumberFormatException.java:67) as we are expecting integer output but we r getting string
//        System.out.println(i);
//    }

