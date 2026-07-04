package java8.streamapi;

import java.util.*;
import java.util.stream.Collectors;

public class MoreCodes {
    public static void main(String[] args) {
        //     Q21. Find Duplicate Elements
        System.out.println("  Q21  ");
        List<Integer> nums = Arrays.asList(1,2,3,2,4,5,1);
        Set <Integer> set = new HashSet<>();
        List <Integer> res = nums.stream().filter(n->!set.add(n)).collect(Collectors.toList());
        System.out.println(res);


//        Q22. Find First Non-Repeated Character
        System.out.println("  Q22  ");
        String str = "swiss";
        char [] c = str.toCharArray();
        Set<Character> ans = new HashSet<>();
        char ch = str.chars().mapToObj(n->(char)n ).filter(n->!ans.add(n)).findFirst().orElse(null);
        System.out.println(ch);

//        Q23. Find First Repeated Character
        String s = "programming";
        char[] cha = s.toCharArray();
        Set <Character> sett = new HashSet<>();
        System.out.println(s.chars().mapToObj(n->(char)n).filter(n->!sett.add(n)));

    }
}
