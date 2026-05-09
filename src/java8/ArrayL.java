package java8;

import java.util.ArrayList;
import java.util.function.BiFunction;

public class ArrayL {
    public static void main(String[] args) {
        ArrayList <Integer> al = new ArrayList();
        BiFunction <ArrayList<Integer> ,Integer , Boolean> biFun = ArrayList ::add;
        Boolean isAdded = biFun.apply(al,10);
        System.out.println(isAdded);
        System.out.println(al);
    }
}
