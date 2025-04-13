package Lv0;

public class _02배열두배만들기 {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};

        int[] answer = new int[numbers.length];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = numbers[i] * 2;
        }
        for(int x : answer){
            System.out.print(" x : " + x);
            System.out.println();
        }
    }
}