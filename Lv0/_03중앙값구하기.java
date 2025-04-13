package Lv0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class _03중앙값구하기 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 7, 10, 11};
        int answer = 0;

        List<Integer> list = new ArrayList<>();
        list = Arrays.stream(arr).sorted().boxed().collect(Collectors.toList());

        int length = list.size() / 2;
        answer = list.get(length);

        System.out.println("answer : " + answer);
    }
}