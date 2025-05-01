package Lv0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class _26배열자르기 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int n1 = 1;
        int n2 = 3;

        int[] answer = Arrays.copyOfRange(numbers, n1,n2+1);

    }




}