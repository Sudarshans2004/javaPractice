package collection.queue;

import java.util.LinkedList;
import java.util.Queue;

public class Queuee {
    public static void main(String[] args) {
        Queue<String> q = new LinkedList<>();

        q.add("Sudarshan");
        q.add("Pradeep");
        q.add("Sumit");
        q.add("Nikhil");

        System.out.println("head element of Queue :" + q.element());
        q.remove(); // removes head element
        q.offer("Siddesh");
        System.out.println("After adding one element" + q);
        System.out.println( q.peek());// retrive element at the end not removed
        System.out.println("After peek :" + q);
        System.out.println( q.poll()); // here element at top is removed
        System.out.println(q);
    }
}
