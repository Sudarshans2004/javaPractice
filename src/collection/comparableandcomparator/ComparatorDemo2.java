package collection.comparableandcomparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Studentt {
    int id;
    String name;

    Studentt( int id , String name){
        this.id=id;
        this.name= name;
    }
    public String toString(){
        return id+" "+name;
    }
}
class MyComparatorr implements Comparator <Studentt>{

    public int compare(Studentt s1, Studentt s2) {
        return -s1.name.compareTo(s2.name);
    }
}

public class ComparatorDemo2 {
    public static void main(String[] args) {
        ArrayList <Studentt> al = new ArrayList<>();
     al.add(new Studentt(1,"Sudarshan"));
     al.add(new Studentt (2,"Sumit"));
     al.add(new Studentt(3,"Nikhil"));
        System.out.println(al);
        Collections.sort(al,new MyComparatorr());
        for(Studentt s :al ){
            System.out.println(s);
        }
    }
}
