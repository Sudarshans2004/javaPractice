package basicjavacodes;

public class HarshadNumber {
    private static int sumOfTheDigitsOfHarshadNumber(int x) {
        int num =0;
        int result = 0;
        int y=x;
        while (y >= 1) {
            num = y % 10;
            result += num;
            y = y / 10;
        }
        if (x % result == 0) {
            System.out.println(result);
            return result;
        }
        return -1;
    }

    public static void main(String[] args) {
        sumOfTheDigitsOfHarshadNumber(18);
    }
}
