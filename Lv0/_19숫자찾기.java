package Lv0;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class _19숫자찾기 {

    /**
     *
     */
    public static void main(String[] args) {
        int num  = 29183;
        int k = 1;

        String string = String.valueOf(num);
        char[] chars = string.toCharArray();
        char target = (char) (k + '0');

        for (int i = 0; i < string.length(); i++) {
            if (target == string.charAt(i)) {
//                return i+1;
            }
        }
//        return -1;




    }




}