
package collection.stack;

import java.util.Stack;

public class StackLeetCode {

    public static int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < operations.length; i++) {

            if (operations[i].equals("C")) {
                stack.pop();

            } else if (operations[i].equals("D")) {
                int x = stack.peek();
                stack.push(x * 2);

            } else if (operations[i].equals("+")) {
                int last = stack.pop();
                int secondLast = stack.peek();

                stack.push(last);
                stack.push(last + secondLast);

            } else {
                stack.push(Integer.parseInt(operations[i]));
            }

            System.out.println(stack);
        }

        int result = 0;

        for (int score : stack) {
            result += score;
        }

        return result;
    }

    public static void main(String[] args) {
        String[] newStr = {"5", "-2", "4", "C", "D", "9", "+", "+"};

        System.out.println("Final Score: " + calPoints(newStr));
    }
}
