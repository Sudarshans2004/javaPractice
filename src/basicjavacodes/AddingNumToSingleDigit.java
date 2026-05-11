package basicjavacodes;

import java.util.ArrayList;

public class AddingNumToSingleDigit {
    public static void main(String[] args) {
        int num =0;
        while (num >= 10) {

            int result = 0;

            while (num > 0) {

                int digit = num % 10;
                result += digit;
                num /= 10;
            }

            num = result;
        }

        System.out.println(num); ;
    }

  String s = "Sudarshan shinde";
}
