package Lv0;

import java.util.Arrays;

public class _11숨어있는숫자의덧셈 {

    /**
     *
     */
    public static void main(String[] args) {
        String string = "aAb1B2cC34oOp";
        int answer = 0;

        string = string.replaceAll("[^0-9]", "");

        for (int i = 0; i < string.length(); i++) {
            System.out.println(string.charAt(i));
            answer += string.charAt(i) - '0';
        }

        System.out.println(answer);


    }



}