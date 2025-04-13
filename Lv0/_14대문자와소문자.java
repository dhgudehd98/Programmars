package Lv0;

public class _14대문자와소문자 {

    /**
     *
     */
    public static void main(String[] args) {

        String string = "ccCC";
        StringBuilder sb = new StringBuilder();

        for (char ch : string.toCharArray()) {
            if(Character.isLowerCase(ch)) sb.append(Character.toUpperCase(ch));
            else sb.append(Character.toLowerCase(ch));
        }

        System.out.println(sb.toString());


    }



}