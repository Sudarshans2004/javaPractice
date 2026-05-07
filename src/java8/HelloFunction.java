package java8;

import javax.sound.midi.Soundbank;
import java.util.stream.Stream;

public class HelloFunction {
    public static void main(String[] args) {
        Stream.of("Hello" , "Stream" ,"API" ).forEach(stringObj -> System.out.println(stringObj));
    }
}
