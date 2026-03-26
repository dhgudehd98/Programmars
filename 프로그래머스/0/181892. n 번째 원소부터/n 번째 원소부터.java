import java.util.stream.IntStream;
class Solution {
//     public int[] solution(int[] num_list, int n) {
//         int[] answer = new int[num_list.length - n + 1];
        
//         System.arraycopy(num_list,n-1,answer,0,num_list.length-(n-1));
//         return answer;
//     }
    public int[] solution(int[] num_list, int n) {
        return IntStream.range(n - 1, num_list.length)
            .map(i -> num_list[i])
            .toArray();
    }
}