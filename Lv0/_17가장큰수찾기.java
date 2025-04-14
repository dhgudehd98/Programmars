package Lv0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class _17가장큰수찾기 {

    /**
     *
     */
    public static void main(String[] args) {
        int[] array = {1, 8, 3};
        int[] answer = new int[2];
        int max = Integer.MIN_VALUE;

        List<Integer> list = Arrays.stream(array).boxed().collect(Collectors.toList());

        for (int x : list) {
            if(x > max){
                max = x;
                answer[0] = max;
                answer[1] = list.indexOf(x);
            }
        }


        for (int x : answer) {
            System.out.println(x);
        }

    }




}