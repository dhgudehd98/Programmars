package Lv0;

/**
 *  - 1 * 2 * 3
 */
public class _40칠의개수 {
    public static void main(String[] args) {
        int[] array = {7, 17, 77};
        int num = 7;
        int count = 0;
        String numStr = String.valueOf(num);

        for (int x : array) {
            String a = String.valueOf(x);

            for (int i = 0; i < a.length(); i++) {
                int n = a.charAt(i) - '0';

                if(num == 7) count++;
            }
        }
        System.out.println(count);
    }




}