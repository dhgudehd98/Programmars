package Lv0;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 *  - 1 * 2 * 3
 */
public class _39한번만등장한문자 {
    public static void main(String[] args) {
        String s = "abcabcadc";
        StringBuilder sb = new StringBuilder();

        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }

        for (char c : map.keySet()) {
            if(map.get(c) == 1) sb.append(String.valueOf(c));
        }
        String answer = sb.toString();
        char[] ch = answer.toCharArray();
        Arrays.sort(ch);


    }




}