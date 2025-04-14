package Lv0;

public class _15인덱스변경 {

    /**
     *
     */
    public static void main(String[] args) {
        String my_string = "hello";
        int num1 = 1;
        int num2 = 2;

        char[] chars = my_string.toCharArray();

        char temp = chars[num1];
        chars[num1] = chars[num2];
        chars[num2] = temp;

        String answer = new String(chars);
        System.out.println(answer);


    }



}