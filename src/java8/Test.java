package java8;

import java.util.Arrays;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        Integer [] numbers = {1,2,3,4,5,6,7,8,9,10};
        Stream <Integer> streamOfInteger = Arrays.stream(numbers);
        streamOfInteger.filter(integer ->integer >5).forEach(num -> System.out.println(num));


        //Simplified

    }
}
