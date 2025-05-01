package Lv0;

import java.util.Arrays;

public class _33A로B만들기 {
    public static void main(String[] args) {
        String before = "allpe";
        String after = "apple";

        char[] b = before.toCharArray();
        char[] a = after.toCharArray();

        Arrays.sort(b);
        Arrays.sort(a);

        if(new String(b).equals(new String(a))) System.out.println(1);
        else System.out.println(0);



       
    }




}