package Lv0;

/**
 *  - 1 * 2 * 3
 */
public class _45공던지기 {
    public static void main(String[] args){
        int[] number = {1, 2, 3, 4};
        int n = 5;

        int index = 0;
        /**
         * i = 1 : 2 % 4 -> 2
         * i = 2 : 4 % 4 -> 0
         */
        for (int i = 1; i < n; i++) {
            index = (index + 2) % number.length;
        }
    }
}