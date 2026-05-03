package tcsnqtpyqs;

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