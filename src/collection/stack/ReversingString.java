package collection.stack;

import java.util.Stack;

public class ReversingString {

    public static void main(String[] args) {
        Stack<String>stack = new Stack<>();

        String st = "Sudarshan Madhusudan Shinde;";
        String [] split = st.split(" ");
            System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        for(String str : split){
            stack.push(str);
        }

    }
}
