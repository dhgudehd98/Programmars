package Lv0;

public class _08가위바위보 {

    /**
     * 가위 : 2 , 바위  : 0, 보 : 5
     * @param args
     */
    public static void main(String[] args) {

        String answer = "";
        String s = "2";
        String m = "0";
        String b = "5";
        StringBuilder sb = new StringBuilder();

        String rsp = "205";

        for (int i = 0; i < rsp.length(); i++) {
            char ch = rsp.charAt(i);

            if (ch == '2') {
                sb.append("0");
            } else if (ch == '0') {
                sb.append("5");
            }
            else{
                sb.append("2");
            }
        }
        answer = sb.toString();
        System.out.println(answer);




    }



}