package Lv0;

import java.util.HashMap;
import java.util.Map;

/**
 * 1. 배열 돌면서 개수 count
 * 2. map으로 갯수 저장하기
 */
public class _01중복숫자개수 {
    // 1. 배열 돌면서 개수 count
//    public static void main(String[] args) {
//        int[] array = {1, 1, 2, 3, 4, 5};
//        int n = 6;
//        int answer = 0;
//        int cnt = 0;
//        for (int i = 0; i < array.length; i++) {
//            int num = array[i];
//
//            if(num == n) cnt++;
//        }
//
//        System.out.println(cnt);
//
//    }

    public static void main(String[] args) {
        int[] array = {1, 1, 2, 3, 4, 5};
        int n = 1;

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < array.length; i++) {
            map.put(array[i], map.getOrDefault(array[i], 0) + 1);
        }

        int answer = map.getOrDefault(n,0);
        System.out.println(answer);
    }
}