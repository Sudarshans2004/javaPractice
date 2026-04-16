package collection.list;

import java.util.Vector;

public class Vectorr {
    public static void main(String[] args) {
        Vector v = new Vector<>();
        System.out.println( v.capacity());
        for(int i =0;i<10;i++){
            v.addElement(i);
        }
        System.out.println(v.capacity());
        v.remove(5);
        System.out.println(v);
        v.clear();
        System.out.println(v);
    }
}
