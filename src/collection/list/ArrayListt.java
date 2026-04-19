package collection.list;

import java.util.ArrayList;

public class ArrayListt {
    public static void main(String[] args) {

        ArrayList<Integer> l = new ArrayList<>();
//        ArrayList l1 = new ArrayList();
        for(int i = 0; i < 10; i++){
            l.add(i);
        }

        System.out.println(l);
        l.remove(2);
        l.add(5,null);
        l.add(3,12);
        System.out.println(l.get(9));
        System.out.println(l);
    }
}