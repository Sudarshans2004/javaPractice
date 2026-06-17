package java8.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class groupBy {
    public static void main(String[] args) {
        List<String> names = Arrays.asList(
                "Rajesh", "Suresh", "Amit", "Rohan", "Mahesh"
        );

        Map<Integer, List<String>> map = names.stream().collect(Collectors.groupingBy(String::length));
        System.out.println(map);
    }
}
