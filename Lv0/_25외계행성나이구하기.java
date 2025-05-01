package Lv0;

public class _25외계행성나이구하기 {
    public static void main(String[] args) {
      int age = 23;
      String a = String.valueOf(age);
        String answer = "";
        char[] chars = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'};
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < a.length(); i++) {
            int num = a.charAt(i) - '0';
            sb.append(chars[num]);
        }

        System.out.println(sb.toString());
    }




}