package basicjavacodes;

import java.util.Stack;

public class ValidParenthesis {
    public static boolean isValid(String s) {
        char[] arr= new char[s.length()];
        boolean isValid=false;
            Stack<Character> stack= new Stack<>();

            for(int i =0;i<s.length();i++){
                arr[i]+=s.charAt(i);
            }
        stack.push(arr[0]);
        for(int i =0;i<arr.length;i++){
            if(arr[i]==')'&&stack.peek()=='('){
                stack.pop();
            }
            else if(arr[i]==']'&&stack.peek()=='['){
                stack.pop();
            }
            else if(arr[i]=='}'&&stack.peek()=='{'){
                stack.pop();
            }else{
                stack.push(arr[i]);
            }

        }
        if(stack.size()==0){
            isValid=true;
        }else {
            isValid=false;
        }

            return isValid;
    }

    public static void main(String[] args) {
        isValid("(){}}{");
    }
}
