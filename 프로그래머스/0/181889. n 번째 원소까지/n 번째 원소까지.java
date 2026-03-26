import java.util.stream.IntStream;
class Solution {
//     public int[] solution(int[] num_list, int n) {
//         int[] answer = new int[n];
        
//         System.arraycopy(num_list,0,answer,0,n);
//         return answer;
//     }
    
    public int[] solution(int[] num_list, int n){
        return IntStream.range(0, n)
            .map(i -> num_list[i])
            .toArray();
    }
}