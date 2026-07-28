package array;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class Leetcode989 {

    class Solution {
        public List<Integer> addToArrayForm(int[] num, int k) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < num.length; i++) {
                sb.append(num[i]);
            }

            BigInteger x = new BigInteger(sb.toString());
            BigInteger res = x.add(BigInteger.valueOf(k));

            String s1 = res.toString();
            List<Integer> l2 = new ArrayList<>();
            for (int i = 0; i < s1.length(); i++) {
                l2.add(s1.charAt(i) - '0');
            }

            return l2;
        }
    }

}
class Solution {
    public static void main(String[] args) {
        Leetcode989 l4 = new Leetcode989();
        int x [] ={1,2,0,0};


    }
}