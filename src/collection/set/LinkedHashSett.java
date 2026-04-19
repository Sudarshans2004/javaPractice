package collection.set;

import java.util.LinkedHashSet;

public class LinkedHashSett {
    public static void main(String[] args) {
        LinkedHashSet < Integer> set = new LinkedHashSet();
        set .add(20);
        set.add(50);
        set.add(30);
        set.add(10);// duplicate ignored
        System.out.println( "Set : " +set );

        set.remove(30);
        System.out.println( " after remove Set : " +set );

        System.out.println(set.contains(40));

    }
}
