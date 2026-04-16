package collection.set;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSett {
    public static void main(String[] args) {
        TreeSet t = new TreeSet();
//        TreeSet t1 = new TreeSet(SortedSet s);
//        TreeSet t1 = new TreeSet(Collection c );
//        TreeSet t1 = new TreeSet(Comparator c);

        t.add(10);
        t.add(5);
        t.add(20);
        t.add(20);t.add(50);t.add(70);t.add(90);
//        t.add("sud");
        System.out.println( t);//store in sorted manner def ascending
        System.out.println(t.first());
        System.out.println( t.last());
        System.out.println(t.headSet(50));
        System.out.println(t.tailSet(50)); //returns element and greater than that element
    }
}
