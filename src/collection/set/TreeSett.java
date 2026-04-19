package collection.set;

import com.sun.source.tree.Tree;

import java.util.*;

public class TreeSett {
    public static void main(String[] args) {
        TreeSet set = new TreeSet();
//        TreeSet t1 = new TreeSet(Comparator c )
//        TreeSet t2 = new TreeSet(Collection c);
//        TreeSet t3 = new TreeSet(SortedSet s);
        set.add(40);
        set.add(20);
        set.add(60);
        set.add(10);

        System.out.println("Set: " + set);
        System.out.println("First: " + set.first());
        System.out.println("Last: " + set.last());

        set.pollFirst();
        set.pollLast();
        set.first();
        set.last();
        set.contains(20);
        set.remove(20);
        System.out.println("After removing smallest: " + set);
        TreeSet t = new TreeSet<>( Collections.reverseOrder());
        t.add(10);
        t.add(20);
        t.add(30);


    }
}
