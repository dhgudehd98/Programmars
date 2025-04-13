package Lv0;

public class _09주사위개수 {

    /**
     * box -> 0번째 가로 , 첫번째 세로 , 두번째 높이
     * box의 길이는 3
     * @param args
     */
    public static void main(String[] args) {
        int[] box = {10, 8, 6};
        int n = 3;

        int x = box[0] / n;
        int y = box[1] / n;
        int z = box[2] / n;

        int answer = x * y * 2 ;

        System.out.println(answer);
    }



}