package Lv0;

import java.util.Arrays;

public class _12최댓값만들기 {

    /**
     *
     */
    public static void main(String[] args) {

        int[] numbers = {1, 2, -3, 4, -5};

        Arrays.sort(numbers);
        int answer = 0;
        int m1 = numbers[0] * numbers[1];
        int m2 = numbers[numbers.length - 1] * numbers[numbers.length - 2];

        if(m1 > m2) answer = m1;
        else answer = m2;

        System.out.println(answer);


    }



}