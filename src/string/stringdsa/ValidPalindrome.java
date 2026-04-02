package string.stringdsa;
class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        sb.append(s);
        String s2=sb.reverse().toString().replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String s1 = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        if(s1.equals(s2)){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.isPalindrome("A man, a plan, a canal: Panama"));
    }
}