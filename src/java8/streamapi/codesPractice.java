package java8.streamapi;

import java.util.*;
import java.util.stream.Collectors;

public class codesPractice {
    public static void main(String[] args) {
//        11. Find maximum number
        List<Integer> nums = Arrays.asList(10,20,30,40);
//        Optional<Integer> max = nums.stream().max(Integer::compareTo);
//        System.out.println(max);
        System.out.println("  Q 11 ");
        System.out.println(nums.stream().max(Integer::compareTo).orElse(null));
//        Q12. Find Minimum Number
        System.out.println("  Q 12 ");
        System.out.println(nums.stream().min(Integer::compareTo).orElse(null));

//        Q13. Find Second Highest Number
        System.out.println("  Q 13 ");
        System.out.println(nums.stream().sorted(Comparator.reverseOrder())
                .skip(1).findFirst().orElse(null));

//        Q14. Find Second Smallest Number
        System.out.println(" Q 14 ");
        System.out.println(nums.stream().sorted(Comparator.reverseOrder()).skip(1)
                .findFirst().orElse(null));
//        Q15. Count Strings Starting With 'A'
        System.out.println(" Q 15");
        List<String> names = Arrays.asList(
                "Apple",
                "Banana",
                "Avocado",
                "Orange",
                "Apricot"
        );
        System.out.println(names.stream().filter(n-> n.toLowerCase().charAt(0)=='a' ).count());
//        Q16. Find Strings With Length Greater Than 5
        System.out.println("  Q 16 ");
        System.out.println(names.stream().filter(n->n.length()>5).collect(Collectors.toList()));

//        Q17. Find Average Of Numbers
        System.out.println("Q 17 ");
        System.out.println(nums.stream().collect(Collectors.averagingInt(Integer::intValue)));

//        Q18. Find Numbers Greater Than 50
        System.out.println(" Q 18 ");
        List<Integer> numss = Arrays.asList(20, 60, 70, 30, 80);
        System.out.println(numss.stream().filter(n->n>50).collect(Collectors.toList()));

        System.out.println(" Q 19 ");
//        Q19. Join Strings Using Comma
        List<String> naames = Arrays.asList(
                "Java",
                "Spring",
                "Hibernate"
        );
        System.out.println(naames.stream().collect(Collectors.joining(",")));

//        Q20. Find Frequency Of Each Character
        System.out.println(" Q 20 ");
        String str = "Sudarshan";
        Map <Character,Long> freq = str.chars().mapToObj(c -> (char)c)
                .collect(Collectors.groupingBy(c->c,Collectors.counting()));
        System.out.println(freq);
    }
}
