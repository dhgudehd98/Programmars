package Lv0;

import java.util.ArrayList;
import java.util.List;

/**
 *  - 1 * 2 * 3
 */
public class _42잘라서배열로저장하기 {
    public static void main(String[] args) {
        String my_str = "abc1Addfggg4556b";
        List<String> list = new ArrayList<>();
        int n = 6;

        for (int i = 0; i < my_str.length(); i += n) {
            int endIndex = Math.min(i + n, my_str.length());
            list.add(my_str.substring(i, endIndex));
        }

        System.out.println(list.toArray(new String[0]));

        for (String x : list.toArray(new String[0])) {
            System.out.println(x);
        }




    }




}