package collection.set;

import java.util.HashSet;

public class HashSett {
    public static void main(String[] args) {
        HashSet h = new HashSet<>();
        HashSet h1 = new HashSet(100);
        HashSet h2 = new HashSet(20,0.55f);
//        HashSet h3 = new HashSet(Collection c );
        h.add("a");
        h.add("C");
        h.add("D");
        h.add("Z");
        h.add(null);
        h.add(10);
        System.out.println(h.add("Z")); //false  dont add duplicate
        System.out.println(h);
    }
}
