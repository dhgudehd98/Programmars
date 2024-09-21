import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int n, int[] numlist) {
        int[] answer = {};
        
         List<Integer> list = new ArrayList<>();
        
        for(int x : numlist){
            if(x % n == 0) list.add(x);
        }
        
        answer = new int[list.size()];
        
        for(int i = 0 ; i<answer.length; i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}