package collection.list;

import java.util.LinkedList;

public class LinkedListt {
    public static void main(String[] args) {
        LinkedList l = new LinkedList<>();
//        LinkedList l1 = new LinkedList<>(collection c );
        for(int i =0;i<10;i++){
            l.add(i);

        }
        System.out.println(l);
        System.out.println(l.getFirst());
        System.out.println(l.getLast());
        l.removeFirst();
        l.removeLast();
        l.addFirst("a");
        l.addLast("z");
        System.out.println(l);
        l.add(4,null);
    }
}
