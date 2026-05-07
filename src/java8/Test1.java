package java8;

import java.util.stream.Stream;

public class Test1 {
    public static void main(String[] args) {
        Stream.generate(() -> "Hello Stream").limit(5).forEach(str -> System.out.println("printing string " + str));
    }
}
