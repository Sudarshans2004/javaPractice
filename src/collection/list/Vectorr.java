package collection.list;

import java.util.Vector;

public class Vectorr {
    public static void main(String[] args) {
        Vector v = new Vector<>();
        Vector v1 = new Vector(10);
        Vector v2 = new Vector(10,10);
//        Vector v3 = new Vector(Collection c );



        System.out.println( v.capacity());
        for(int i =0;i<10;i++){
            v.addElement(i);
        }
        System.out.println(v.capacity());
        v.remove(5);
        System.out.println(v);
        System.out.println(v.capacity());
        v.clear();
        System.out.println(v);
    }
}
