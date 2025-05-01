package Lv0;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/**
 *  - 1 * 2 * 3
 */
public class _43소인수분해 {
    public static void main(String[] args){
        int n = 17;
        Set<Integer> set = new LinkedHashSet<>();

        for (int i = 2; i <=n; i++) {
            while (n % i == 0) {
                set.add(i);
                n /= i;
            }
        }

        int[] answer = set.stream().mapToInt(Integer::intValue).toArray();
        for (int x : answer) {
            System.out.print(x + " ");
        }
    }
}