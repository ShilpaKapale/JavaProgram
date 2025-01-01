package Nov.ex21112024_Linkedlist_Set;

import java.util.PriorityQueue;

public class Task_Queue {
    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue();

        pq.offer("111");
        pq.offer("333");
        pq.offer("222");
        pq.offer("444");


        System.out.println(pq);
        System.out.println(pq.peek());
        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq);
    }
}
//output
//[111, 333, 222, 444]
//        111
//        [111, 333, 222, 444]
//        111
//        [222, 333, 444]