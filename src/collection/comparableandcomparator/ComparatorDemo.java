package collection.comparableandcomparator;

import java.util.Comparator;
import java.util.TreeSet;

public class  ComparatorDemo {
    public static void main(String[] args) {
        TreeSet <Integer> t = new TreeSet<>(new MyComparator ());
        t.add(10);
        t.add(0);            // compare(0,10);+1
        t.add(15);            // compare(15,10);-1
        t.add(5);             //compare(5,10); +1
        System.out.println( t);
    }
}
class MyComparator implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
        Integer i1 = (Integer) o1;
        Integer i2 = (Integer) o2;

//        if(i1 > i2){
//          return +1;
//        } else if (i1< i2) {
//            return -1;
//        }else{
//            return 0;
//        }
//        return +1; //Insertion order
//        return -i1.compareTo(i2);
//          return -1; //reverse of insertion
        return i2.compareTo(i1); //descending order
    }
}