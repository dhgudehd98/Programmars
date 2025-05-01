package Lv0;

import java.util.Arrays;

public class _21최댓값만들기 {

    /**
     *
     */
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        Arrays.sort(numbers);

        int answer = numbers[numbers.length - 1] * numbers[numbers.length - 2];
        System.out.println(answer);





    }




}