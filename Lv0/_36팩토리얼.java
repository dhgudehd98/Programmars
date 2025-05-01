package Lv0;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *  - 1 * 2 * 3
 */
public class _36팩토리얼 {
    public static void main(String[] args) {
        int n =7;
        int answer = 0;
        int fact = 1;

        for (int i = 1; i <= n; i++) {
            fact *= i;

            if(fact > n){
                answer = i-1;
                break;
            } else if (fact == n) {
                answer = i;
                break;
            }
        }

        System.out.println(answer);
    }




}