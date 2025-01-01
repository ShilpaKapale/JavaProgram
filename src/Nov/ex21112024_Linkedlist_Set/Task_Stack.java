package Nov.ex21112024_Linkedlist_Set;

import java.util.Stack;

public class Task_Stack {
    public static void main(String[] args) {
        Stack s = new Stack();
        s.add("P");
        s.add("D");

        System.out.println(s);

        Stack st = new Stack();
        st.push("P");
        st.push("D");
        st.push("A");
        st.push("A1");
        System.out.println(st.size());
        System.out.println(st);
        System.out.println(st.peek());
        System.out.println(st);
        System.out.println(st.pop());
        System.out.println(st);
        System.out.println(st.size());
        System.out.println(st.empty());
        System.out.println(st.add("Snehal"));
        System.out.println(st);
        st.add("C");
        st.push("V");
        System.out.println(st);


        st.add(0,"L");
        System.out.println(st);
        System.out.println(st.get(0));
        System.out.println(st.get(1));
    }
}
//Output
//[P, D]
//        4
//        [P, D, A, A1]
//A1
//[P, D, A, A1]
//A1
//[P, D, A]
//        3
//        false
//        true
//        [P, D, A, Snehal]
//        [P, D, A, Snehal, C, V]
//        [L, P, D, A, Snehal, C, V]
//L
//        P