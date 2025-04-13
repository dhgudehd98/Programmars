package Lv0;

import java.util.Arrays;

public class _13암호해독 {

    /**
     *
     */
    public static void main(String[] args) {

        String cipher = "dfjardstddetckdaccccdegk"; //24
        String answer = "";
        int code = 4;

        for (int i = code; i <= cipher.length(); i += code) {
            System.out.println(i);
            answer += cipher.charAt(i-1);

        }
        System.out.println(answer);


    }



}