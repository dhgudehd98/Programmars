package Lv0;

import java.util.ArrayList;
import java.util.List;

public class _16약수구하기 {

    /**
     *
     */
    public static void main(String[] args) {
        int n = 24;

        int[] answer = {};

        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 24; i++) {
            if(n % i == 0) list.add(i);
        }
        answer = list.stream().mapToInt(Integer::intValue).toArray();
        for (int x : list) {
            System.out.println(x);
        }

    }




}