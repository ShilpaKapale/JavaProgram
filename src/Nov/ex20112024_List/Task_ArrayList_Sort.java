package Nov.ex20112024_List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task_ArrayList_Sort {
    public static void main(String[] args) {

        List marks = new ArrayList();
        marks.add(67);
        marks.add(88);
        marks.add(91);
        marks.add(90);

        System.out.println(marks);
//        Collections.sort(marks);
//        System.out.println(marks);
        //Resverse Order
        Collections.sort(marks,Collections.reverseOrder());
        System.out.println(marks);
    }
}
//        Output
//Collections.sort(marks);
//        [67, 88, 91, 90]
//        [67, 88, 90, 91]
// Collections.sort(marks,Collections.reverseOrder());
//        [67, 88, 91, 90]
//        [91, 90, 88, 67]