package Lv0;

public class _32차원으로만들기 {
    public static void main(String[] args) {
        int[] num_list = {1, 2, 3, 4, 5, 6, 7, 8};
        int n = 2;
        int index = 0;

        int[][] answer = new int[num_list.length / 2][2];

        for(int i = 0; i< answer.length; i++){
            for(int j = 0; j<answer[j].length; j++){
                answer[i][j] = num_list[index++];
                System.out.print(answer[i][j]);
            }
            System.out.println();
        }


    }




}