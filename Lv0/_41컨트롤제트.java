package Lv0;

/**
 *  - 1 * 2 * 3
 */
public class _41컨트롤제트 {
    public static void main(String[] args) {
        String s = "-1 -2 Z 4";
        int answer = 0;

        String[] arr = s.split(" ");

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals("Z")) {
                answer -= Integer.parseInt(arr[i - 1]);
            }
            else{
                answer += Integer.parseInt(arr[i]);
            }
        }

        System.out.println(answer);


    }




}