package Lv0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class _10문자열정렬하기 {

    /**
     * box -> 0번째 가로 , 첫번째 세로 , 두번째 높이
     * box의 길이는 3
     * @param args
     */
    public static void main(String[] args) {

        String myString = "hj12392";
        myString = myString.replaceAll("[^0-9]", "");
        int[] array = new int[myString.length()];
//        List<Integer> list = new ArrayList<>();
//        Collections.sort(list);
        for (int i = 0; i < myString.length(); i++) {
            array[i] = myString.charAt(i) - '0';
        }

        Arrays.sort(array);

    }



}