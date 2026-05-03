package tcsnqtpyqs;
//N horses are listed in order. Bob wants to bet on a continuous sequence of horses, spending less than K units total.
// Find the maximum length of such a sequence.
//
//Examples:
//
//N=10, K=100, prices=30 40 50 20 20 10 90 10 10 10 → Output: 3
//N=10, K=100, prices=10 90 80 20 90 60 40 60 70 75 → Output: 1
//Constraints:
//
//2 ≤ N ≤ 10⁵
//1 ≤ K ≤ 10⁹
public class Question7 {
    public static void main(String[] args) {
        int[] prices = {10, 90, 80, 20, 90, 60, 40, 60, 70, 75};
        int sum = 0;
        int res = 0;
        int k = 100;

        int i = 0;
        int j = 0;
        while (i < prices.length) {
            sum = sum + prices[i];

            while (sum >= k) {        // ✅ changed > to >=
                sum = sum - prices[j]; // ✅ changed prices[i] to prices[j]
                j++;
            }

            res = Math.max(res, i - j + 1); // ✅ removed if condition (always true here)
            i++;
        }
        System.out.println(res);
    }
}