package Lv0;

public class _28배열회전시키기 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};
        int[] answer = new int[numbers.length];
        String direction = "left";

        /**
         * answer[1] = numbers[0];
         * answer[2] = numbers[1];
         */
        if (direction.equals("right")) {
            answer[0] = numbers[numbers.length - 1];
            for (int i = 0; i < numbers.length-1; i++) {
                answer[i + 1] = numbers[i];
            }
        }
        /**
         * answer[0] = numbers[1];
         * answer[1] = numbers[2];
         */
        else{
            answer[2] = numbers[0];
            for (int i = numbers.length - 1; i > 0; i--) {
                answer[i - 1] = numbers[i];
            }
        }

        for (int x : answer) {
            System.out.println(x);
        }


    }




}