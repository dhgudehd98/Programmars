import java.util.*;

class Solution {
    public int[] solution(int[] num_list) {
        // 1. Collections 메소드 함수 사용하여 reverse
        int[] answer = {};
        List<Integer> reverse = new ArrayList<>();
        for(int x : num_list){
            reverse.add(x);
        }
        answer = new int[reverse.size()];
        
        Collections.reverse(reverse);
        
        for(int i = 0; i<answer.length; i++)
        {
            answer[i] = reverse.get(i);
        }
        
        return answer;
    }
}