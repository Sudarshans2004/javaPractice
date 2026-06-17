package java8.streamapi;

import java.util.ArrayList;

public class BasicCode1 {
    public static void main(String[] args) {
        ArrayList <Integer>l = new ArrayList<Integer>();
        l.add(10);
        l.add(20);
        l.add(70);
        l.add(15);
        l.add(25);
        Integer [] i = l.stream().toArray(Integer[] ::new);
        for(Integer i1 : i){
            System.out.println(i1);
        }
    }
}
