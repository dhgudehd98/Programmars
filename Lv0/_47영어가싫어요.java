package Lv0;

/**
 *  - 1 * 2 * 3
 */
public class _47영어가싫어요 {
    public static void main(String[] args){
       String my_string = "31 + 4 - 2";
       String[] array = my_string.split(" ");
       int answer = Integer.parseInt(array[0]);

        for (int i = 1; i < array.length-1; i++) {
            String operator = array[i];
            int num = Integer.parseInt(array[i + 1]);

            if (operator.equals("+")) {
                answer += num;
            } else {
                answer -= num;
            }
        }
        System.out.println(answer);
    }
}