package Lv0;

import java.util.*;

public class _31중복문자제거 {
    public static void main(String[] args) {
        String my_string = "people";
        char[] chars = my_string.toCharArray();
        StringBuilder sb = new StringBuilder();
        Set<Character> set = new LinkedHashSet<>();

        for (char ch : chars) {
            set.add(ch);
        }

        for (char ch : set) {
            sb.append(ch);
        }

        System.out.println(sb.toString());




    }




}