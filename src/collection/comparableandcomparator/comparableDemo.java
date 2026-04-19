package collection.comparableandcomparator;

import java.util.TreeSet;

//contains only one method compareTo
public class comparableDemo {

    public static void main(String[] args) {
        TreeSet <Integer> t = new TreeSet<>();
        t.add(10);

        t.add(20); // internally 10compareTo20 -ve obj 1 big obj 2  small
        t.add(5); // 10compareTo5 +ve obj1 big obj 2 big
        t.add(10);// 0 becoz obj1 == obj2

    }
}
