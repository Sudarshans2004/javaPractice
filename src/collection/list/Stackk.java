package collection.list;

import java.util.Stack;
/// Last in first out
public class Stackk {
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push("a"); //Insert
        s.push("b");
        s.push("c");
        s.push("d");
        System.out.println(s);
        System.out.println(s.pop()); // remove top and return top element
        System.out.println( s.peek());// give top element without removing
        System.out.println(s.search("c"));
        s.clear();  // rekama karte
        System.out.println(s.empty());
        System.out.println(s);// empty ahe kai check karte
    }
}
