package Lv0;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 *  - 1 * 2 * 3
 */
public class _44이진수더하기 {
    public static void main(String[] args){
        String b1 = "10";
        String b2 = "11";

        // 이진수로 설정된 값을 10진수로 변경
        int a2 = Integer.parseInt(b2, 2);
        int a1 = Integer.parseInt(b1, 2);

        String answer = Integer.toBinaryString(a1 + a2);
    }
}