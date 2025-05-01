package Lv0;

/**
 *  - 1 * 2 * 3
 */
public class _38가까운수 {
    public static void main(String[] args) {
        int[] array = {5, 3};
        int n = 4;
        int min = Integer.MAX_VALUE;
        int answer = 0;

        for (int x : array) {
            int temp = Math.abs(x - n);

            if (temp < min) {
                min = temp;
                answer = x;
            }
        }

        System.out.println(answer);


    }




}