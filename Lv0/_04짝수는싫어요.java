package Lv0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class _04짝수는싫어요 {
    public static void main(String[] args) {
       int n = 11;
       int[] answer = {};
       // n이 짝수인지 홀수인지 뭔지 구분 먼저
        int length = 0;
        if (n % 2 == 0) length = n/ 2 ;
        else length = n/2 + 1;

        answer = new int[length];
        // 어처피 첫번쨰는 1로 고정 제일 작은 홀수 = 1
        answer[0] = 1;

        for (int i = 1; i < answer.length; i++) {
            answer[i] = answer[i-1] + 2;
        }


    }
}