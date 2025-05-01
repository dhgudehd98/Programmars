package Lv0;

/**
 *  - 1 * 2 * 3
 */
public class _37숨어있는숫자덧셈 {
    public static void main(String[] args) {
        String my_string = "aAb1B2cC34oOp";
        String[] string = my_string.replaceAll("[^0-9]", ",").split(",");
        int answer = 0;

        for (int i = 0; i < string.length; i++) {
            if (!string[i].isEmpty()) {
                answer += Integer.parseInt(string[i]);
            }
        }
        System.out.println(answer);
    }




}