package java8.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class BasicCodes {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,2,3,4,5);
//        1. Print all elements
        System.out.println(" Q 1 ");
        nums.stream().forEach(System.out::println);
//2. Find even numbers
        System.out.println(" Q2 ");
        nums.stream().filter(n -> n%2==0).forEach(System.out::println);
//        3. Find odd numbers
        System.out.println(" Q3 ");
        nums.stream().filter(n-> n%2!=0).forEach(System.out::println);
//        4. Convert all names to uppercase
        System.out.println(" Q4 ");
        List<String> names = Arrays.asList("sudarshan","java","spring");
        names.stream().map(name -> name.toUpperCase()).forEach(System.out::println);
//5. Count elements in a list
        System.out.println(" Q5 ");

        List<String> namess = Arrays.asList("A","B","C","D");
        long x = namess.stream().collect(Collectors.counting());
        System.out.println(x);

//        6. Find first element
        System.out.println(" Q6 ");

        System.out.println(nums.stream().findFirst().orElse(null));

//        7. Sort numbers ascending
        System.out.println(" Q7 ");

        List<Integer> sorting = Arrays.asList(8,3,5,1,9);
        sorting . stream().sorted().forEach(System.out::println);
//8. Sort numbers descending
        List<Integer> sortingDesc = Arrays.asList(8,3,5,1,9);
        System.out.println(" Q8 ");
        sorting . stream().sorted((s1,s2) -> -s1.compareTo(s2)).forEach(System.out::println);
//        Q9. Remove duplicates
        System.out.println(" Q9 ");
        List<Integer> remDupli = Arrays.asList(1,2,2,3,3,4,5,5);
        remDupli.stream().distinct().forEach(System.out::println);

//        Q10. Sum all numbers
        System.out.println(" Q10 ");
        int c=nums.stream().collect(Collectors.summingInt(n ->n));
        System.out.println(c);
    }
}
