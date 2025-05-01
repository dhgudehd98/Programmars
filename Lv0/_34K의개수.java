package Lv0;

public class _34K의개수 {
    public static void main(String[] args) {
       int i = 1;
       int j = 13;
       int k = 1;
       int cnt = 0;

       String s1 = String.valueOf(k);

        for (int a = i; a <= j; a++) {
            String num = String.valueOf(a);

            for (char ch : num.toCharArray()) {
                if (String.valueOf(ch).equals(s1)) {
                    cnt++;
                }
            }
        }
        System.out.println(cnt);


    }




}