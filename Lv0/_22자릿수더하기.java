package Lv0;

import java.util.Arrays;

public class _22자릿수더하기 {

    /**
     *
     */
    public static void main(String[] args) {
        int n = 12345;

        String string = String.valueOf(n);

        int answer = 0;
        for (int i = 0; i < string.length(); i++) {
            answer += (char)(string.charAt(i) - '0');
        }

        System.out.println(answer);





    }




}