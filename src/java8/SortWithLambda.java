package java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortWithLambda {

    public static void main(String[] args) {
        List <Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        Collections.sort(list,(a,b)-> -a.compareTo(b));
        System.out.println(list);
    }
}
