package Lv0;

public class _29삼육구게임 {
    public static void main(String[] args) {
        int order = 103;
        int answer = 0;
        String string = String.valueOf(order);

        for (int i = 0; i < string.length(); i++) {
            int num = string.charAt(i) - '0';
            if(num !=0 && num % 3 == 0) answer++;
        }

        System.out.println(answer);
    }




}