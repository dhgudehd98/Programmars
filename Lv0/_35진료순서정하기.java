package Lv0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class _35진료순서정하기 {
    public static void main(String[] args) {
        int[] emergency = {3, 76, 24}; // 반환값 : 3, 1, 2
        int[] answer = new int[emergency.length];


        List<Integer> list = new ArrayList<>();

        for (int x : emergency) { // 3, 76 , 24
            list.add(x);
        }
        list.sort(Collections.reverseOrder());


        for (int i = 0; i < emergency.length; i++) {
            answer[i] = list.indexOf(emergency[i]) + 1;
        }

        for (int x : answer) {
            System.out.print(x + " ");
        }
    }




}